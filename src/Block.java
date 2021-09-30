// *** 열혈 자바 프로그래밍 ***
// Start at 30, Sept 2021

//class Constants {
//    public static void main(String[] args) {
//        final int MAX_SIZE = 100;
//        final char CONST_CHAR = '상';
//        final int CONST_ASSIGNED;
//        CONST_ASSIGNED = 12;
//
//        System.out.println("상수1 : " + MAX_SIZE);
//        System.out.println("상수2 : " + CONST_CHAR);
//        System.out.println("상수3 : " + CONST_ASSIGNED);
//    }
//}


//class CompAssignOp {
//    public static void main(String[] args) {
//        short num = 10;
//        num = (short)(num + 77L);
//        int rate = 3;
//        rate = (int)(rate * 3.5);
//        System.out.println(num);
//        System.out.println(rate);
//
//        num = 10;
//        num += 77L;
//        rate = 3;
//        rate *= 3.5;
//        System.out.println(num);
//        System.out.println(rate);
//    }
//}


//class SwitchBasic {
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
//
//        System.out.println("Do you like Java?");
//    }
//}


//class MethodReturns {
//    public static void main(String[] args) {
//        int result;
//        result = adder(4, 5);
//        System.out.println("4 + 5 = " + result);
//        System.out.println("3.5 x 3.5 = " + square(3.5));
//    }
//
//    public static int adder(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static double square(double num) {
//        return num*num;
//    }
//}


//class BankAccount {
//    int balance = 0;
//
//    public void deposit(int amount) {
//        balance += amount;
//    }
//
//    public void withdraw(int amount) {
//        balance -= amount;
//    }
//
//    public void checkMyBalance() {
//        System.out.println("잔액 : " + balance);
//    }
//}
//
//class BankAccount00 {
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


//class BankAccount {
//    String accNumber;
//    String ssNumber;
//    int balance = 0;
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
//        System.out.println("계좌번호 : " + accNumber);
//        System.out.println("주민번호 : " + ssNumber);
//        System.out.println("잔   액 : " + balance + '\n');
//    }
//}
//
//class BankAccountConstructor {
//    public static void main(String[] args) {
//        BankAccount yoon = new BankAccount("12-34-89", "990990-9090990", 10000);
//        BankAccount park = new BankAccount("33-55-09", "770088-5945454", 10000);
//
//        yoon.deposit(5000);
//        park.deposit(3000);
//        yoon.withdraw(2000);
//        park.withdraw(2000);
//        yoon.checkMyBalance();
//        park.checkMyBalance();
//    }
//}


//class SinusCap {
//    void sniTake() {
//        System.out.println("Kotmul");
//    }
//    void sneTake() {
//        System.out.println("Jaechae");
//    }
//    void snuTake() {
//        System.out.println("Koga");
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


//class SinivelCap {
//    void take() {
//        System.out.println("Kotmul");
//    }
//}
//
//class SneezeCap {
//    void take() {
//        System.out.println("Jaechae");
//    }
//}
//
//class SnuffleCap {
//    void take() {
//        System.out.println("Koga");
//    }
//}
//
//class SinusCap {
//    SinivelCap siCap = new SinivelCap();
//    SneezeCap szCap = new SneezeCap();
//    SnuffleCap sfCap = new SnuffleCap();
//
//    void take() {
//        siCap.take();
//        szCap.take();
//        sfCap.take();
//    }
//}
//
//class ColdPatient {
//    void takeSinus(SinusCap cap) {
//        cap.take();
//    }
//}
//
//class CompEncapsulation {
//    public static void main(String[] args) {
//        ColdPatient suf = new ColdPatient();
//        suf.takeSinus(new SinusCap());
//    }
//}


class Man {
    String name;

    public Man(String name) {
        this.name = name;
    }

    public void tellYourName() {
        System.out.println("My name is " + name);
    }
}

class BusinessMan extends Man {
    String company;
    String position;

    public BusinessMan(String name, String company, String position) {
        super(name);
        this.company = company;
        this.position = position;
    }

    public void tellYourInfo() {
        System.out.println("My company is " + company);
        System.out.println("My position is " + position);
        tellYourName();
    }
}

class MyBusinessMan {
    public static void main(String[] args) {
        BusinessMan man = new BusinessMan("YOON", "Hybrid ELD", "Staff Eng.");
        man.tellYourInfo();
    }
}

// p,350


























































