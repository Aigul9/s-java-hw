package Part1.com.zoo.animal;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("roar");
    }

    public void roar() {
        System.out.println(name + " is roaring.");
    }

    public void guard() {
        System.out.println(name + " is guarding.");
    }
}
