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
    public void getAction() {
        System.out.println("Wag the tail.");
    }
}
