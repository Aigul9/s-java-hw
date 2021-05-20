package hw2;

import java.util.Scanner;

public class Frame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the frame height:");
        int h = sc.nextInt();
        System.out.println("Enter the frame width: ");
        int w = sc.nextInt();
        System.out.println("Enter the text: ");
        String text = sc.next();

        if (text.length() > w - 2) {
            System.out.println("This text cannot be placed in the frame.");
        } else {
            int h_start = h / 2, w_start = (w - text.length()) / 2;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {

                    char s = ' ';

                    if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
                        s = '*';
                    } else if (i == h_start){
                        if (j >= w_start && j < w_start + text.length()) {
                            s = text.charAt(j - w_start);
                        }
                    }

                    System.out.print(s);
                }

                System.out.println();
            }
        }
    }
}
