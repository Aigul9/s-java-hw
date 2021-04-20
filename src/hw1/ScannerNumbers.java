package hw1;

import java.util.Scanner;

public class ScannerNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first operand: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the operator: ");
        String op = sc.next();
        System.out.println("Enter the second operand: ");
        int n2 = sc.nextInt();

        switch (op) {
            case "+" -> System.out.println(n1 + n2);
            case "-" -> System.out.println(n1 - n2);
            case "*" -> System.out.println(n1 * n2);
            case "/" -> System.out.println(n1 / n2);
        }
    }
}
