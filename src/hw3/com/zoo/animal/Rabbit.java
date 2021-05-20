package hw3.com.zoo.animal;

public class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("hrrr");
    }

    @Override
    public void getAction() {
        System.out.println("Hide");
    }
}
