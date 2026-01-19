package practice;
import java.net.SocketTimeoutException;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;


public class HelloJava implements MyInterface {
    public static void main(String[] arrr) {


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