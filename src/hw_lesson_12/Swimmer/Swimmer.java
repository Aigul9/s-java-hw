package hw_lesson_12.Swimmer;

import java.util.function.Consumer;

public class Swimmer {
    String name;
    Integer age;

    public Swimmer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void swim(Consumer<String> c) {
        c.accept(name);
    }

    public void print() {
        System.out.println(String.format("%s %s%s %s.", "Name:", name, ". Age:", age));
    }
}
