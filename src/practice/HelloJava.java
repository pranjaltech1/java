package practice;
import java.util.Scanner;
public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.println("avni");
        System.out.println(3+5);
        String name="avani";
        System.out.println(name);
        System.out.println("enter name");
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        System.out.println(name1);

        final int num=1000000000;
     byte num2=127;

     int  num1=5;
     long num3=num2;//automatic/widening

        int num4=346537855;
        short num5= (short) num4;//narrowing,implicit typecasting

        int a=4;
        int b=5;

        int[] marks={1,2,3,4,5};
        for(int i=0;i<=4
                ;i++){
            System.out.println(marks[i]);
        }

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a>b);

        String namee="positive";
        String name2="cutie";
        System.out.println(namee.length());
        System.out.println(namee.toUpperCase());
        System.out.println(namee.indexOf("i"));

        System.out.println(namee.equals(name2));

        String text="     Hello World    ";
        System.out.println(text);
        System.out.println(text.trim());

        String x="10";
        int y=20;
        String z=x+y;


        if(a>b){
            System.out.println(" a is greater ");
        }
        else{
            System.out.println("b is greater ");
        }

        for(int i=5;i<10;i++){
            System.out.println(i);
        }

        Example.greet();
        int sum= Example.addNumbers(10,20);
        System.out.println(sum);

        String msg=Example.message();
        System.out.println(msg);

        //method with arguments
        int mul=Example.multiplication(3,4);
        System.out.println(mul);

        int aa=10;
        Example.modify(aa);
        System.out.println("outside method"+aa);

        Person p1=new Person("viha");
        System.out.println(p1.name);
        p1.changeName(p1);
        System.out.println(p1.name);
     Dog d1=new Dog();
     d1.bark();
     d1.voice();

    }
}
class Animal{
    void bark(){
        System.out.println("bhow");
    }
}
class Dog extends Animal{
    void voice(){
        System.out.println("bhowwwwwwwwwwwww");
    }
}
class Person{
    String name;
    Person(String name){
        this.name=name;
    }

    static int add(int a, int b ){
        return a+b;
    }

    static int add(int a, int b,int c ){
        return a+b+c;
    }

    static void changeName(Person p ){
        p.name="shambhu";
    }
}
class Example{
   static void greet(){
        System.out.println("hello");
    }

    //method to add two numbers
    static int addNumbers(int a, int b ){
       return a+b;
    }

    static String message(){
       return "hello from message method";
    }

    static int  multiplication(int a,int b){
       return a*b;
    }
    //passing primitive data types
    static void modify(int a ){
       a=a+10;
        System.out.println("inside method"+a);

    }
}
