
// **** Game Project ****
// 08, Oct 2021

// <전체 구성 메뉴>
// 1. 프리미어 리그 팀 소개
// 2. 1R씩 시작. 각 라운드를 유저가 시작할 수 있게 설계
// 3. 현재 라운드 결과와 현재까지의 점수 랭킹을 볼 수 있는 메뉴
// 4. 최종 순위 출력 및 챔스 진출팀, 유로파 진출팀 명시


import java.util.*;

// p.576 참고
class EPL_Team implements Comparable<EPL_Team> {
    private final String name; // name of the team
    private final int value; // power of the team
    private int score; // 해당 경기에서 얻은 골
    private int totalScore = 0; // 승점

    // 팀 이름, 능력치 초기화
    public EPL_Team(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

    // 능력치 기준 매 경기마다 점수 결정
    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    // 승점 쌓기
    public void setTotalScore(int totalScore) {
        this.totalScore += totalScore;
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    public void getResult() {
        System.out.printf("%20s : %d\n", this.name, totalScore);
    }

    @Override
    public String toString() {
        return name + " : " + totalScore;    // 추후 제대로 양식 갖춰서 수정
    }

    @Override
    public int compareTo(EPL_Team p) {
        return p.totalScore - this.totalScore;
    }
}

class Play {
    static int COUNT = 1;
    static void playGame(List<EPL_Team> team, Deque<EPL_Team> deq) {
        for(EPL_Team e : team) {
            Random rand1 = new Random(System.currentTimeMillis() + e.getValue());
            int rand2 = rand1.nextInt(5) + e.getValue()/20 - 1;
            e.setScore(rand2);
        }

        // Deque을 초기화
        if(COUNT<20) {
            for (int i = 0; i < 20; i++)
                deq.offerFirst(team.get(i));

            // 여기서는 배열을 하나씩 밀어내면서 총 19번의 경기를 두번 씩, 총 38 경기를 치르게 만드는 코드.
            for (int i = 0; i < COUNT - 1; i++) {
                deq.pollLast();
            }
            for (int i = 0; i < COUNT - 1; i++) {
                deq.offerFirst(team.get(i));
            }
        } else if(COUNT<39) {
            for (int i = 0; i < 20; i++)
                deq.offerFirst(team.get(i));

            // 여기서는 배열을 하나씩 밀어내면서 총 19번의 경기를 두번 씩, 총 38 경기를 치르게 만드는 코드.
            for (int i = 0; i < (COUNT-19) - 1; i++) {
                deq.pollLast();
            }
            for (int i = 0; i < (COUNT-19) - 1; i++) {
                deq.offerFirst(team.get(i));
            }
        }

        // 양 극단 대상을 확인 후 둘을 매칭 시키고 둘 다 빼냄. 이 과정을 10번 반복하면 전부 빠져나옴.
        // 통 속의 배열 순서는 신경 안 쓰고 오로지 계산만 하는 코드.
        for(int i=0; i<10; i++) {
            if(deq.getFirst().getScore() > deq.getLast().getScore()) {
                deq.getFirst().setTotalScore(3);
            } else if (deq.getLast().getScore() > deq.getFirst().getScore()) {
                deq.getLast().setTotalScore(3);
            } else {
                deq.getFirst().setTotalScore(1);
                deq.getLast().setTotalScore(1);
            }
            deq.pollFirst();
            deq.pollLast();
        }


    }
}

class FIFA {
    public static void main(String[] args) {
        List<EPL_Team> team = new ArrayList<>();
        team.add(new EPL_Team("Manchester City", 86));
        team.add(new EPL_Team("Manchester United", 74));
        team.add(new EPL_Team("Liverpool", 69));
        team.add(new EPL_Team("Chelsea", 67));
        team.add(new EPL_Team("Leicester City", 66));
        team.add(new EPL_Team("West Ham United", 65));
        team.add(new EPL_Team("Tottenham", 62));
        team.add(new EPL_Team("Arsenal", 61));
        team.add(new EPL_Team("Leeds United", 59));
        team.add(new EPL_Team("Everton", 59));
        team.add(new EPL_Team("Aston Villa", 55));
        team.add(new EPL_Team("Newcastle United", 45));
        team.add(new EPL_Team("Wolves", 45));
        team.add(new EPL_Team("Crystal Palace", 44));
        team.add(new EPL_Team("Southampton", 43));
        team.add(new EPL_Team("Brighton", 41));
        team.add(new EPL_Team("Burnley", 39));
        team.add(new EPL_Team("Watford", 28));
        team.add(new EPL_Team("Brentford", 26));
        team.add(new EPL_Team("Norwich City", 23));

        Deque<EPL_Team> deq = new ArrayDeque<>();

        outer: while(true) {
            System.out.println("******* Choose Menu *******");
            System.out.println("1. All of English Premier League Teams");
            System.out.println("2. Play this round");
            System.out.println("3. **** Ranking ****");
            System.out.println("4. END this game");
            System.out.println();

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int src = Integer.parseInt(sc.nextLine());

            switch(src) {
                case 1:
                    for(EPL_Team p : team)
                        System.out.println(p.getName());
                    System.out.println();
                    break;
                case 2:
                    Play.playGame(team, deq);
                    System.out.printf("%d번째 게임\n", Play.COUNT);
                    Play.COUNT++;
                    System.out.println();
                    break;
                case 3:
                    for(EPL_Team p : team)
                        p.getResult();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("The end of the game!");
                    System.out.println();
                    break outer;
                default:
                    System.out.println("Wrong number");
                    System.out.println();
                    break;

            }

            if(Play.COUNT >= 39) {
                System.out.println("이번 시즌 모든 경기가 종료되었습니다.");
                System.out.print("결과를 보시려면 1번을 눌러주세요: ");
                Scanner sc2 = new Scanner(System.in);
                int src2 = Integer.parseInt(sc2.nextLine());

                if (src2 == 1) {
                    Collections.sort(team);
                    for (EPL_Team p : team)
                        p.getResult();
                    System.out.println();

                } else {
                    System.out.println("The end of the game!");
                    System.out.println();
                    break outer;
                }
            }
        }
    }
}

// 이제 스코어를 냈으니, 시합을 시켜서 1.승패 2.총 승점을 구하기만 하면 된다.












