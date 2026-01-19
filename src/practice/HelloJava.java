package practice;
import java.net.SocketTimeoutException;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Predicate;



public class HelloJava implements MyInterface {
    public static void main(String[] arrr) {

        //function interface

        Function<String, Integer> function1=x->x.length();
        System.out.println(function1.apply("vinit"));

        //consumer interface
        Consumer<String> consumer =s-> System.out.println(s);
        consumer.accept("Vipul");
        //supplier interface
        Supplier<Integer> s1=()->1;
        System.out.println(s1.get());
        //predicate-to check if condition is true or false
        //test() - abstract method
        Predicate<Integer> p1=(x)->x%2==0;
        System.out.println(p1.test(5));
        //function-kahitari kaam krun deto
        Function<Integer,Integer> f1=(x)->x*x;
        System.out.println(f1.apply(2));

        //consumer
        Consumer<Integer> c1= x-> System.out.println(x);
        c1.accept(10);

    }
    //abstract method
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
    //default method
    @Override
    public void say() {
        MyInterface.super.say();
    }


}