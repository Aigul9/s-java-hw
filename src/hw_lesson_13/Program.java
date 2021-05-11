package hw_lesson_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.generate(() -> ThreadLocalRandom.current().nextInt(0, 20));
        Set<Integer> set = stream
                .filter(n -> n % 2 == 1)
                .map(n -> n * 2)
                .peek(n -> System.out.print(n + " "))
                .limit(15)
                .collect(Collectors.toSet());
        System.out.println();
        System.out.println(set);
        System.out.println(set.stream().reduce(Integer::sum).get());

        List<String> l1 = new ArrayList<>(Arrays.asList("Anna", "Maria", "Eveline")),
                l2 = new ArrayList<>(Arrays.asList("Anastasia", "Maria", "Aigul", "Theodor")),
                l3 = new ArrayList<>(Arrays.asList("Aigul", "Leon", "Johny")),
                l4 = new ArrayList<>(Arrays.asList("Caroline", "Alexey", "Theodor", "James", "Eveline"));

        Stream<List<String>> names = Stream.of(l1, l2, l3, l4);
        Set<String> namesSet = names.flatMap(Collection::stream).peek(System.out::println).collect(Collectors.toSet());
        System.out.println(namesSet);

        Map<String, Double> mass = new HashMap<>();
        mass.put("Human", 70.0);
        mass.put("Brick", 4.2);
        mass.put("Car", 1500.0);
        OptionalDouble avgWeight = mass.values()
                .stream()
                .peek(n -> System.out.print(n + " "))
                .mapToDouble(n -> n)
                .average();
        System.out.println();
        System.out.println(avgWeight);

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(5, 6, 9, -15)),
                nums2 = new ArrayList<>(Arrays.asList(2, -15, 30, 19, 9));

        Stream.of(nums1, nums2)
                .flatMap(n -> n.stream())
                .collect(Collectors.toSet()).
                forEach(n -> System.out.print(n + " "));
    }
}
