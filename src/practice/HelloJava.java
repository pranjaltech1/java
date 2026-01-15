package practice;
import java.net.SocketTimeoutException;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class HelloJava implements MyInterface {
    public static void main(String[] arrr) {
        //functional interface madhli method implement keliye
        //here lamda expression is using functionl interface as a datatype
        Employee employee= () -> "Software Enginner";
        System.out.println(employee.getName());

        System.out.println("lambda expressions");
        //remove access modifier,return type,method name , place arrow

        //static method
        MyInterface.hey();
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