package hw_lesson_12.FI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Program {
    public static void main(String[] args) {
        // не принимает, но отдает
        Supplier<Double> e = () -> Math.E;
        System.out.println(5 * e.get());

        List<Integer> list = new ArrayList<>();
        // не отдает, но принимает
        Consumer<Integer> c1 = list::add;
        c1.accept(1);
        BiConsumer<Integer, Integer> c2 = (n1, n2) -> {
            list.add(n1);
            list.add(n2);
        };
        c2.accept(2, 3);
        System.out.println(list);

        Predicate<Character> pr1 = Character::isLetter;
        System.out.println(pr1.test('*'));
        BiPredicate<String, String> pr2 = String::contains;
        System.out.println(pr2.test("word", "d"));

        Function<List<Integer>, Integer> f1 = List::size;
        System.out.println(f1.apply(list));
        BiFunction<Integer, Integer, Integer> f2 = Integer::max;
        System.out.println(f2.apply(2, 3));
        TriFunction<String, Integer, Integer, String> f3 = String::substring;
        System.out.println(f3.apply("string", 1, 4));

        UnaryOperator<List<Integer>> u1 = nums -> {
            for (int i = 0; i < nums.size(); i++) {
                nums.set(i, nums.get(i) * 2);
            }

            return nums;
        };

        System.out.println(u1.apply(list));
    }
}
