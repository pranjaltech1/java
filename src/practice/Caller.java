package practice;

public class Caller implements MyInterface{
    @Override
    public void sayHello() {

    }

    @Override
    public void say() {
        MyInterface.super.say();
    }


}
