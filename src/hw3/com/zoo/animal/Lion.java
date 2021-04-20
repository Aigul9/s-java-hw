package hw3.com.zoo.animal;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("roar");
    }

    @Override
    public void getAction() {
        System.out.println("Roar.");
    }
}
