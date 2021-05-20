package hw3.com.zoo.animal;

import hw3.com.zoo.exception.FoodException;
import hw3.com.zoo.exception.SleepException;

public interface IMovable {
    default void eat(String food, int amount) throws FoodException {
        if (food.isEmpty() || amount <= 0) {
            throw new FoodException("Food is not provided.", amount);
        } else {
            System.out.println("Eating " + food + "...");
        }
    }

    default void sleep(String timeOfDay) throws SleepException {
        switch (timeOfDay) {
            case "night" -> System.out.println("Sleeping...");
            default -> throw new SleepException("Time of day is not appropriate for sleep.");
        }
    }
}
