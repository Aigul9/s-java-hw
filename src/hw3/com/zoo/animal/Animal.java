package hw3.com.zoo.animal;

public abstract class Animal implements IMovable {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void say();

    public abstract void getAction();

    public void create(String name) {
        System.out.println(name + " is created.");
    }

    public void create(String name, String area) {
        System.out.println(name + " is living in " + area + ".");
    }
}
