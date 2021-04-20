package hw3.com.zoo.animal;

public class Dolphin extends Animal {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("squeak");
    }

    @Override
    public void getAction() {
        System.out.println("Swim.");
    }
}
