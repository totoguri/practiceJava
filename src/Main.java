//class SwitchBreak {
//    public static void main(String[] args) {
//        int n = 3;
//
//        switch(n) {
//            case 1:
//                System.out.println("Simple Java");
//                break;
//            case 2:
//                System.out.println("Funny Java");
//                break;
//            case 3:
//                System.out.println("Fantastic Java");
//                break;
//            default:
//                System.out.println("The best programming language");
//        }
//        System.out.println("Do you like Java?");
//    }
//}


//class MethodReturns {
//    public static void main(String[] args) {
//        int result;
//        result = adder(4, 5);
//        System.out.println("4 + 5 = " +result);
//        System.out.println("3.5 x 3.5 = " + square(3.5));
//    }
//
//    public static int adder(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static double square(double num) {
//        return num * num;
//    }
//}


//class BankAccount {
//    int balance = 0;
//
//    public void deposit(int amount) {
//        balance += amount;
//    }
//    public void withdraw(int amount) {
//        balance -= amount;
//    }
//    public void checkMyBalance() {
//        System.out.println("잔액 : " + balance);
//    }
//}
//
//class Bank {
//    public static void main(String[] args) {
//        BankAccount yoon = new BankAccount();
//        BankAccount park = new BankAccount();
//
//        yoon.deposit(5000);
//        park.deposit(3000);
//
//        yoon.withdraw(2000);
//        park.withdraw(2000);
//
//        yoon.checkMyBalance();
//        park.checkMyBalance();
//    }
//}

// p.163


//class BankAccount {
//    int balance = 0;
//
//    public int deposit(int amount) {
//        balance += amount;
//        return balance;
//    }
//    public int withdraw(int amount) {
//        balance -= amount;
//        return balance;
//    }
//    public int checkMyBalance() {
//        System.out.println("잔액: " + balance);
//        return balance;
//    }
//}
//
//class DupRef {
//    public static void main(String[] args) {
//        BankAccount ref1 = new BankAccount();
//        BankAccount ref2 = ref1;
//
//        ref1.deposit(3000);
//        ref2.deposit(2000);
//        ref1.withdraw(400);
//        ref2.withdraw(300);
//        ref1.checkMyBalance();
//        ref2.checkMyBalance();
//    }
//}


//class BankAccount {
//    int balance = 0;
//
//    public int deposit(int amount) {
//        balance += amount;
//        return balance;
//    }
//    public int withdraw(int amount) {
//        balance -= amount;
//        return balance;
//    }
//    public int checkMyBalance() {
//        System.out.println("잔액: " + balance);
//        return balance;
//    }
//}
//
//class PassingRef {
//    public static void main(String[] args) {
//        BankAccount ref = new BankAccount();
//        ref.deposit(3000);
//        ref.withdraw(300);
//        check(ref);
//    }
//
//    public static void check(BankAccount acc) {
//        acc.checkMyBalance();
//    }
//}

// p.166


//class FirstStringIntro {
//    public static void main(String[] args) {
//        String str1 = "happy";
//        String str2 = "birthday";
//        System.out.println(str1 + " " + str2);
//
//        printString(str1);
//        printString(" ");
//        printString(str2);
//        printString("\n");
//        printString("Ënd of program! \n");
//    }
//
//    public static void printString(String str) {
//        System.out.print(str);
//    }
//}


//class BankAccount {
//    String accNumber;
//    String ssNumber;
//    int balance;
//
//    public BankAccount(String acc, String ss, int bal) {
//        accNumber = acc;
//        ssNumber = ss;
//        balance = bal;
//    }
//    public void deposit(int amount) {
//        balance += amount;
//    }
//    public void withdraw(int amount) {
//        balance -= amount;
//    }
//    public void checkMyBalance() {
//        System.out.println("계좌번호: " + accNumber);
//        System.out.println("주민번호: " + ssNumber);
//        System.out.println("잔   액: " + balance + '\n');
//    }
//}
//
//class BankAccountUniID {
//    public static void main(String[] args) {
//        BankAccount yoon = new BankAccount("12-34-89", "990990-9090990", 10000);
//        BankAccount park = new BankAccount("33-55-09", "770088-5959007", 10000);
//
//        yoon.deposit(5000);
//        park.deposit(3000);
//        yoon.withdraw(2000);
//        park.withdraw(2000);
//        yoon.checkMyBalance();
//        park.checkMyBalance();
//    }
//}


// p.175


//class Circle {
//    private double rad = 0;
//    final double PI = 3.14;
//
//    public Circle(double r) {
//        setRad(r);
//    }
//    public void setRad(double r) {
//        if(r < 0) {
//            rad = 0;
//            return;
//        }
//        rad = r;
//    }
//    public double getRad() {
//        return rad;
//    }
//    public double getArea() {
//        return (rad*rad)*PI;
//    }
//}
//
//class InfoHideCircle {
//    public static void main(String[] args) {
//        Circle circle = new Circle(1.5);
//        System.out.println("반지름: " + circle.getRad());
//        System.out.println("넓 이: " + circle.getArea() + "\n");
//
//        circle.setRad(3.4);
//        System.out.println("반지름: " + circle.getRad());
//        System.out.println("넓 이: " + circle.getArea());
//    }
//}

// p.201


//class SinusCap {
//    void sniTake() {
//        System.out.println("Kotmul");
//    }
//    void sneTake() {
//        System.out.println("Jaechae");
//    }
//    void snuTake() {
//        System.out.println("KoBbung");
//    }
//
//    void take() {
//        sniTake();
//        sneTake();
//        snuTake();
//    }
//}
//
//class ColdPatient {
//    void takeSinus(SinusCap cap) {
//        cap.take();
//    }
//}
//
//class OneClassEncapsulation {
//    public static void main(String[] args) {
//        ColdPatient suf = new ColdPatient();
//        suf.takeSinus(new SinusCap());
//    }
//}


class SinivelCap {
    void take() {
        System.out.println("Kotmul");
    }
}

class SneezeCap {
    void take() {
        System.out.println("Jaechae");
    }
}

class SnuffleCap {
    void take() {
        System.out.println("KoBbung");
    }
}

class SinusCap {
    SinivelCap siCap = new SinivelCap();
    SneezeCap szCap = new SneezeCap();
    SnuffleCap sfCap = new SnuffleCap();

    void take() {
        siCap.take(); szCap.take(); sfCap.take();
    }
}

class ColdPatient {
    void takeSinus(SinusCap cap) {
        cap.take();
    }
}

class CompEncapsulation {
    public static void main(String[] args) {
        ColdPatient suf = new ColdPatient();
        suf.takeSinus(new SinusCap());
    }
}