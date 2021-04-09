package Part1.com.zoo.animal;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("growl");
    }

    public void hunt() {
        System.out.println(name + " is hunting.");
    }

    public void run() {
        System.out.println(name + " is running.");
    }
}
