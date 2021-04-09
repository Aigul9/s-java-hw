package Part1.com.zoo.animal;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println(name);
    }

    public void eat() {
        System.out.println("I'm eating...");
    }

    public void sleep() {
        System.out.println("I'm sleeping...");
    }
}
