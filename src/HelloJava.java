

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.println("avni");
        System.out.println(3+5);
        String name="avani";
        System.out.println(name);

        final int num=1000000000;
     byte num2=127;

     int  num1=5;
     long num3=num2;//automatic/widening

        int num4=346537855;
        short num5= (short) num4;//narrowing,implicit typecasting

        int a=4;
        int b=5;


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







    }
}
