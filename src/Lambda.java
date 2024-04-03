import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda{
    public static void main(String[] args) {
//        Greeting hello = new Greeting() {
//            @Override
//            public void sayHello() {
//                System.out.println("Ready for today?");
//            }
//        };
//        hello.sayHello();

//        Greeting hello1 = (String name) -> System.out.println("Hello " + name + " Ready for today?");
//        hello1.sayHello("Fairuz");

//        Greeting hello = name -> System.out.println("Hello, " + name + " Ready for Today");
//        hello.sayHello("Fairuz");

//        Calculation sub = (first, second) -> first + second;
//
//        int num = sub.doCalc(10, 20);
//        System.out.println(num);
//
//
//        // Builtin Functional Interface
//        // Interface Comsumer
//
//        Consumer<String> gretting = name -> System.out.println("Hello: " + name);
//        gretting.accept("Seep");
//
//
//        // Interface Function
//        Function<Integer, Boolean> isOdd = number -> number % 2 == 1;
//        System.out.println(isOdd.apply(11));
//
//
        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6));

//        Consumer<Integer> dikali2 = number -> {
//            int result = number * 2;
//            System.out.println(result);
//        };
////        dikali2.accept(4);
//
//        nums.forEach(dikali2);
//
//        System.out.println("====");
//        nums.forEach(number -> {
//            int result = number * 2;
//            System.out.println(result);
//        });
//        System.out.println("====");
//        nums.forEach(number -> System.out.println(number * 2));
//
//
        Function<Integer, Integer> newKali2 = num1 -> {
            return  num1 * 2;
        };

        List<Integer> dikali2 = nums.stream().map(newKali2).collect(Collectors.toList());
        System.out.println("List awal : " + nums);
        System.out.println("List setelah map : " + dikali2);
        dikali2.forEach(System.out::println);

        Predicate<String> isContain = sentence -> sentence.contains("a");
        Boolean validate = isContain.test("Enigma");
        System.out.println(validate);

//        Predicate<Integer> isEven = num -> num % 2 == 0;
        List<Integer> evenNumbers = nums.stream().filter(nmbr -> nmbr % 2 == 0).toList();
        System.out.println("List awal : " + nums);
        System.out.println("List setelah filter : " + evenNumbers);

    }
}
