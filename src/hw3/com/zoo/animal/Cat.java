package hw3.com.zoo.animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("meow");
    }

    @Override
    public void getAction() {
        System.out.println("Embrace.");
    }
}
