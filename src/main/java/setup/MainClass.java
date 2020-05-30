package setup;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("This main class runs, awesome!");
        System.out.println("It also works with Java 8 features!");

        Stream.of(1, 2, 3)
                .map(a -> a * a)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
