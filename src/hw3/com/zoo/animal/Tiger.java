package hw3.com.zoo.animal;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("growl");
    }

    @Override
    public void getAction() {
        System.out.println("Hunt.");
    }
}
