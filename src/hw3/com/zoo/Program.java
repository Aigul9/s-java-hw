package hw3.com.zoo;

import hw3.com.zoo.animal.Cat;
import hw3.com.zoo.animal.Rabbit;
import hw3.com.zoo.exception.FoodException;
import hw3.com.zoo.exception.SleepException;

public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat("cat");
        cat.say();

        Rabbit rabbit = new Rabbit("Jenny");
        rabbit.say();

        try {
            rabbit.eat("carrot", 5);
        } catch(FoodException f) {
            System.out.println(f.getMessage());
            System.out.println(f.getAmount());
        }

        try {
            rabbit.eat("carrot", -100);
        } catch(FoodException f) {
            System.out.println(f.getMessage());
            System.out.println(f.getAmount());
        }

        try {
            rabbit.eat("", 0);
        } catch(FoodException f) {
            System.out.println(f.getMessage());
            System.out.println(f.getAmount());
        }

        try {
            rabbit.sleep("afternoon");
        } catch (SleepException s) {
            System.out.println(s.getMessage());
        }

        try {
            rabbit.sleep("night");
        } catch (SleepException s) {
            System.out.println(s.getMessage());
        }

        rabbit.getAction();

        rabbit.create("Jenny");
        rabbit.create("Jenny", "New Zealand");
    }
}
