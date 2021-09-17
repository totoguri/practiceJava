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


class BankAccount {
    int balance = 0;

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }
    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }
    public int checkMyBalance() {
        System.out.println("잔액: " + balance);
        return balance;
    }
}

class PassingRef {
    public static void main(String[] args) {
        BankAccount ref = new BankAccount();
        ref.deposit(3000);
        ref.withdraw(300);
        check(ref);
    }

    public static void check(BankAccount acc) {
        acc.checkMyBalance();
    }
}

// p.166