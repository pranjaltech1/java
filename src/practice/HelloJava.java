package practice;
import java.util.*;

public class HelloJava {
    public static void main(String[] args) {

        List<String> list =new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("mango");

        System.out.println(list);



















        Vehicle car = new Car(120, "Petrol");
        car.showInfo();
        car.move();

        System.out.println();

        Vehicle airplane = new Airplane(800, "Jet Fuel");
        airplane.showInfo();
        airplane.move();

        Cat.meow();


        try{
            int result=10/0;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("exception occured ");
        }

    }}

