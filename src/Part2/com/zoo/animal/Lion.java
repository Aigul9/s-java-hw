package Part2.com.zoo.animal;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("roar");
    }

    @Override
    public void eat() {
        System.out.println("Lion is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping.");
    }
}
