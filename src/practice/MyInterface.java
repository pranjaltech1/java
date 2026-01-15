package practice;
@FunctionalInterface
public interface MyInterface {

    //single abstract method,after java 8 default and static methods allowed
    //abstract method- no body
    public void sayHello();

    //default method- can be overriden
    default public void say(){
        System.out.println("hello");
    }

    //static method- It can be only called using interface name
    //cannot be overriden
    static void hey(){
        System.out.println("heyy");
    }
}
