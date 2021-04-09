package Part2.com.zoo.animal;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("growl");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger is sleeping.");
    }
}
