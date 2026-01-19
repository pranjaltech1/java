package practice;

public class Predicate {
   /* //functional interface madhli method implement keliye
    //here lamda expression is using functionl interface as a datatype
    Employee employee= () -> "Software Enginner";
        System.out.println(employee.getName());
    //Predicate
    //test method
    java.util.function.Predicate<Integer> salaryGreaterThanOneLac= x ->x>100000;
        System.out.println(salaryGreaterThanOneLac.test(1000000));
    java.util.function.Predicate<String> startsWithLetterV= x-> x.toLowerCase().charAt(0)=='v';
        System.out.println(startsWithLetterV.test("Vipul"));
    java.util.function.Predicate<String> endsWithLetterV= x->x.toLowerCase().charAt(x.length()-1)=='l';
        System.out.println(endsWithLetterV.test("Vipul"));
    //and or
    java.util.function.Predicate<String> or=startsWithLetterV.or(endsWithLetterV);
        System.out.println(or.test("Vipul"));
    //negate
        System.out.println(startsWithLetterV.negate().test("vipul"));*/
}
