package hw6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Balda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a target word:");
        String targetWord = sc.nextLine();
        HashSet<Character> letters = new HashSet<>();

        for (int i = 0; i < targetWord.length(); i++) {
            letters.add(targetWord.charAt(i));
        }

        int[] status = new int[]{1, 1},
                points = new int[]{0, 0};
        HashMap<Integer, LinkedHashSet<String>> history = new HashMap<>();
        history.put(0, new LinkedHashSet<>());
        history.put(1, new LinkedHashSet<>());
        int currentPlayer = 0;
        String word;

        while (status[0] == 1 || status[1] == 1) {
            if (status[currentPlayer] == 0) {
                currentPlayer = currentPlayer == 0 ? 1 : 0;
                continue;
            }

            System.out.println("Player № " + (currentPlayer + 1));
            word = sc.nextLine();

            if (word.isEmpty() && word.isBlank()) {
                status[currentPlayer] = 0;
                System.out.println("Player № " + (currentPlayer + 1) + " resigned.");
                currentPlayer = currentPlayer == 0 ? 1 : 0;
                continue;
            }

            if (!validateWord(word, letters)) {
                System.err.println("The word " + word + " is incorrect.");
                continue;
            }

            if (!history.get(currentPlayer).add(word)) {
                System.err.println("The word " + word + " has already been submitted.");
                continue;
            }

            currentPlayer = currentPlayer == 0 ? 1 : 0;
            points[currentPlayer] += word.length();
            System.out.println("+1");
        }

        for (int i = 0; i <= 1; i++) {
            System.out.println("Player №" + (i + 1));
            System.out.println(String.join(", ", history.get(i)));
            System.out.println(history.get(i).size() + " word(s) in total.");
            System.out.println("Points: " + points[i]);
        }

        if (points[0] > points[1]) {
            System.out.println("Winner is player №1");
        } else if (points[0] == points[1]) {
            System.out.println("Both players got equal points.");
        } else {
            System.out.println("Winner is player №2");
        }
    }

    public static boolean validateWord(String word, HashSet<Character> lettersSet) {
        for (char c: word.toCharArray()) {
            if (!lettersSet.contains(c)) {
                return false;
            }
        }

        return true;
    }
}
