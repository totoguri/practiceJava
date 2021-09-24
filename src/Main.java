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
//        System.out.println("KoBbung");
//    }
//}
//
//class SinusCap {
//    SinivelCap siCap = new SinivelCap();
//    SneezeCap szCap = new SneezeCap();
//    SnuffleCap sfCap = new SnuffleCap();
//
//    void take() {
//        siCap.take(); szCap.take(); sfCap.take();
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


//import java.util.Scanner;
//class ReadString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("문자열 입력: ");
//        String str1 = sc.nextLine();
//
//        System.out.print("문자열 입력: ");
//        String str2 = sc.nextLine();
//
//        System.out.printf("입력된 문자열 1: %s \n", str1);
//        System.out.printf("입력된 문자열 2: %s \n", str2);
//    }
//}


//class Box {
//    private final String contents;
//
//    Box(String cont) {
//        this.contents = cont;
//    }
//    public String toString() {
//        return contents;
//    }
//}
//
//class BoxArray {
//    public static void main(String[] args) {
//        Box[] ar =new Box[3];
//
//        ar[0] = new Box("First");
//        ar[1] = new Box("Second");
//        ar[2] = new Box("Third");
//
//        System.out.println(ar[0]);
//        System.out.println(ar[1]);
//        System.out.println(ar[2]);
//    }
//}


// p.312


//class SuperCLS {
//    public SuperCLS() {
//        System.out.println("SuperCLS()");
//    }
//    public SuperCLS(int i) {
//        System.out.println("SuperCLS(int i)");
//    }
//    public SuperCLS(int i, int j) {
//        System.out.println("SuperCLS(int i, int j)");
//    }
//}
//
//class SubCLS extends SuperCLS {
//    public SubCLS() {
//        System.out.println("SubCLS()");
//    }
//    public SubCLS(int i) {
//        super(i);
//        System.out.println("SubCLS(int i)");
//    }
//    public SubCLS(int i, int j) {
//        super(i, j);
//        System.out.println("SubCLS(int i, int j)");
//    }
//}
//
//class SuperSub {
//    public static void main(String[] args) {
//        System.out.println("1. ");
//        new SubCLS();
//        System.out.println();
//
//        System.out.println("2. ");
//        new SubCLS(1);
//        System.out.println();
//
//        System.out.println("3. ");
//        new SubCLS(1, 2);
//        System.out.println();
//    }
//}


//class Man {
//    String name;
//
//    public Man(String name) {
//        this.name = name;
//    }
//    public void tellYourName() {
//        System.out.println("My name is " + name);
//    }
//}
//
//class BusinessMan extends Man {
//    String company;
//    String position;
//
//    public BusinessMan(String name, String company, String position) {
//        super(name);
//        this.company = company;
//        this.position = position;
//    }
//    public void tellYourInfo() {
//        System.out.println("My company is " + company);
//        System.out.println("My position is " + position);
//        tellYourName();
//    }
//}
//
//class MyBusinessMan {
//    public static void main(String[] args) {
//        BusinessMan man = new BusinessMan("YOON", "Hybrid ELD", "Staff Eng.");
//        man.tellYourInfo();
//    }
//}

// p.328


//class MobilePhone {
//    protected String number;
//
//    public MobilePhone(String num) {
//        number = num;
//    }
//    public void answer() {
//        System.out.println("Hi~ from " + number);
//    }
//}
//
//class SmartPhone extends MobilePhone {
//    private final String androidVer;
//
//    public SmartPhone(String num, String ver) {
//        super(num);
//        androidVer = ver;
//    }
//    public void playApp() {
//        System.out.println("App is running in " + androidVer);
//    }
//}
//
//class MobileSmartPhone {
//    public static void main(String[] args) {
//        SmartPhone phone = new SmartPhone("010-5555-7777", "Nougat");
//        phone.answer();
//        phone.playApp();
//    }
//}


//class MobilePhone {
//    protected String number;
//
//    public MobilePhone(String num) {
//        this.number = num;
//    }
//    public void answer() {
//        System.out.println("Hi~ from " + number);
//    }
//}
//
//class SmartPhone extends MobilePhone {
//    private final String androidVer;
//
//    public SmartPhone(String num, String ver) {
//        super(num);
//        this.androidVer = ver;
//    }
//    public void playApp() {
//        System.out.println("App is running in " + androidVer);
//    }
//}
//
//class MobileSmartPhoneRef {
//    public static void main(String[] args) {
//        SmartPhone ph1 = new SmartPhone("010-4444-5555", "Nougat");
//        MobilePhone ph2 = new SmartPhone("010-3457-7901", "Nougat");
//
//        ph1.answer();
//        ph1.playApp();
//
//        ph2.answer();
//    }
//}


//class Cake {
//    public void yummy() {
//        System.out.println("Yummy Cake");
//    }
//}
//
//class CheeseCake extends Cake {
//    public void yummy() {
//        System.out.println("Yummy Cheese Cake");
//    }
//}
//
//class YummyCakeOverriding {
//    public static void main(String[] args) {
//        Cake c1 = new CheeseCake();
//        CheeseCake c2 = new CheeseCake();
//
//        c1.yummy();
//        c2.yummy();
//    }
//}


//class UnivFriend {
//    private final String name;
//    private final String major;
//    private final String phone;
//
//    public UnivFriend(String name, String major, String phone) {
//        this.name = name;
//        this.major = major;
//        this.phone = phone;
//    }
//    public void showInfo() {
//        System.out.println("이름: " + name);
//        System.out.println("전공: " + major);
//        System.out.println("전화: " + phone);
//    }
//}
//
//class CompFriend {
//    private final String name;
//    private final String department;
//    private final String phone;
//
//    public CompFriend(String name, String department, String phone) {
//        this.name = name;
//        this.department = department;
//        this.phone = phone;
//    }
//    public void showInfo() {
//        System.out.println("이름: " + name);
//        System.out.println("부서: " + department);
//        System.out.println("전화: " + phone);
//    }
//}
//
//class MyFriends {
//    public static void main(String[] args) {
//        UnivFriend[] uFriends = new UnivFriend[5];
//        int uCount = 0;
//
//        CompFriend[] cFriends = new CompFriend[5];
//        int cCount = 0;
//
//        uFriends[uCount++] = new UnivFriend("LEE", "Computer", "010-3333-5555");
//        uFriends[uCount++] = new UnivFriend("SEO", "Electronics", "010-2222-4444");
//
//        cFriends[cCount++] = new CompFriend("YOON", "R&D 1", "02-1234-5678");
//        cFriends[cCount++] = new CompFriend("PARK", "R&D 2", "02-2323-3434");
//
//        for(int i=0; i<uCount; i++) {
//            uFriends[i].showInfo();
//            System.out.println();
//        }
//        for(int i=0; i<cCount; i++) {
//            cFriends[i].showInfo();
//            System.out.println();
//        }
//    }
//}


//class Friend {
//    protected String name;
//    protected String phone;
//
//    public Friend(String name, String phone) {
//        this.name = name;
//        this.phone = phone;
//    }
//    public void showInfo() {
//        System.out.println("이름: " + name);
//        System.out.println("전화: " + phone);
//    }
//}
//
//class UnivFriend extends Friend {
//    private final String major;
//
//    public UnivFriend(String name, String major, String phone) {
//        super(name, phone);
//        this.major = major;
//    }
//    public void showInfo() {
//        super.showInfo();
//        System.out.println("전공: " + major);
//    }
//}
//
//class CompFriend extends Friend {
//    private final String department;
//
//    public CompFriend(String name, String department, String phone) {
//        super(name, phone);
//        this.department = department;
//    }
//    public void showInfo() {
//        super.showInfo();
//        System.out.println("부서: " + department);
//    }
//}
//
//class MyFriend {
//    public static void main(String[] args) {
//        Friend[] frns = new Friend[10];
//        int cnt = 0;
//
//        frns[cnt++] = new UnivFriend("LEE", "Computer", "010-3333-4444");
//        frns[cnt++] = new UnivFriend("SEO", "Electronics", "010-3454-4343");
//        frns[cnt++] = new CompFriend("YOON", "R&D 1", "02-2121-1212");
//        frns[cnt++] = new CompFriend("PARK", "R&D 2", "02-3333-4444");
//
//        for(int i=0; i<cnt; i++) {
//            frns[i].showInfo();
//            System.out.println();
//        }
//    }
//}


//interface Printable {
//    public void print(String doc);
//}
//
//class Printer implements Printable {
//    @Override
//    public void print(String doc) {
//        System.out.println(doc);
//    }
//}
//
//class PrintableInterface {
//    public static void main(String[] args) {
//        Printable prn = new Printer();
//        prn.print("Hello Java");
//    }
//}


//interface Printable {
//    void print(String doc);
//}
//
//interface ColorPrintable extends Printable {
//    void printCMYK(String doc);
//}
//
//class Prn909Drv implements ColorPrintable {
//    @Override
//    public void print(String doc) {
//        System.out.println("From MD-909 black & white ver");
//        System.out.println(doc);
//    }
//
//    @Override
//    public void printCMYK(String doc) {
//        System.out.println("From MD-909 CMYK ver");
//        System.out.println(doc);
//    }
//}
//
//class Prn999Drv implements ColorPrintable {
//    @Override
//    public void print(String doc) {
//        System.out.println("From MD-999 black & white ver");
//        System.out.println(doc);
//    }
//
//    @Override
//    public void printCMYK(String doc) {
//        System.out.println("From MD-999 CMYK ver");
//        System.out.println(doc);
//    }
//}
//
//class PrinterDriver {
//    public static void main(String[] args) {
//        String myDoc = "This is a report about...";
//
//        ColorPrintable prn = new Prn909Drv();
//        prn.print(myDoc);
//        prn.printCMYK(myDoc);
//        System.out.println();
//
//        prn = new Prn999Drv();
//        prn.print(myDoc);
//        prn.printCMYK(myDoc);
//    }
//}


//interface Printable {
//    void print(String doc);
//    default void printCMYK(String doc) {}
//}
//
//class Prn731Drv implements Printable {
//    @Override
//    public void print(String doc) {
//        System.out.println("From MD-731 printer");
//        System.out.println(doc);
//    }
//}
//
//class Prn909Drv implements Printable {
//    @Override
//    public void print(String doc) {
//        System.out.println("From MD-909 black & white ver");
//        System.out.println(doc);
//    }
//
//    @Override
//    public void printCMYK(String doc) {
//        System.out.println("From MD-909 CMYK ver");
//        System.out.println(doc);
//    }
//}
//
//class PrinterDriver {
//    public static void main(String[] args) {
//        String myDoc = "This is a report about...";
//        Printable prn1 = new Prn731Drv();
//        prn1.print(myDoc);
//        System.out.println();
//
//        Printable prn2 = new Prn909Drv();
//        prn2.print(myDoc);
//    }
//}


//interface Printable {
//    static void printLine(String str) {
//        System.out.println(str);
//    }
//    default void print(String doc) {
//        printLine(doc);
//    }
//}
//
//class Printer implements Printable {}
//
//class SimplePrinter {
//    public static void main(String[] args) {
//        String myDoc = "This is a report about...";
//        Printable prn = new Printer();
//        prn.print(myDoc);
//
//        Printable.printLine("end of line");
//    }
//}


//interface Printable {
//    void printLine(String str);
//}
//
//class SimplePrinter implements Printable {
//    public void printLine(String str) {
//        System.out.println(str);
//    }
//}
//
//class MultiPrinter extends SimplePrinter {
//    public void printLine(String str) {
//        super.printLine("Start of multi...");
//        super.printLine(str);
//        super.printLine("End of multi");
//    }
//}
//
//class InstanceofInterface {
//    public static void main(String[] args) {
//        Printable prn1 = new SimplePrinter();
//        Printable prn2 = new MultiPrinter();
//
//        if(prn1 instanceof Printable)
//            prn1.printLine("This is a simple printer.");
//        System.out.println();
//
//        if(prn2 instanceof Printable)
//            prn2.printLine("This is a multiful printer.");
//    }
//}


//interface Upper {}
//interface Lower {}
//
//interface Printable {
//    String getContents();
//}
//
//class Report implements Printable, Upper {
//    String cons;
//
//    Report(String cons) {
//        this.cons = cons;
//    }
//    public String getContents() {
//        return cons;
//    }
//}
//
//class Printer {
//    public void printContents(Printable doc) {
//        if(doc instanceof Upper) {
//            System.out.println((doc.getContents()).toUpperCase());
//        }
//        else if(doc instanceof Lower) {
//            System.out.println((doc.getContents()).toLowerCase());
//        }
//        else
//            System.out.println(doc.getContents());
//    }
//}
//
//class MarkerInterface {
//    public static void main(String[] args) {
//        Printer prn = new Printer();
//        Report doc = new Report("Simple Funny News~");
//        prn.printContents(doc);
//    }
//}

// p.384


//import java.util.Scanner;
//
//class ExceptionCase {
//    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("a/b...a? ");
//        int n1 = kb.nextInt();
//        System.out.print("a/b...b? ");
//        int n2 = kb.nextInt();
//        System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
//        System.out.println("Good bye~~!");
//    }
//}


//import java.util.Scanner;
//
//class ExceptionCase {
//    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//
//        try {
//            System.out.print("a/b...a? ");
//            int n1 = kb.nextInt();
//            System.out.print("a/b...b? ");
//            int n2 = kb.nextInt();
//            System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
//        }
//        catch(ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("Good Bye~~!");
//    }
//}


//import java.util.Scanner;
//import java.util.InputMismatchException;
//
//class ExceptionCase {
//    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//
//        try {
//            System.out.print("a/b...a? ");
//            int n1 = kb.nextInt();
//            System.out.print("a/b...b? ");
//            int n2 = kb.nextInt();
//            System.out.printf("%d / %d = %d \n", n1, n2, n1/n2);
//        }
//        catch(InputMismatchException | ArithmeticException e) {
//            e.getMessage();
//        }
//
//        System.out.println("Good bye");
//    }
//}


//class ExceptionMessage {
//    public static void md1(int n) {
//        md2(n, 0);
//    }
//    public static void md2(int n1, int n2) {
//        int r = n1/n2;
//    }
//    public static void main(String[] args) {
//        md1(3);
//        System.out.println("Good bye");
//    }
//}

// p.395


//class ExceptionMessage {
//    public static void md1(int n) {
//        md2(n, 0);
//    }
//    public static void md2(int n1, int n2) {
//        int r = n1/n2;
//    }
//    public static void main(String[] args) {
//        try{
//            md1(3);
//        }
//        catch(Throwable e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Good bye");
//    }
//}


//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.Files;
//import java.io.BufferedWriter;
//import java.io.IOException;
//
//class IoExceptionCase {
//    public static void main(String[] args) {
//        Path file = Paths.get("D:\\Programing\\practiceJava\\Simple.txt");
//        BufferedWriter writer = null;
//
//        try {
//            writer = Files.newBufferedWriter(file);
//            writer.write('A');
//            writer.write('Z');
//
//            if(writer != null)
//                writer.close();
//        }
//        catch(IOException e) {
//            e.printStackTrace();
//        }
//    }
//}


//class Person {
//    String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//        System.out.println("destroyed: " + name);
//    }
//}
//
//class ObjectFinalize {
//    public static void main(String[] args) {
//        Person p1 = new Person("YOON");
//        Person p2 = new Person("PARK");
//        p1 = null;
//        p2 = null;
//
//        System.out.println("end of program");
//    }
//}


//class INum {
//    private int num;
//
//    public INum(int num) {
//        this.num = num;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if(this.num == ((INum)obj).num)
//            return true;
//        else
//            return false;
//    }
//}
//
//class ObjectEquality {
//    public static void main(String[] args) {
//        INum num1 = new INum(10);
//        INum num2 = new INum(12);
//        INum num3 = new INum(10);
//
//        if(num1.equals(num2))
//            System.out.println("num1, num2 Equal");
//        else
//            System.out.println("num1, num2 Different");
//
//        if(num1.equals(num3))
//            System.out.println("num1, num3 Equal");
//        else
//            System.out.println("num1, num3 Different");
//    }
//}


//class StringEquality {
//    public static void main(String[] args) {
//        String str1 = new String("So Simple");
//        String str2 = new String("So Simple");
//
//        if(str1 == str2)
//            System.out.println("str1, str2 Reference the same");
//        else
//            System.out.println("str1, str2 Reference different");
//
//        if(str1.equals(str2))
//            System.out.println("str1, str2 value the same");
//        else
//            System.out.println("str1, str2 value different");
//    }
//}


//class Point implements Cloneable {
//    private final int xPos;
//    private final int yPos;
//
//    public Point(int x, int y) {
//        this.xPos = x;
//        this.yPos = y;
//    }
//
//    public void showPosition() {
//        System.out.printf("[%d, %d]", xPos, yPos);
//        System.out.println();
//    }
//
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}
//
//class InstanceCloning {
//    public static void main(String[] args) {
//        Point org = new Point(3, 5);
//        Point cpy;
//
//        try {
//            cpy = (Point)org.clone();
//            org.showPosition();
//            cpy.showPosition();
//        }
//        catch(CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//    }
//}


//class Point implements Cloneable {
//    private int xPos;
//    private int yPos;
//
//    public Point(int x, int y) {
//        this.xPos = x;
//        this.yPos = y;
//    }
//
//    public void showPosition() {
//        System.out.printf("[%d, %d]", xPos, yPos);
//        System.out.println();
//    }
//
//    public void changePos(int x, int y) {
//        this.xPos = x;
//        this.yPos = y;
//    }
//
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}
//
//class Rectangle implements Cloneable {
//    private Point upperLeft;
//    private Point lowerRight;
//
//    public Rectangle(int x1, int y1, int x2, int y2) {
//        this.upperLeft = new Point(x1, y1);
//        this.lowerRight = new Point(x2, y2);
//    }
//
//    public void changePos(int x1, int y1, int x2, int y2) {
//        this.upperLeft.changePos(x1, y1);
//        this.lowerRight.changePos(x2, y2);
//    }
//
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        Rectangle copy = (Rectangle)super.clone();
//
//        copy.upperLeft = (Point)upperLeft.clone();
//        copy.lowerRight = (Point)lowerRight.clone();
//
//        return copy;
//    }
//
//    public void showPosition() {
//        System.out.print("좌측 상단: ");
//        this.upperLeft.showPosition();
//
//        System.out.print("우측 하단: ");
//        this.lowerRight.showPosition();
//        System.out.println();
//    }
//}
//
//class ShallowCopy {
//    public static void main(String[] args) {
//        Rectangle org = new Rectangle(1, 1, 9, 9);
//        Rectangle cpy;
//
//        try {
//            cpy = (Rectangle)org.clone();
//            org.changePos(2, 2, 7, 7);
//            org.showPosition();
//            cpy.showPosition();
//        }
//        catch(CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//    }
//}


//import java.util.Arrays;
//
//class CopyOfArrays {
//    public static void main(String[] args) {
//        double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
//        double[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);
//        double[] arCpy2 = Arrays.copyOf(arOrg, 3);
//
//        for(double d : arCpy1)
//            System.out.print(d + "\t");
//        System.out.println();
//
//        for(double d : arCpy2)
//            System.out.print(d + "\t");
//        System.out.println();
//    }
//}


//import java.util.Arrays;
//
//class Person implements Comparable {
//    private final String name;
//    private final int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        Person p = (Person)o;
//        return this.age - p.age;
//    }
//
//    @Override
//    public String toString() {
//        return name + ": " + age;
//    }
//}
//
//class ArrayObjSort {
//    public static void main(String[] args) {
//        Person[] ar = new Person[3];
//        ar[0] = new Person("Lee", 29);
//        ar[1] = new Person("Goo", 15);
//        ar[2] = new Person("Soo", 37);
//
//        Arrays.sort(ar);
//        for(Person p : ar)
//            System.out.println(p);
//    }
//}


//import java.util.Arrays;
//
//class ArraySearch {
//    public static void main(String[] args) {
//        int[] ar = {33, 55, 11, 44, 22};
//        Arrays.sort(ar);
//        for(int n : ar)
//            System.out.print(n + "\t");
//        System.out.println();
//
//        int idx = Arrays.binarySearch(ar, 33);
//        System.out.println("Index of 33: " + idx);
//    }
//}


//import java.util.Arrays;
//
//class Person implements Comparable {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        Person p = (Person)o;
//        return this.age - p.age;
//    }
//
//    @Override
//    public String toString() {
//        return name + ": " + age;
//    }
//}
//
//class ArrayObjSearch {
//    public static void main(String[] args) {
//        Person[] ar = new Person[3];
//        ar[0] = new Person("Lee", 29);
//        ar[1] = new Person("Goo", 15);
//        ar[2] = new Person("Soo", 37);
//        Arrays.sort(ar);
//        int idx = Arrays.binarySearch(ar, new Person("who?", 37));
//        System.out.println(ar[idx]);
//    }
//}


//class Apple {
//    public String toString() {
//        return "I am an apple.";
//    }
//}
//
//class Orange {
//    public String toString() {
//        return "I am an orange.";
//    }
//}
//
//class Box<T> {
//    private T ob;
//
//    public void set(T o) {
//        this.ob = o;
//    }
//    public T get() {
//        return this.ob;
//    }
//}
//
//class BoxGeneric {
//    public static void main(String[] args) {
//        Box<Apple> aBox = new Box<Apple>();
//        Box<Orange> oBox = new Box<>();
//
//        aBox.set(new Apple());
//        oBox.set(new Orange());
//
//        Apple ap = aBox.get();
//        Orange og = oBox.get();
//
//        System.out.println(ap);
//        System.out.println(og);
//    }
//}


//class DBox<L, R> {
//    private L left;
//    private R right;
//
//    public void set(L o, R r) {
//        this.left = o;
//        this.right = r;
//    }
//
//    @Override
//    public String toString() {
//        return this.left + " & " + this.right;
//    }
//}
//
//class Param {
//    public static void main(String[] args) {
//        DBox<String, Integer> box = new DBox<>();
//        box.set("Apple", 25);
//        System.out.println(box);
//    }
//}


//class Box<T> {
//    private T ob;
//
//    public void set(T o) {
//        this.ob = o;
//    }
//    public T get() {
//        return this.ob;
//    }
//}
//
//class BoxInBox {
//    public static void main(String[] args) {
//        Box<String> sBox = new Box<>();
//        sBox.set("I am so happy");
//
//        Box<Box<String>> wBox = new Box<>();
//        wBox.set(sBox);
//
//        Box<Box<Box<String>>> zBox = new Box<>();
//        zBox.set(wBox);
//
//        System.out.println((zBox.get().get().get()));
//    }
//}


//class Box<T extends Number> {
//    private T ob;
//
//    public void set(T o) {
//        this.ob = o;
//    }
//    public T get() {
//        return this.ob;
//    }
//
//    @Override
//    public String toString() {
//        return "this is Number: " + this.ob;
//    }
//}
//
//class BoundedBox {
//    public static void main(String[] args) {
//        Box<Integer> iBox = new Box<>();
//        iBox.set(24);
//
//        Box<Double> dBox = new Box<>();
//        dBox.set(5.97);
//
//        System.out.println(iBox);
//        System.out.println(dBox);
//    }
//}


//interface Eatable {
//    String eat();
//}
//
//class Apple implements Eatable {
//    public String toString() {
//        return "I am an apple.";
//    }
//
//    @Override
//    public String eat() {
//        return "It tastes so good!";
//    }
//}
//
//class Box<T extends Eatable> {
//    T ob;
//
//    public void set(T o) {
//        this.ob = o;
//    }
//    public T get() {
//        System.out.println(ob);
//        System.out.println(ob.eat());
//        return this.ob;
//    }
//}
//
//class Bounded {
//    public static void main(String[] args) {
//        Box<Apple> box = new Box<>();
//        box.set(new Apple());
//
//        Apple ap = box.get();
//    }
//}


//class Box<T> {
//    private T ob;
//
//    public void set(T o) {
//        this.ob = o;
//    }
//    public T get() {
//        return this.ob;
//    }
//}
//
//class BoxFactory {
//    public static <T> Box<T> makeBox(T o) {
//        Box<T> box = new Box<>();
//        box.set(o);
//        return box;
//    }
//}
//
//class Generic {
//    public static void main(String[] args) {
//        Box<String> sBox = BoxFactory.makeBox("Sweet");
//        System.out.println(sBox.get());
//
//        Box<Double> dBox = BoxFactory.makeBox(7.59);
//        System.out.println(dBox.get());
//    }
//}


//class Box<T> {
//    private T ob;
//
//    public void set(T o) {
//        this.ob = o;
//    }
//    public T get() {
//        return ob;
//    }
//}
//
//class Unboxer {
//    public static <T> T openBox(Box<T> box) {
//        return box.get();
//    }
//}
//
//class GenericMaker {
//    public static void main(String[] args) {
//        Box<String> box = new Box<>();
//        box.set("My Generic");
//
//        String str = Unboxer.openBox(box);
//        System.out.println(str);
//    }
//}


//class Box<T> {
//    private T ob;
//
//    public void set(T o) {
//        this.ob = o;
//    }
//    public T get() {
//        return this.ob;
//    }
//}
//
//class BoxFactory {
//    public static <T extends Number> Box<T> makeBox(T o) {
//        Box<T> box = new Box<>();
//        box.set(o);
//
//        System.out.println("Boxed data: " + o.intValue());
//        return box;
//    }
//}
//
//class Unboxer {
//    public static <T extends Number> T openBox(Box<T> box) {
//        System.out.println("Unboxed data: " + box.get().intValue());
//        return box.get();
//    }
//}
//
//class Method {
//    public static void main(String[] args) {
//        Box<Integer> sBox = BoxFactory.makeBox(5959);
//        int n = Unboxer.openBox(sBox);
//        System.out.println("Returned data: " + n);
//    }
//}


// p.510


//class Box<T> {
//    protected T ob;
//    public void set(T o) {ob = o;}
//    public T get() {return ob;}
//}
//
//class SteelBox<T> extends Box<T> {
//    public SteelBox(T o) {
//        ob = o;
//    }
//}
//
//class GenericInheritance {
//    public static void main(String[] args) {
//        Box<Integer> iBox;
//        iBox = new SteelBox<>(7959);
//        Box<String> sBox;
//        sBox = new SteelBox<>("Simple");
//
//        System.out.println(iBox.get());
//        System.out.println(sBox.get());
//    }
//}


//class Box<T> {
//    private T ob;
//    public void set(T o) {ob = o;}
//    public T get() {return ob;}
//}
//
//class EmptyBoxFactory {
//    public static <T> Box<T> makeBox() {
//        return new Box<T>();
//    }
//}
//
//class TargetTypes {
//    public static void main(String[] args) {
//        Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
//        iBox.set(25);
//        System.out.println(iBox.get());
//    }
//}


//class Box<T> {
//    private T ob;
//    public void set(T o) {ob = o;}
//    public T get() {return ob;}
//
//    @Override
//    public String toString() {
//        return ob.toString();
//    }
//}
//
//class Unboxer {
//    public static void peekBox(Box<? super Integer> box) {
//        System.out.println(box);
//    }
//}
//
//class WildCard {
//    public static void main(String[] args) {
//        Box<Integer> iBox = new Box<Integer>();
//        iBox.set(1234);
//
//        Box<Number> nBox = new Box<Number>();
//        nBox.set(9955);
//
//        Box<Object> oBox = new Box<Object>();
//        oBox.set("My Simple Instance");
//
//        Unboxer.peekBox(iBox);
//        Unboxer.peekBox(nBox);
//        Unboxer.peekBox(oBox);
//    }
//}


// *** Very important ex. It explains almost all about WildCard. ***
//class Box<T> {
//    private T ob;
//    public void set(T o) {ob = o;}
//    public T get() {return ob;}
//}
//
//class Toy {
//    @Override
//    public String toString() {
//        return "I am a Toy";
//    }
//}
//
//class BoxHandler {
//    public static void outBox(Box<? extends Toy> box) {
//        Toy t = box.get();
//        System.out.println(t);
//    }
//    public static void inBox(Box<? super Toy> box, Toy n) {
//        box.set(n);
//    }
//}
//
//class BoundedWildCard {
//    public static void main(String[] args) {
//        Box<Toy> box = new Box<>();
//        BoxHandler.inBox(box, new Toy());
//        BoxHandler.outBox(box);
//    }
//}


//class Box<T> {
//    private T ob;
//    public void set(T o) {ob = o;}
//    public T get() {return ob;}
//}
//
//class Toy {
//    @Override
//    public String toString() {
//        return "I am a Toy";
//    }
//}
//
//class BoxContentsMover {
//    public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) {
//        to.set(from.get());
//    }
//}
//
//class MoveBox {
//    public static void main(String[] args) {
//        Box<Toy> box1 = new Box<>();
//        box1.set(new Toy());
//        Box<Toy> box2 = new Box<>();
//
//        BoxContentsMover.moveBox(box2, box1);
//        System.out.println(box1.get());
//    }
//}


// *** 와일드 카드 오버로딩 대체 방편 ***
//class Box<T> {
//    private T ob;
//    public void set(T o) {ob = o;}
//    public T get() {return ob;}
//}
//
//class Toy {
//    @Override
//    public String toString() {
//        return "I am a Toy";
//    }
//}
//
//class Robot {
//    @Override
//    public String toString() {
//        return "I am a Robot";
//    }
//}
//
//class BoxHandler {
//    public static <T> void outBox(Box<? extends T> box) {
//        T t = box.get();
//        System.out.println(t);
//    }
//
//    public static <T> void inBox(Box<? super T> box, T n) {
//        box.set(n);
//    }
//}
//
//class BoundedWildCard {
//    public static void main(String[] args) {
//        Box<Toy> tBox = new Box<>();
//        BoxHandler.inBox(tBox, new Toy());
//        BoxHandler.outBox(tBox);
//
//        Box<Robot> rBox = new Box<>();
//        BoxHandler.inBox(rBox, new Robot());
//        BoxHandler.outBox(rBox);
//    }
//}


//interface Getable<T> {
//    T get();
//}
//
//class Box<T> implements Getable<String> {
//    private T ob;
//    public void set(T o) {ob = o;}
//
//    @Override
//    public String get() {
//        return ob.toString();
//    }
//}
//
//class Toy {
//    @Override
//    public String toString() {
//        return "I am a Toy";
//    }
//}
//
//class GetableGenericInterface {
//    public static void main(String[] args) {
//        Box<Toy> box = new Box<>();
//        box.set(new Toy());
//
//        Getable<String> gt = box;
//        System.out.println(gt.get());
//    }
//}





















































