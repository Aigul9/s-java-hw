package hw_lesson_12.Functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 6, 7, -10));
        forEach(list, System.out::println);
        filter(list, a -> a > 0);
        System.out.println(count(list, List::size));

        System.out.println(foldL(list, Integer::sum));
        System.out.println(foldR(list, Integer::sum));

        System.out.println(foldL(list, (n1, n2) -> n1 * n2 - 1));
        System.out.println(foldR(list, (n1, n2) -> n1 * n2 - 1));

        List<String> m = map(list, Object::toString);
        System.out.println(m.get(0) + 2);
    }

    public static <T, R> List<R> map(List<T> origin, Function<T, R> mapper) {
        List<R> copy = new ArrayList<>();
        for (T el : origin) {
            copy.add(mapper.apply(el));
        }

        return copy;
    }

    public static <T> void forEach(List<T> origin, Consumer<T> consumer) {
        for (T el: origin) {
            consumer.accept(el);
        }
    }

    public static <T> List<T> filter(List<T> origin, Predicate<T> predicate) {
        origin.removeIf(t -> !predicate.test(t));
        return origin;
    }

    public static <T> Integer count(List<T> origin, Function<List<T>, Integer> function) {
        return function.apply(origin);
    }

    public static <T extends Number> T foldL(List<T> origin, BinaryOperator<T> binaryOperator) {

        T res = origin.get(0);

        if (origin.size() != 1) {
            for (int i = 1; i < origin.size(); i++) {
                res = binaryOperator.apply(res, origin.get(i));
            }
        }

        return res;
    }

    public static <T extends Number> T foldR(List<T> origin, BinaryOperator<T> binaryOperator) {
        T res = origin.get(origin.size() - 1);

        if (origin.size() != 1) {
            for (int i = origin.size() - 2; i >= 0; i--) {
                res = binaryOperator.apply(origin.get(i), res);
            }
        }

        return res;
    }
}
