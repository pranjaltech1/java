package practice;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloJava  {


    }
    public static void main(String[] arrr) {
        System.out.println("Streams");
        // Case 1: Value is present
        Optional<String> name = Optional.of("Pranjal");

        // Case 2: Value might be missing
        Optional<String> nickname = Optional.ofNullable(null);

        // Very simple ways to use it
        System.out.println("Name is present? " + name.isPresent());          // true
        System.out.println("Nickname is present? " + nickname.isPresent());  // false

        // Safest way - do something only if value exists
        name.ifPresent(n -> System.out.println("Hello " + n));               // Hello Pranjal

        // Get value with default if missing
        String displayName = nickname.orElse("Guest");
        System.out.println("Display name: " + displayName);                  // Guest

        // One-liner popular in interviews
        System.out.println(
                Optional.ofNullable(getMood())
                        .orElse("I don't know how I feel today")

        //to create stream from list
        List<String> fruit=Arrays.asList("apple","banana","cherry");
        Stream<String> fruits=fruit.stream();
        //to create stream from arrays
        String[] flower={"rose","lily","lotus"};
        Stream<String> flowers=Arrays.stream(flower);
        //to create directly comma separated stream
        Stream.of("12,34,45,67,78");



        //to print even numbers using streams
        List<Integer>  nums=Arrays.asList(2,3,4,2,6,8,13,24,34,56,75,87);
        List<Integer> EvenList=nums
                .stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
        System.out.println(EvenList);
        //divide that even stream by 2
        List<Integer> EvenDivide =EvenList
                .stream()
                .map(x->x/2)
                .distinct()
                .sorted()
                .limit(50)
                .collect(Collectors.toList());
        System.out.println(EvenDivide);

        //print numbers  from 1 to 100, only even numbers
        List<Integer> numbers=Stream.iterate(0,x->x+1)
                .limit(100)
                .skip(1)
                .filter(x->x%2==0)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(numbers);

        //min(),max(),count()
        //count() returns long
        //min(),max() returns optional
        Integer integer=Stream.iterate(0,x->x+1).limit(100).map(x->x/20).distinct().peek(System.out::println).max((a,b)->a-b).get();
        System.out.println(integer);

    }

// Helper method that sometimes returns null
static String getMood() {
    return null;   // or "Happy" to see difference
}

}