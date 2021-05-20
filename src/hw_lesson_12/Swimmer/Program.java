package hw_lesson_12.Swimmer;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Program {
    public static void main(String[] args) {
        Swimmer swimmer = new Swimmer("Swimmer", 29);
        swimmer.swim(System.out::println);
        Supplier<String> s = () -> swimmer.name;
        System.out.println(s.get());
        BiConsumer<String, Integer> setProps = (String name, Integer age) -> {
            swimmer.name = name;
            swimmer.age = age;
        };
        setProps.accept("Swimmer1", 25);
        swimmer.print();
    }
}
