package hw3.com.zoo;

import hw3.com.zoo.animal.Cat;
import hw3.com.zoo.animal.Rabbit;

public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat("cat");
        cat.say();

        Rabbit rabbit = new Rabbit("Jenny");
        rabbit.say();
        rabbit.eat();
        rabbit.sleep();
        rabbit.hide();

        rabbit.create("Jenny");
        rabbit.create("Jenny", "New Zealand");
    }
}
