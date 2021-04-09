package Part1.com.zoo.animal;

public class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("hrrr");
    }

    public void hide() {
        System.out.println(name + " is hiding.");
    }

    public void jump() {
        System.out.println(name + " is jumping.");
    }
}
