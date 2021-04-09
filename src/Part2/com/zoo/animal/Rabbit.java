package Part2.com.zoo.animal;

public class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("hrrr");
    }

    @Override
    public void eat() {
        System.out.println("Rabbit is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Rabbit is sleeping.");
    }
}
