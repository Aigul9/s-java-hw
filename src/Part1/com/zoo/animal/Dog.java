package Part1.com.zoo.animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("woof");
    }

    public void wag() {
        System.out.println(name + " is wagging the tail.");
    }

    public void embrace() {
        System.out.println(name + " is embracing his owner.");
    }
}
