package hw3.com.zoo.exception;

public class FoodException extends Exception {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public FoodException(String msg, int amount) {
        super(msg);
        this.amount = amount;
    }
}
