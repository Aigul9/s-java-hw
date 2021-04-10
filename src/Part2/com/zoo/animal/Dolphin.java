package Part2.com.zoo.animal;

public class Dolphin extends Animal {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("squeak");
    }

    @Override
    public void eat() {
        System.out.println("Dolphin is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dolphin is sleeping.");
    }
}
