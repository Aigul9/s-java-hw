package hw3.com.zoo.animal;

public interface IMoveable {
    default void play() {
        System.out.println("Playing");
    };

    default void scratch() {
        System.out.println("Scratching");
    };

    default void wag() {
        System.out.println("Wagging the tail");
    };

    default void embrace() {
        System.out.println("Embracing");
    };

    default void swim() {
        System.out.println("Swimming");
    };

    default void imitate() {
        System.out.println("Imitating");
    };

    default void roar() {
        System.out.println("Roaring");
    };

    default void guard() {
        System.out.println("Guarding");
    };

    default void hide() {
        System.out.println("Hiding");
    };

    default void jump() {
        System.out.println("Jumping");
    };

    default void hunt() {
        System.out.println("Hunting");
    };

    default void run() {
        System.out.println("Running");
    };
}
