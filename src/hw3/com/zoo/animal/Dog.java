package hw3.com.zoo.animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}
