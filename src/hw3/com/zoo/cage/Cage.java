package hw3.com.zoo.cage;

import hw3.com.zoo.animal.Animal;
import hw3.com.zoo.exception.DuplicateAnimalException;
import hw3.com.zoo.exception.LimitException;
import java.util.LinkedHashSet;

public class Cage {
    private final int limit;
    private LinkedHashSet<Animal> animals = new LinkedHashSet<>();

    public Cage(int limit) {
        this.limit = limit;
    }

    public void display() {
        for (Animal animal: animals) {
            System.out.println(animal.getName());
        }
    }

    public void add(Animal animal) throws LimitException, DuplicateAnimalException {
        if (animals.size() == limit) {
            throw new LimitException("New animal cannot be added because of size limit.");
        } else if (animals.contains(animal)) {
            throw new DuplicateAnimalException(animal.getName() + " has already been added.");
        } else {
            animals.add(animal);
        }
    }
}
