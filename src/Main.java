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


//import java.util.LinkedList;
//import java.util.List;
//
//class ArrayListCollection {
//    public static void main(String[] args) {
//        List<String> list = new LinkedList<>();
//
//        list.add("Toy");
//        list.add("Box");
//        list.add("Robot");
//
//        for(int i = 0; i <list.size(); i++)
//            System.out.print(list.get(i) + '\t');
//        System.out.println();
//
//        list.remove(0);
//
//        for(int i = 0; i < list.size(); i++)
//            System.out.print(list.get(i) + '\t');
//        System.out.println();
//    }
//}

// p.552


//import java.util.List;
//import java.util.LinkedList;
//import java.util.Iterator;
//
//class IteratorCollection {
//    public static void main(String[] args) {
//        List<String> list = new LinkedList<>();
//        list.add("Toy");
//        list.add("Box");
//        list.add("Robot");
//        list.add("Box");
//
//        Iterator<String> itr = list.iterator();
//
//        while(itr.hasNext())
//            System.out.print(itr.next() + '\t');
//        System.out.println();
//
//        itr = list.iterator();
//
//        String str;
//        while(itr.hasNext()) {
//            str = itr.next();
//            if(str.equals("Box"))
//                itr.remove();
//        }
//
//        itr = list.iterator();
//
//        while(itr.hasNext())
//            System.out.print(itr.next() + '\t');
//        System.out.println();
//    }
//}

// p.555


//import java.util.List;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Arrays;
//
//class AsListCollection {
//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
//        list = new ArrayList<>(list);
//
//        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
//            System.out.print(itr.next() + '\t');
//        System.out.println();
//
//        for(Iterator<String> itr = list.iterator(); itr.hasNext();) {
//            if(itr.next().equals("Box"))
//                itr.remove();
//        }
//
//        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
//            System.out.print(itr.next() + '\t');
//        System.out.println();
//    }
//}


//import java.util.List;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Iterator;
//import java.util.Arrays;
//
//class ConversionCollection {
//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
//        list = new ArrayList<>(list);
//
//        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
//            System.out.print(itr.next() + '\t');
//        System.out.println();
//
//        list = new LinkedList<>(list);
//
//        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
//            System.out.print(itr.next() + '\t');
//        System.out.println();
//    }
//}


//import java.util.Iterator;
//import java.util.LinkedList;
//
//class PrimitiveCollection {
//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(10); list.add(20); list.add(30);
//
//        int n;
//        for(Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
//            n = itr.next();
//            System.out.print(n + "\t");
//        }
//        System.out.println();
//    }
//}


//import java.util.List;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.ListIterator;
//import java.util.Arrays;
//
//class ListIteratorCollection {
//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
//        list = new ArrayList<>(list);
//
//        ListIterator<String> litr = list.listIterator();
//
//        String str;
//        while(litr.hasNext()) {
//            str = litr.next();
//            System.out.print(str + '\t');
//            if(str.equals("Toy"))
//                litr.add("Toy2");
//        }
//        System.out.println();
//
//        while(litr.hasPrevious()) {
//            str = litr.previous();
//            System.out.print(str + '\t');
//            if(str.equals("Robot"))
//                litr.add("Robot2");
//        }
//        System.out.println();
//
//        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
//            System.out.print(itr.next() + '\t');
//        System.out.println();
//    }
//}


//import java.util.Iterator;
//import java.util.HashSet;
//import java.util.Set;
//
//class SetCollectionFeature {
//    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("Toy");
//        set.add("Box");
//        set.add("Robot");
//        set.add("Box");
//        System.out.println("Instance count: " + set.size());
//
//        for(Iterator<String> itr = set.iterator(); itr.hasNext();)
//            System.out.print(itr.next() + '\t');
//        System.out.println();
//
//        for(String s : set)
//            System.out.print(s + '\t');
//        System.out.println();
//    }
//}


//import java.util.HashSet;
//
//class Num {
//    private int num;
//    public Num(int n) {num = n;}
//
//    @Override
//    public String toString() {
//        return String.valueOf(num);
//    }
//}
//
//class HashSetEqualityOne {
//    public static void main(String[] args) {
//        HashSet<Num> set = new HashSet<>();
//        set.add(new Num(7799));
//        set.add(new Num(9955));
//        set.add(new Num(7799));
//        System.out.println("Instance count: " + set.size());
//
//        for(Num n : set)
//            System.out.print(n.toString() + '\t');
//        System.out.println();
//    }
//}


//import java.util.HashSet;
//
//class Num {
//    private int num;
//    public Num(int n) {num = n;}
//
//    @Override
//    public String toString() {
//        return String.valueOf(num);
//    }
//
//    @Override
//    public int hashCode() {
//        return num % 3;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if(num == ((Num)obj).num)
//            return true;
//        else
//            return false;
//    }
//}
//
//class HashSetEquality {
//    public static void main(String[] args) {
//        HashSet<Num> set = new HashSet<>();
//        set.add(new Num(7799));
//        set.add(new Num(9955));
//        set.add(new Num(7799));
//        System.out.println("Instance Count: " + set.size());
//
//        for(Num n : set)
//            System.out.print(n.toString() + '\t');
//        System.out.println();
//    }
//}


//import java.util.HashSet;
//
//class Car {
//    private String model;
//    private String color;
//
//    public Car(String m, String c) {
//        this.model = m;
//        this.color = c;
//    }
//
//    @Override
//    public String toString() {
//        return model + " : " + color;
//    }
//
//    @Override
//    public int hashCode() {
//        return (model.hashCode() + color.hashCode()) / 2;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        String m = ((Car)obj).model;
//        String c = ((Car)obj).color;
//
//        if(model.equals(m) && color.equals(c))
//            return true;
//        else
//            return false;
//    }
//}
//
//class HowHashCode {
//    public static void main(String[] args) {
//        HashSet<Car> set = new HashSet<>();
//        set.add(new Car("HY_MD_301", "RED"));
//        set.add(new Car("HY_MD_301", "BLACK"));
//        set.add(new Car("HY_MD_302", "RED"));
//        set.add(new Car("HY_MD_302", "WHITE"));
//        set.add(new Car("HY_MD_301", "BLACK"));
//        System.out.println("Instance Count: " + set.size());
//
//        for(Car car : set)
//            System.out.println(car.toString() + '\t');
//    }
//}

// p.571


//import java.util.TreeSet;
//import java.util.Iterator;
//
//class SortedTreeSet {
//    public static void main(String[] args) {
//        TreeSet<Integer> tree = new TreeSet<Integer>();
//        tree.add(3); tree.add(1);
//        tree.add(2); tree.add(4);
//        System.out.println("Instance Count: " + tree.size());
//
//        for(Integer n : tree)
//            System.out.print(n.toString() + '\t');
//        System.out.println();
//
//        for(Iterator<Integer> itr = tree.iterator(); itr.hasNext();)
//            System.out.print(itr.next().toString() + '\t');
//        System.out.println();
//    }
//}


//import java.util.TreeSet;
//import java.util.Iterator;
//import java.util.Comparator;
//
//class Person implements Comparable<Person> {
//    String name;
//    int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return name + " : " + age;
//    }
//
//    @Override
//    public int compareTo(Person p) {
//        return this.age - p.age;
//    }
//}
//
//class PersonComparator implements Comparator<Person> {
//    public int compare(Person p1, Person p2) {
//        return p2.age - p1.age;
//    }
//}
//
//class ComparablePerson {
//    public static void main(String[] args) {
//        TreeSet<Person> tree = new TreeSet<>(new PersonComparator());
//        tree.add(new Person("YOON", 37));
//        tree.add(new Person("HONG", 53));
//        tree.add(new Person("PARK", 22));
//
//        for(Person p : tree)
//            System.out.println(p);
//    }
//}


//import java.util.TreeSet;
//import java.util.Iterator;
//import java.util.Comparator;
//
//class StringComparator implements Comparator<String> {
//    public int compare(String s1, String s2) {
//        return s1.length() - s2.length();
//    }
//}
//
//class ComparatorString {
//    public static void main(String[] args) {
//        TreeSet<String> tree = new TreeSet<>(new StringComparator());
//        tree.add("Box");
//        tree.add("Rabbit");
//        tree.add("Robot");
//
//        for(String s : tree)
//            System.out.print(s.toString() + '\t');
//        System.out.println();
//    }
//}


//import java.util.List;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.HashSet;
//
//class ConvertCollection {
//    public static void main(String[] args) {
//        List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy");
//        ArrayList<String> list = new ArrayList<>(lst);
//
//        for(String s : list)
//            System.out.print(s.toString() + '\t');
//        System.out.println();
//
//        HashSet<String> set = new HashSet<>(list);
//
//        list = new ArrayList<>(set);
//
//        for(String s : list)
//            System.out.print(s.toString() + '\t');
//        System.out.println();
//    }
//}


//import java.util.Queue;
//import java.util.LinkedList;
//
//class LinkedListQueue {
//    public static void main(String[] args) {
//        Queue<String> que = new LinkedList<>();
//        que.offer("Box");
//        que.offer("Toy");
//        que.offer("Robot");
//
//        System.out.println("next: " + que.peek());
//
//        System.out.println(que.poll());
//        System.out.println(que.poll());
//
//        System.out.println("next: " + que.peek());
//        System.out.println(que.poll());
//    }
//}


//import java.util.Deque;
//import java.util.ArrayDeque;
//
//class ArrayDequeCollection {
//    public static void main(String[] args) {
//        Deque<String> deq = new ArrayDeque<>();
//
//        deq.offerFirst("1.Box");
//        deq.offerFirst("2.Toy");
//        deq.offerFirst("3.Robot");
//
//        System.out.println(deq.pollFirst());
//        System.out.println(deq.pollLast());
//        System.out.println(deq.pollFirst());
//    }
//}


//import java.util.Deque;
//import java.util.ArrayDeque;
//
//interface DIStack<E> {
//    public boolean push(E item);
//    public E pop();
//}
//
//class DCStack<E> implements DIStack<E> {
//    private Deque<E> deq;
//
//    public DCStack(Deque<E> d) {
//        deq = d;
//    }
//
//    public boolean push(E item) {
//        return deq.offerFirst(item);
//    }
//    public E pop() {
//        return deq.pollFirst();
//    }
//}
//
//class DefinedStack {
//    public static void main(String[] args) {
//        DIStack<String> stk = new DCStack<>(new ArrayDeque<String>());
//
//        stk.push("1.Box");
//        stk.push("2.Toy");
//        stk.push("3.Robot");
//
//        System.out.println(stk.pop());
//        System.out.println(stk.pop());
//        System.out.println(stk.pop());
//    }
//}


//import java.util.HashMap;
//
//class HashMapCollection {
//    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//
//        map.put(45, "Brown");
//        map.put(37, "James");
//        map.put(23, "Martin");
//
//        System.out.println("No.23: " + map.get(23));
//        System.out.println("No.37: " + map.get(37));
//        System.out.println("No.45: " + map.get(45));
//        System.out.println();
//
//        map.remove(37);
//
//        System.out.println("No.37: " + map.get(37));
//    }
//}


//import java.util.TreeMap;
//import java.util.Iterator;
//import java.util.Set;
//import java.util.Comparator;
//
//class AgeComparator implements Comparator<Integer> {
//    public int compare(Integer n1, Integer n2) {
//        return n2.intValue() - n1.intValue();
//    }
//}
//
//class HashMapIteration {
//    public static void main(String[] args) {
//        TreeMap<Integer, String> map = new TreeMap<>(new AgeComparator());
//        map.put(45, "Brown");
//        map.put(37, "James");
//        map.put(23, "Martin");
//
//        Set<Integer> ks = map.keySet();
//
//        for(Integer n : ks)
//            System.out.print(n.toString() + " : " + map.get(n).toString() + '\t');
//        System.out.println();
//
//        for(Integer n : ks)
//            System.out.print(map.get(n).toString() + '\t');
//        System.out.println();
//
//        for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
//            System.out.print(map.get(itr.next()) + '\t');
//        System.out.println();
//    }
//}


//import java.util.List;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Collections;
//
//class SortCollections {
//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Weapon");
//        list = new ArrayList<>(list);
//
//        for (String value : list) System.out.print(value + "\t");
//        System.out.println();
//
//        Collections.sort(list);
//
//        for (String s : list) System.out.print(s + '\t');
//        System.out.println();
//    }
//}

// p.601


//import java.util.*;
//
//class Car implements Comparable<Car> {
//    private final int disp;
//
//    public Car(int d) {
//        disp = d;
//    }
//
//    @Override
//    public String toString() {
//        return "cc: " + disp;
//    }
//    @Override
//    public int compareTo(Car o) {
//        return this.disp - o.disp;
//    }
//}
//
//class CarSortCollections {
//    public static void main(String[] args) {
//        List<Car> list = new ArrayList<>();
//        list.add(new Car(1200));
//        list.add(new Car(3000));
//        list.add(new Car(1800));
//        Collections.sort(list);
//
//        for(Iterator<Car> itr = list.iterator(); itr.hasNext();)
//            System.out.println(itr.next().toString() + '\t');
//    }
//}


//import java.util.List;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Collections;
//
//class Car implements Comparable<Car> {
//    protected int disp;
//
//    public Car(int d) {
//        disp = d;
//    }
//
//    @Override
//    public String toString() {
//        return "cc: " + disp;
//    }
//    @Override
//    public int compareTo(Car o) {
//        return this.disp - o.disp;
//    }
//}
//
//class ECar extends Car {
//    private int battery;
//
//    public ECar(int d, int b) {
//        super(d);
//        battery = b;
//    }
//
//    @Override
//    public String toString() {
//        return "cc: " + super.disp + ", ba: " + this.battery;
//    }
//}
//
//class ECarSortCollections {
//    public static void main(String[] args) {
//        List<ECar> list = new ArrayList<>();
//        list.add(new ECar(1200, 99));
//        list.add(new ECar(3000, 55));
//        list.add(new ECar(1800, 87));
//        Collections.sort(list);
//
//        for(Iterator<ECar> itr = list.iterator(); itr.hasNext();)
//            System.out.println(itr.next().toString() + '\t');
//    }
//}


//import java.util.List;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Comparator;
//import java.util.Collections;
//
//class Car {
//    protected int disp;
//    public Car(int d) {
//        this.disp = d;
//    }
//
//    @Override
//    public String toString() {
//        return "cc: " + disp;
//    }
//}
//
//class CarComp implements Comparator<Car> {
//    @Override
//    public int compare(Car o1, Car o2) {
//        return o1.disp - o2.disp;
//    }
//}
//
//class ECar extends Car {
//    private int battery;
//
//    public ECar(int d, int b) {
//        super(d);
//        battery = b;
//    }
//
//    @Override
//    public String toString() {
//        return "cc: " + disp + ", ba: " + battery;
//    }
//}
//
//class CarComparator {
//    public static void main(String[] args) {
//        List<Car> clist = new ArrayList<>();
//        clist.add(new Car(1800));
//        clist.add(new Car(1200));
//        clist.add(new Car(3000));
//
//        List<ECar> elist = new ArrayList<>();
//        elist.add(new ECar(3000, 55));
//        elist.add(new ECar(1800, 87));
//        elist.add(new ECar(1200, 99));
//
//        CarComp comp = new CarComp();
//
//        Collections.sort(clist, comp);
//        Collections.sort(elist, comp);
//
//        for(Iterator<Car> itr = clist.iterator(); itr.hasNext();)
//            System.out.println(itr.next().toString() + '\t');
//        System.out.println();
//
//        for(Iterator<ECar> itr = elist.iterator(); itr.hasNext();)
//            System.out.println(itr.next().toString() + '\t');
//    }
//}


//import java.util.List;
//import java.util.ArrayList;
//import java.util.Collections;
//
//class StringBinarySearch {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Box");
//        list.add("Robot");
//        list.add("Apple");
//
//        Collections.sort(list);
//        int idx = Collections.binarySearch(list, "Robot");
//        System.out.println(list.get(idx));
//    }
//}


//import java.util.List;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Collections;
//
//class StrComp implements Comparator<String> {
//    @Override
//    public int compare(String s1, String s2) {
//        return s1.compareToIgnoreCase(s2);
//    }
//}
//
//class StringComparator {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("ROBOT");
//        list.add("APPLE");
//        list.add("BOX");
//
//        StrComp cmp = new StrComp();
//        Collections.sort(list,cmp);
//        int idx = Collections.binarySearch(list, "Robot", cmp);
//        System.out.println(list.get(idx));
//    }
//}


//import java.util.List;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.Collections;
//
//class CopyList {
//    public static void main(String[] args) {
//        List<String> src = Arrays.asList("Box", "Apple", "Toy", "Robot");
//
//        List<String> dest = new ArrayList<>(src);
//
//        Collections.sort(dest);
//        System.out.println(dest);
//
//        Collections.copy(dest, src);
//        System.out.println(dest);
//    }
//}


//enum Person {
//    MAN, WOMAN;
//
//    @Override
//    public String toString() {
//        return "I am a dog person.";
//    }
//}
//
//class EnumConst {
//    public static void main(String[] args) {
//        System.out.println(Person.MAN);
//        System.out.println(Person.WOMAN);
//    }
//}


//enum Person {
//    MAN(29), WOMAN(25);
//
//    int age;
//    private Person(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "I am " + age + " years old";
//    }
//}
//
//class EnumParam {
//    public static void main(String[] args) {
//        System.out.println(Person.MAN);
//        System.out.println(Person.WOMAN);
//    }
//}


//class Varargs {
//    public static void showAll(String...vargs) {
//        System.out.println("LEN: " + vargs.length);
//
//        for(String s: vargs)
//            System.out.print(s + '\t');
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        showAll("Box");
//        showAll("Box", "Toy");
//        showAll("Box", "Toy", "Apple");
//    }
//}

// p.648


//interface Printable {
//    void print();
//}
//
//class Papers {
//    private String con;
//    public Papers(String s) {
//        con = s;
//    }
//    public Printable getPrinter() {
//        return new Printer();
//    }
//
//    private class Printer implements Printable {
//        public void print() {
//            System.out.println(con);
//        }
//    }
//}
//
//class UseMemberInner {
//    public static void main(String[] args) {
//        Papers p = new Papers("Info: Happy");
//        Printable prn = p.getPrinter();
//        prn.print();
//    }
//}


//interface Printable {
//    void print();
//}
//
//class Papers {
//    private String con;
//    public Papers(String s) {
//        con = s;
//    }
//
//    public Printable getPrinter() {
//        return new Printable() {
//            public void print() {
//                System.out.println(con);
//            }
//        };
//    }
//}
//
//class UseAnonymousInner {
//    public static void main(String[] args) {
//        Papers p = new Papers("Info: Happy");
//        Printable prn = p.getPrinter();
//        prn.print();
//    }
//}


//import java.util.List;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Collections;
//
//class StrComp implements Comparator<String> {
//    @Override
//    public int compare(String s1, String s2) {
//        return s1.length() - s2.length();
//    }
//}
//
//class SortComparator {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("ROBOT");
//        list.add("APPLE");
//        list.add("BOX");
//
//        StrComp cmp = new StrComp();
//        Collections.sort(list, cmp);
//        System.out.println(list);
//    }
//}


//import java.util.List;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Collections;
//
//class AnonymousCom {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("ROBOT");
//        list.add("APPLE");
//        list.add("BOX");
//
//        Comparator<String> cmp = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
//
//        Collections.sort(list, cmp);
//        System.out.println(list);
//    }
//}

// p.656


//interface Printable {
//    void print(String s);
//}
//
//class Printer implements Printable {
//    public void print(String s) {
//        System.out.println(s);
//    }
//}
//
//class Lambda1 {
//    public static void main(String[] args) {
//        Printable prn = new Printer();
//        prn.print("What is Lambda?");
//    }
//}


//interface Printable {
//    void print(String s);
//}
//
//class Lambda2 {
//    public static void main(String[] args) {
//        Printable prn = new Printable() {
//            public void print(String s) {
//                System.out.println(s);
//            }
//        };
//
//        prn.print("What is Lambda?");
//    }
//}


//interface Printable {
//    void print(String s);
//}
//
//class Lambda3 {
//    public static void main(String[] args) {
//        Printable prn = System.out::println;
//        prn.print("What is Lambda?");
//    }
//}


//interface Printable {
//    void print(String s);
//}
//
//class Lambda4 {
//    public static void ShowString(Printable p, String s) {
//        p.print(s);
//    }
//
//    public static void main(String[] args) {
//        ShowString(System.out::println, "What is Lambda?");
//    }
//}


//import java.util.List;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Collections;
//
//class SLenComp implements Comparator<String> {
//    @Override
//    public int compare(String s1, String s2) {
//        return s1.length() - s2.length();
//    }
//}
//
//class SLenComparator {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Robot");
//        list.add("Lambda");
//        list.add("Box");
//
//        Collections.sort(list, new SLenComp());
//
//        list.forEach(System.out::println);
//    }
//}


//interface Printable {
//    void print(String s);
//}
//
//class OneParamNoReturn {
//    public static void main(String[] args) {
//        Printable p;
//        p = System.out::println;
//        p.print("Lambda exp one.");
//
//        p = System.out::println;
//        p.print("Lambda exp two.");
//
//        p = (s) -> System.out.println(s);
//        p.print("Lambda exp three.");
//
//        p = s -> System.out.println(s);
//        p.print("Lambda exp four.");
//    }
//}


//interface Calculate {
//    void cal(int a, int b);
//}
//
//class TwoParamNoReturn {
//    public static void main(String[] args) {
//        Calculate c;
//        c = (a, b) -> System.out.println(a + b);
//        c.cal(4, 3);
//
//        c = (a, b) -> System.out.println(a - b);
//        c.cal(4, 3);
//
//        c = (a, b) -> System.out.println(a * b);
//        c.cal(4, 3);
//    }
//}


//interface Calculate {
//    int cal(int a, int b);
//}
//
//class TwoParamAndReturn {
//    public static void main(String[] args) {
//        Calculate c;
//        c = Integer::min;
//        System.out.println(c.cal(4, 3));
//
//        c = (a, b) -> a - b;
//        System.out.println(c.cal(4, 3));
//    }
//}


//interface HowLong {
//    int len(String s);
//}
//
//class OneParamAndReturn {
//    public static void main(String[] args) {
//        HowLong hl = String::length;
//        System.out.println(hl.len("I am so happy"));
//    }
//}


//import java.util.Random;
//
//interface Generator {
//    int rand();
//}
//
//class NoParamAndReturn {
//    public static void main(String[] args) {
//        Generator gen = () -> {
//            Random rand = new Random();
//            return rand.nextInt(50);
//        };
//
//        System.out.println(gen.rand());
//    }
//}


//@FunctionalInterface
//interface Calculate <T> {
//    T cal(T a, T b);
//}
//
//class LambdaGeneric {
//    public static void main(String[] args) {
//        Calculate<Integer> ci = Integer::sum;
//        System.out.println(ci.cal(4, 3));
//
//        Calculate<Double> cd = Double::sum;
//        System.out.println(cd.cal(4.32, 3.45));
//    }
//}


//import java.util.List;
//import java.util.Arrays;
//import java.util. function.Predicate;
//
//class PredicateDemo {
//    public static int sum(Predicate<Integer> p, List<Integer> lst) {
//        int s = 0;
//        for(int n : lst) {
//            if(p.test(n))
//                s += n;
//        }
//        return s;
//    }
//
//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 5, 7, 9, 11, 12);
//        int s;
//        s = sum(n -> n%2 == 0, list);
//        System.out.println("Sum of even: " + s);
//
//        s = sum(n -> n%2 != 0, list);
//        System.out.println("Sum of odd : " + s);
//    }
//}


//import java.util.Arrays;
//import java.util.List;
//import java.util.function.IntPredicate;
//
//class IntPredicateDemo {
//    public static int sum(IntPredicate ip, List<Integer> lst) {
//        int s = 0;
//        for(int n : lst) {
//            if(ip.test(n))
//                s += n;
//        }
//        return s;
//    }
//
//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 5, 7, 9, 11, 12);
//        int s;
//        s = sum(n -> n%2 == 0, list);
//        System.out.println("Sum of even : " + s);
//
//        s = sum(n -> n%2 != 0, list);
//        System.out.println("Sum of odd  : " + s);
//    }
//}


//import java.util.Random;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.function.Supplier;
//
//class SupplierDemo {
//    public static List<Integer> makeIntList(Supplier<Integer> s, int n) {
//        List<Integer> list = new ArrayList<>();
//
//        for(int i = 0; i < n; i++)
//            list.add(s.get());
//
//        return list;
//    }
//
//    public static void main(String[] args) {
//        Supplier<Integer> spr = () -> {
//            Random rand = new Random();
//            return rand.nextInt(50);
//        };
//
//        List<Integer> list = makeIntList(spr, 5);
//        System.out.println(list);
//
//        list = makeIntList(spr, 10);
//        System.out.println(list);
//    }
//}


//import java.util.Random;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.function.IntSupplier;
//
//class IntSuppleirDemo {
//    public static List<Integer> makeIntList(IntSupplier is, int n) {
//        List<Integer> list = new ArrayList<>();
//
//        for(int i = 0; i < n; i++)
//            list.add(is.getAsInt());
//
//        return list;
//    }
//
//    public static void main(String[] args) {
//        IntSupplier ispr = () -> {
//            Random rand = new Random();
//            return rand.nextInt(50);
//        };
//
//        List<Integer> list = makeIntList(ispr, 5);
//        System.out.println(list);
//
//        list = makeIntList(ispr, 10);
//        System.out.println(list);
//    }
//}


//import java.util.function.Consumer;
//
//class ConsumerDemo {
//    public static void main(String[] args) {
//        Consumer<String> c = s -> System.out.println(s);
//        c.accept("Pineapple");
//        c.accept("Strawberry");
//    }
//}


//import java.util.function.ObjIntConsumer;
//
//class ObjIntConsumerDemo {
//    public static void main(String[] args) {
//        ObjIntConsumer<String> c = (s, i) -> System.out.println(i + ". " + s);
//
//        int n = 1;
//        c.accept("Toy", n++);
//        c.accept("Book", n++);
//        c.accept("Candy", n);
//    }
//}


//import java.util.function.Function;
//
//class FunctionDemo {
//    public static void main(String[] args) {
//        Function<String, Integer> f = s -> s.length();
//        System.out.println(f.apply("Robot"));
//        System.out.println(f.apply("System"));
//    }
//}


//import java.util.function.Function;
//
//class FunctionDemo2 {
//    public static void main(String[] args) {
//        Function<Double, Double> cti = d -> d* 0.393701;
//        Function<Double, Double> itc = d -> d * 2.54;
//        System.out.println("2 cm = " + cti.apply(2.0) + "inch");
//        System.out.println("1 inch = " + itc.apply(1.0) + "cm");
//    }
//}


//import java.util.List;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.function.Predicate;
//
//class RemoveIfDemo {
//    public static void main(String[] args) {
//        List<Integer> ls1 = Arrays.asList(1, -2, 3, -4, 5);
//        ls1 = new ArrayList<>(ls1);
//
//        List<Double> ls2 = Arrays.asList(-1.1, 2.2, 3.3, -4.4, 5.5);
//        ls2 = new ArrayList<>(ls2);
//
//        Predicate<Number> p = n -> n.doubleValue() < 0.0;
//        ls1.removeIf(p);
//        ls2.removeIf(p);
//
//        System.out.println(ls1);
//        System.out.println(ls2);
//    }
//}


//import java.util.List;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.function.Consumer;
//
//class JustSort {
//    public void sort(List<?> lst) {
//        Collections.reverse(lst);
//    }
//}
//
//class ArrangeList3 {
//    public static void main(String[] args) {
//        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
//        ls = new ArrayList<>(ls);
//        JustSort js = new JustSort();
//
//        Consumer<List<Integer>> c = js::sort;
//        c.accept(ls);
//        System.out.println(ls);
//    }
//}

// p.696


//import java.util.List;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.function.Consumer;
//
//class JustSort {
//    public void sort(List<?> lst) {
//        Collections.reverse(lst);
//    }
//}
//
//class ArrangeList4 {
//    public static void main(String[] args) {
//        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
//        ls = new ArrayList<>(ls);
//        JustSort js = new JustSort();
//
//        Consumer<List<Integer>> c = js::sort;
//        c.accept(ls);
//        System.out.println(ls);
//    }
//}


//import java.util.List;
//import java.util.Arrays;
//
//class ForEachDemo {
//    public static void main(String[] args) {
//        List<String> ls = Arrays.asList("Box", "Robot");
//        ls.forEach(s -> System.out.println(s));
//        ls.forEach(System.out::println);
//    }
//}


//import java.util.function.ToIntBiFunction;
//
//class IBox {
//    private int n;
//    public IBox(int i) {n=i;}
//    public int larger(IBox b) {
//        if(n > b.n)
//            return n;
//        else
//            return b.n;
//    }
//}
//
//class NoObjectMethodRef {
//    public static void main(String[] args) {
//        IBox ib1 = new IBox(5);
//        IBox ib2 = new IBox(7);
//
//        ToIntBiFunction<IBox, IBox> bf = (b1, b2) -> b1.larger(b2);
//        int bigNum = bf.applyAsInt(ib1, ib2);
//        System.out.println(bigNum);
//    }
//}


//import java.util.function.Function;
//
//class StringMaker {
//    public static void main(String[] args) {
//        Function<char[], String> f = ar -> {
//            return new String(ar);
//        };
//
//        char[] src = {'R', 'o', 'b', 'o', 't'};
//        String str = f.apply(src);
//        System.out.println(str);
//    }
//}


//class Friend {
//    String name;
//    Company cmp;
//
//    public Friend(String n, Company c) {
//        name = n;
//        cmp = c;
//    }
//    public String getName() {
//        return name;
//    }
//    public Company getCmp() {
//        return cmp;
//    }
//}
//
//class Company {
//    String cName;
//    ContInfo cInfo;
//
//    public Company(String cn, ContInfo ci) {
//        cName = cn;
//        cInfo = ci;
//    }
//    public String getCName() {
//        return cName;
//    }
//    public ContInfo getCInfo() {
//        return cInfo;
//    }
//}
//
//class ContInfo {
//    String phone;
//    String adrs;
//
//    public ContInfo(String ph, String ad) {
//        phone = ph;
//        adrs = ad;
//    }
//    public String getPhone() {
//        return phone;
//    }
//    public String getAdrs() {
//        return adrs;
//    }
//}
//
//class NullPointerCaseStudy {
//    public static void showCompAddr(Friend f) {
//        String addr = null;
//
//        if(f != null) {
//            Company com = f.getCmp();
//            if(com != null) {
//                ContInfo info = com.getCInfo();
//                if(info != null)
//                    addr = info.getAdrs();
//            }
//        }
//
//        if(addr != null)
//            System.out.println(addr);
//        else
//            System.out.println("There's no address information");
//    }
//
//    public static void main(String[] args) {
//        ContInfo ci = new ContInfo("321-444-577", "Republic of Korea");
//        Company cp = new Company("Yaho Co., Ltd.", ci);
//        Friend frn = new Friend("LEE SU", cp);
//        showCompAddr(frn);
//    }
//}


//import java.util.Optional;
//
//class StringOptional1 {
//    public static void main(String[] args) {
//        Optional<String> os1 = Optional.of(new String("Toy1"));
//        Optional<String> os2 = Optional.ofNullable(new String("Toy2"));
//
//        os1.ifPresent(s -> System.out.println(s));
//        os2.ifPresent(System.out::println);
//    }
//}


//class ContInfo {
//    String phone;
//    String adrs;
//
//    public ContInfo(String ph, String ad) {
//        phone = ph;
//        adrs = ad;
//    }
//    public String getPhone() {
//        return phone;
//    }
//    public String getAdrs() {
//        return adrs;
//    }
//}
//
//class IfElseOptional {
//    public static void main(String[] args) {
//        ContInfo ci = new ContInfo(null, "Republic of Korea");
//        String phone;
//        String addr;
//
//        if(ci.phone != null)
//            phone = ci.getPhone();
//        else
//            phone = "There is no phone number.";
//
//        if(ci.adrs != null)
//            addr = ci.getAdrs();
//        else
//            addr = "There is no address.";
//
//        System.out.println(phone);
//        System.out.println(addr);
//    }
//}


//import java.util.Optional;
//
//class OptionalMap {
//    public static void main(String[] args) {
//        Optional<String> os1 = Optional.of("Optional String");
//        Optional<String> os2 = os1.map(s -> s.toUpperCase());
//        System.out.println(os2.get());
//
//        Optional<String> os3 = os1.map(s -> s.replace(' ', '_'))
//                .map(s-> s.toLowerCase());
//        System.out.println(os3.get());
//    }
//}


//import java.util.Optional;
//
//class OptionalOrElse {
//    public static void main(String[] args) {
//        Optional<String> os1 = Optional.empty();
//        Optional<String> os2 = Optional.of("So basic");
//
//        String s1;
//        s1 = os1.map(String::toString)
//                .orElse("Empty");
//
//        String s2 = os2.map(String::toString)
//                .orElse("Empty");
//
//        System.out.println(s1);
//        System.out.println(s2);
//    }
//}


//import java.util.Optional;
////
////class ContInfo {
////    String phone;
////    String adrs;
////
////    public ContInfo(String ph, String ad) {
////        phone = ph;
////        adrs = ad;
////    }
////    public String getPhone() {
////        return phone;
////    }
////    public String getAdrs() {
////        return adrs;
////    }
////}
////
////class MapElseOptional {
////    public static void main(String[] args) {
////        Optional<ContInfo> ci = Optional.of(new ContInfo(null, "Republic of Korea"));
////
////        String phone = ci.map(c -> c.getPhone())
////                .orElse("There is no phone number.");
////        String addr = ci.map(c -> c.getAdrs())
////                .orElse("There is no address");
////
////        System.out.println(phone);
////        System.out.println(addr);
////    }
////}


//import java.util.Optional;
//
//class Friend {
//    String name;
//    Company cmp;
//
//    public Friend(String n, Company c) {
//        name = n;
//        cmp = c;
//    }
//    public String getName() {
//        return name;
//    }
//    public Company getCmp() {
//        return cmp;
//    }
//}
//
//class Company {
//    String cName;
//    ContInfo cInfo;
//
//    public Company(String cn, ContInfo ci) {
//        cName = cn;
//        cInfo = ci;
//    }
//    public String getCName() {
//        return cName;
//    }
//    public ContInfo getCInfo() {
//        return cInfo;
//    }
//}
//
//class ContInfo {
//    String phone;
//    String adrs;
//
//    public ContInfo(String ph, String ad) {
//        phone = ph;
//        adrs = ad;
//    }
//    public String getPhone() {
//        return phone;
//    }
//    public String getAdrs() {
//        return adrs;
//    }
//}
//
//class NullPointerCaseStudy2 {
//    public static void showCompAddr(Optional<Friend> f) {
//        String addr = f.map(Friend::getCmp)
//                .map(Company::getCInfo)
//                .map(ContInfo::getAdrs)
//                .orElse("There's no address information.");
//
//        System.out.println(addr);
//    }
//
//    public static void main(String[] args) {
//        ContInfo ci = new ContInfo("321-444-577", "Republic of Korea");
//        Company cp = new Company("YaHo Co., Ltd.", ci);
//        Friend frn = new Friend("LEE SU", cp);
//        showCompAddr(Optional.of(frn));
//    }
//}


//import java.util.Optional;
//
//class OptionalFlatMap {
//    public static void main(String[] args) {
//        Optional<String> os1 = Optional.of("Optional String");
//        Optional<String> os2 = os1.map(String::toUpperCase);
//        System.out.println(os2.get());
//
//        Optional<String> os3 = os1.flatMap(s -> Optional.of(s.toLowerCase()));
//        System.out.println(os3.get());
//    }
//}


//import java.util.Optional;
//
//class ContInfo {
//    Optional<String> phone;
//    Optional<String> adrs;
//
//    public ContInfo(Optional<String> ph, Optional<String> ad) {
//        phone = ph;
//        adrs = ad;
//    }
//    public Optional<String> getPhone() {
//        return phone;
//    }
//    public Optional<String> getAdrs() {
//        return adrs;
//    }
//}
//
//class FlatMapElseOptional {
//    public static void main(String[] args) {
//        Optional<ContInfo> ci = Optional.of(
//                new ContInfo(Optional.ofNullable(null), Optional.of("Republic of Korea"))
//        );
//
//        String phone = ci.flatMap(ContInfo::getPhone)
//                .orElse("There is no phone number.");
//        String addr = ci.flatMap(ContInfo::getAdrs)
//                .orElse("There is no address.");
//        System.out.println(phone);
//        System.out.println(addr);
//    }
//}


//import java.util.Optional;
//
//class Friend {
//    String name;
//    Optional<Company> cmp;
//
//    public Friend(String n, Optional<Company> c) {
//        name = n;
//        cmp = c;
//    }
//    public String getName() {
//        return name;
//    }
//    public Optional<Company> getCmp() {
//        return cmp;
//    }
//}
//
//class Company {
//    String cName;
//    Optional<ContInfo> cInfo;
//
//    public Company(String cn, Optional<ContInfo> ci) {
//        cName = cn;
//        cInfo = ci;
//    }
//    public String getCName() {
//        return cName;
//    }
//    public Optional<ContInfo> getCInfo() {
//        return cInfo;
//    }
//}
//
//class ContInfo {
//    Optional<String> phone;
//    Optional<String> adrs;
//
//    public ContInfo(Optional<String> ph, Optional<String> ad) {
//        phone = ph;
//        adrs = ad;
//    }
//    public Optional<String> getPhone() {
//        return phone;
//    }
//    public Optional<String> getAdrs() {
//        return adrs;
//    }
//}
//
//class NullPointerCaseStudy3 {
//    public static void showCompAddr(Optional<Friend> f) {
//        String addr = f.flatMap(Friend::getCmp)
//                .flatMap(Company::getCInfo)
//                .flatMap(ContInfo::getAdrs)
//                .orElse("There's no address information.");
//
//        System.out.println(addr);
//    }
//
//    public static void main(String[] args) {
//        Optional<ContInfo> ci = Optional.of(
//                new ContInfo(Optional.ofNullable(null), Optional.of("Republic of Korea"))
//        );
//        Optional<Company> cp = Optional.of(new Company("YaHo Co., Ltd.", ci));
//        Optional<Friend> frn = Optional.of(new Friend("LEE SU", cp));
//        showCompAddr(frn);
//    }
//}


//import java.util.OptionalInt;
//
//class OptionalBase {
//    public static void main(String[] args) {
//        OptionalInt oi1 = OptionalInt.of(3);
//        OptionalInt oi2 = OptionalInt.empty();
//
//        System.out.print("[Step 1.] : ");
//        oi1.ifPresent(i -> System.out.print(i + "\t"));
//        oi2.ifPresent(System.out::print);
//        System.out.println();
//
//        System.out.print("[Step 2.] : ");
//        System.out.print(oi1.orElse(100) + "\t");
//        System.out.print(oi2.orElse(100) + "\t");
//        System.out.println();
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
//        return "I am an orange";
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
//class FruitAndBox_Generic {
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

// p.490


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
//        return left + " & " + right;
//    }
//}
//
//class MultiTypeParam {
//    public static void main(String[] args) {
//        DBox<String, Integer> box = new DBox<String, Integer>();
//        box.set("Apple", 25);
//        System.out.println(box);
//    }
//}


//class Box<T> {
//    private T ob;
//    public void set(T o) {
//        this.ob = o;
//    }
//    public T get() {
//        return ob;
//    }
//}
//
//class Primitives {
//    public static void main(String[] args) {
//        Box<Integer> iBox = new Box<Integer>();
//        iBox.set(125);
//        int num = iBox.get();
//        System.out.println(num);
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
//class BoxinBox {
//    public static void main(String[] args) {
//        Box<String> sBox = new Box<>();
//        sBox.set("I am so happy.");
//
//        Box<Box<String>> wBox = new Box<>();
//        wBox.set(sBox);
//
//        Box<Box<Box<String>>> zBox = new Box<>();
//        zBox.set(wBox);
//
//        System.out.println(zBox.get().get().get());
//    }
//}


//interface Eatable {
//    public String eat();
//}
//
//class Apple implements Eatable {
//    public String toString() {
//        return "I am an apple.";
//    }
//
//    @Override
//    public String eat() {
//        return "It tastes so good";
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
//        System.out.println(ob.eat());
//        return ob;
//    }
//}
//
//class BoundedInter {
//    public static void main(String[] args) {
//        Box<Apple> box = new Box<>();
//        box.set(new Apple());
//
//        Apple ap = box.get();
//        System.out.println(ap);
//    }
//}


//class Box<T> {
//    private T ob;
//
//    public void set(T o) {
//        this.ob = o;
//    }
//
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
//class GenericMethodBoxMaker {
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
//        return this.ob;
//    }
//}
//
//class Unboxer {
//    public static <T> T openBox(Box<T> box) {
//        return box.get();
//    }
//}
//
//class GenericMethodBoxMaker2 {
//    public static void main(String[] args) {
//        Box<String> box = new Box<>();
//        box.set("My Generic Method");
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
//
//    public T get() {
//        return ob;
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
//class BoundedGenericMethod {
//    public static void main(String[] args) {
//        Box<Integer> sBox = BoxFactory.makeBox(5959);
//        int n = Unboxer.openBox(sBox);
//        System.out.println("Returned data: " + n);
//    }
//}

// p.510


//class Box<T> {
//    private T ob;
//    public void set(T o) {
//        ob = o;
//    }
//    public T get() {
//        return this.ob;
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
//class BoxHandler {
//    public static void outBox(Box<? extends Toy> box) {
//        Toy t = box.get();
//        System.out.println(t);
//    }
//
//    public static void inBox(Box<Toy> box, Toy n) {
//        box.set(n);
//    }
//}
//
//class BoundedWildCardUsage {
//    public static void main(String[] args) {
//        Box<Toy> box = new Box<>();
//        BoxHandler.inBox(box, new Toy());
//        BoxHandler.outBox(box);
//    }
//}


//class Box<T> {
//    private T ob;
//    public void set(T o) {
//        ob = o;
//    }
//    public T get() {
//        return ob;
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
//class BoundedWildCardGenericMethod {
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

// p.538


//interface Getable<T> {
//    T get();
//}
//
//class Box<T> implements Getable<T> {
//    private T ob;
//    public void set(T o) {
//        this.ob = o;
//    }
//
//    @Override
//    public T get() {
//        return this.ob;
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
//        Getable<Toy> gt = box;
//        System.out.println(gt.get());
//    }
//}


//interface Getable<T> {
//    public T get();
//}
//
//class Box<T> implements Getable<String> {
//    private T ob;
//    public void set(T o) {
//        ob = o;
//    }
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
//class GetableGenericInterface2 {
//    public static void main(String[] args) {
//        Box<Toy> box = new Box<>();
//        box.set(new Toy());
//
//        Getable<String> gt = box;
//        System.out.println(gt.get());
//    }
//}


//import java.util.List;
//import java.util.ArrayList;
//
//class ArrayListCollection {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//
//        list.add("Toy");
//        list.add("Box");
//        list.add("Robot");
//
//        list.stream().map(s -> s + '\t').forEach(System.out::print);
//        System.out.println();
//
//        list.remove(0);
//
//        list.stream().map(s -> s + '\t').forEach(System.out::print);
//        System.out.println();
//    }
//}


//import java.util.List;
//import java.util.LinkedList;
//import java.util.Iterator;
//
//class IteratorCollection {
//    public static void main(String[] args) {
//        List<String> list = new LinkedList<>();
//        list.add("Toy");
//        list.add("Box");
//        list.add("Robot");
//        list.add("Box");
//
//        Iterator<String> itr = list.iterator();
//
//        while(itr.hasNext())
//            System.out.print(itr.next() + '\t');
//        System.out.println();
//
//        itr = list.iterator();
//
//        String str;
//        while(itr.hasNext()) {
//            str = itr.next();
//            if(str.equals("Toy"))
//                itr.remove();
//        }
//
//        itr = list.iterator();
//
//        while(itr.hasNext())
//            System.out.print(itr.next() + '\t');
//        System.out.println();
//    }
//}


//import java.util.*;
//
//class AsListCollection {
//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
//        list = new ArrayList<>(list);
//
//        for (String value : list) System.out.print(value + '\t');
//        System.out.println();
//
//        list = new LinkedList<>(list);
//
//        list.stream().map(s -> s + '\t').forEach(System.out::print);
//        System.out.println();
//    }
//}


//import java.util.Iterator;
//import java.util.LinkedList;
//
//class PrimitiveCollection {
//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(10); list.add(20); list.add(30);
//
//        int n;
//        for(Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
//            n = itr.next();
//            System.out.print(n + "\t");
//        }
//        System.out.println();
//    }
//}


//import java.util.HashSet;
//
//class Num {
//    private int num;
//    public Num(int n) {num = n;}
//
//    @Override
//    public String toString() {
//        return String.valueOf(num);
//    }
//}
//
//class HashSetEqualityOne {
//    public static void main(String[] args) {
//        HashSet<Num> set = new HashSet<>();
//        set.add(new Num(7799));
//        set.add(new Num(9955));
//        set.add(new Num(7799));
//        System.out.println("Num of Instances: " + set.size());
//
//        set.stream().map(n -> n.toString() + '\t').forEach(System.out::print);
//        System.out.println();
//    }
//}


//import java.util.HashSet;
//
//class Num {
//    private int num;
//    public Num(int n) {
//        num = n;
//    }
//
//    @Override
//    public String toString() {
//        return String.valueOf(num);
//    }
//
//    @Override
//    public int hashCode() {
//        return num % 3;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if(num == ((Num)obj).num)
//            return true;
//        else
//            return false;
//    }
//}
//
//class HashSetEqualityTwo {
//    public static void main(String[] args) {
//        HashSet<Num> set = new HashSet<>();
//        set.add(new Num(7799));
//        set.add(new Num(9955));
//        set.add(new Num(7799));
//        System.out.println("Num of Instances : " + set.size());
//
//        set.stream().map(n -> n.toString() + '\t').forEach(System.out::print);
//        System.out.println();
//    }
//}


//import java.util.HashSet;
//
//class Car {
//    private String model;
//    private String color;
//
//    public Car(String m, String c) {
//        model = m;
//        color = c;
//    }
//
//    @Override
//    public String toString() {
//        return model + " : " + color;
//    }
//
//    @Override
//    public int hashCode() {
//        return (model.hashCode() + color.hashCode()) / 2;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        String m = ((Car)obj).model;
//        String c = ((Car)obj).color;
//
//        if(model.equals(m) && color.equals(c))
//            return true;
//        else
//            return false;
//    }
//}
//
//class HowHashCode {
//    public static void main(String[] args) {
//        HashSet<Car> set = new HashSet<>();
//        set.add(new Car("HY_MD_301", "RED"));
//        set.add(new Car("HY_MD_301", "BLACK"));
//        set.add(new Car("HY_MD_301", "RED"));
//        set.add(new Car("HY_MD_302", "WHITE"));
//        set.add(new Car("HY_MD_301", "BLACK"));
//        System.out.println("Num of Instances : " + set.size());
//
//        for(Car car : set)
//            System.out.println(car.toString() + '\t');
//    }
//}


//import java.util.TreeSet;
//import java.util.Iterator;
//
//class Person implements Comparable<Person> {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return name + " : " + age;
//    }
//
//    @Override
//    public int compareTo(Person p) {
//        return this.age - p.age;
//    }
//}
//
//class ComparablePerson {
//    public static void main(String[] args) {
//        TreeSet<Person> tree = new TreeSet<>();
//        tree.add(new Person("YOON", 37));
//        tree.add(new Person("HONG", 53));
//        tree.add(new Person("PARK", 22));
//
//        tree.forEach(System.out::println);
//    }
//}


//import java.util.TreeSet;
//import java.util.Iterator;
//import java.util.Comparator;
//
//class Person implements Comparable<Person> {
//    String name;
//    int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return name + " : " + age;
//    }
//
//    @Override
//    public int compareTo(Person p) {
//        return this.age - p.age;
//    }
//}
//
//class PersonComparator implements Comparator<Person> {
//    public int compare(Person p1, Person p2) {
//        return p2.age - p1.age;
//    }
//}
//
//class ComparatorPerson {
//    public static void main(String[] args) {
//        TreeSet<Person> tree = new TreeSet<>(new PersonComparator());
//        tree.add(new Person("YOON", 37));
//        tree.add(new Person("HONG", 53));
//        tree.add(new Person("PARK", 22));
//
//        for(Person p : tree)
//            System.out.println(p);
//    }
//}


//import java.util.List;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.HashSet;
//
//class ConvertCollection {
//    public static void main(String[] args) {
//        List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy");
//        ArrayList<String> list = new ArrayList<>(lst);
//
//        for(String s : list)
//            System.out.print(s.toString() + '\t');
//        System.out.println();
//
//        HashSet<String> set = new HashSet<>(list);
//
//        list = new ArrayList<>(set);
//
//        for(String s : list)
//            System.out.print(s.toString() + '\t');
//        System.out.println();
//    }
//}


//import java.util.Queue;
//import java.util.LinkedList;
//
//class LinkedListQueue {
//    public static void main(String[] args) {
//        Queue<String> que = new LinkedList<>();
//        que.offer("Box");
//        que.offer("Toy");
//        que.offer("Robot");
//
//        System.out.println("next: " + que.peek());
//        System.out.println("next: " + que.peek());
//        System.out.println("next: " + que.peek());
//        System.out.println("next: " + que.peek());
//
//    }
//}


//import java.util.Deque;
//import java.util.ArrayDeque;
//
//interface DIStack<E> {
//    public boolean push(E item);
//    public E pop();
//}
//
//class DCStack<E> implements DIStack<E> {
//    private Deque<E> deq;
//
//    public DCStack(Deque<E> d) {
//        deq = d;
//    }
//    public boolean push(E item) {
//        return deq.offerFirst(item);
//    }
//    public E pop() {
//        return deq.pollFirst();
//    }
//}
//
//class DefineStack {
//    public static void main(String[] args) {
//        DIStack<String> stk = new DCStack<>(new ArrayDeque<String>());
//
//        stk.push("1.Box");
//        stk.push("2.Toy");
//        stk.push("3.Robot");
//
//        System.out.println(stk.pop());
//        System.out.println(stk.pop());
//        System.out.println(stk.pop());
//    }
//}


//import java.util.HashMap;
//
//class HashMapCollection {
//    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//
//        map.put(45, "Brown");
//        map.put(37, "James");
//        map.put(23, "Martin");
//
//        System.out.println("No.23 : " + map.get(23));
//        System.out.println("No.37 : " + map.get(37));
//        System.out.println("No.45 : " + map.get(45));
//        System.out.println();
//
//        map.remove(37);
//
//        System.out.println("No.37: " + map.get(37));
//    }
//}


//import java.util.HashMap;
//import java.util.Set;
//
//class HashMapIteration {
//    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(45, "Brown");
//        map.put(37, "James");
//        map.put(23, "Martin");
//
//        Set<Integer> ks = map.keySet();
//
//        ks.stream().map(n -> n.toString() + '\t').forEach(System.out::print);
//        System.out.println();
//
//        ks.stream().map(n -> map.get(n).toString() + '\t').forEach(System.out::print);
//        System.out.println();
//
//        ks.stream().map(k -> map.get(k) + '\t').forEach(System.out::print);
//        System.out.println();
//    }
//}


//import java.util.TreeMap;
//import java.util.Iterator;
//import java.util.Set;
//
//class TreeMapIteration {
//    public static void main(String[] args) {
//        TreeMap<Integer, String> map = new TreeMap<>();
//        map.put(45, "Brown");
//        map.put(37, "James");
//        map.put(23, "Martin");
//
//        Set<Integer> ks = map.keySet();
//
//        for(Integer n : ks)
//            System.out.print(n.toString() + '\t');
//        System.out.println();
//
//        for(Integer n : ks)
//            System.out.print(map.get(n).toString() + '\t');
//        System.out.println();
//
//        for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
//            System.out.print(map.get(itr.next()) + '\t');
//        System.out.println();
//    }
//}


// p.668


//interface Calculate {
//    int cal(int a, int b);
//}
//
//class TwoParamAndReturn {
//    public static void main(String[] args) {
//        Calculate c;
//        c = (a, b) -> {
//            return a + b;
//        };
//        System.out.println(c.cal(4, 3));
//
//        c = (a, b) -> a + b;
//        System.out.println(c.cal(4, 3));
//    }
//}


//import java.util.Arrays;
//
//class MyFirstStream2 {
//    public static void main(String[] args) {
//        int[] ar = {1, 2, 3, 4, 5};
//
//        int sum = Arrays.stream(ar)
//                .filter(n -> n%2 == 1)
//                .sum();
//        System.out.println(sum);
//    }
//}


//import java.util.List;
//import java.util.ArrayList;
//
//class ToyPriceInfo {
//    private String model;
//    private int price;
//
//    public ToyPriceInfo(String m, int p) {
//        model = m;
//        price = p;
//    }
//    public int getPrice() {
//        return price;
//    }
//}
//
//class ToyStream {
//    public static void main(String[] args) {
//        List<ToyPriceInfo> ls = new ArrayList<>();
//        ls.add(new ToyPriceInfo("GUN_LR_45", 200));
//        ls.add(new ToyPriceInfo("TEDDY_BEAR_S_014", 350));
//        ls.add(new ToyPriceInfo("CAR_TRANSFORM_VER_7719", 550));
//
//        int sum = ls.stream()
//                .filter(p -> p.getPrice() < 500)
//                .mapToInt(t -> t.getPrice())
//                .sum();
//        System.out.println("Sum = " + sum);
//    }
//}

















