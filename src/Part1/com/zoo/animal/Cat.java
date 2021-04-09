package Part1.com.zoo.animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("meow");
    }

    public void play() {
        System.out.println(name + " is playing with a ball.");
    }

    public void scratch() {
        System.out.println(name + " is scratching.");
    }
}
