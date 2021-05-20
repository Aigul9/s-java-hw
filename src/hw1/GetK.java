package hw1;

import java.util.Scanner;

public class GetK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the index: ");
        int k = sc.nextInt();
        System.out.println(Integer.toString(n).charAt(k - 1));
    }
}
