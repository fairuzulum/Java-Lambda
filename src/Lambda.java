import java.util.function.Consumer;
import java.util.function.Function;

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

        Calculation sub = (first, second) -> first + second;

        int num = sub.doCalc(10, 20);
        System.out.println(num);


        // Builtin Functional Interface
        // Interface Comsumer

        Consumer<String> gretting = name -> System.out.println("Hello: " + name);
        gretting.accept("Seep");


        // Interface Function
        Function<Integer, Boolean> isOdd = number -> number % 2 == 1;
        System.out.println(isOdd.apply(11));

        



    }
}
