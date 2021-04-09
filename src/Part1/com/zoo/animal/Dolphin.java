package Part1.com.zoo.animal;

public class Dolphin extends Animal {
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("squeak");
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }

    public void imitate() {
        System.out.println(name + " is imitating other voices.");
    }
}
