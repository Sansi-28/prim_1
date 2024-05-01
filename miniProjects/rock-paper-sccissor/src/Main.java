// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        //for (int i = 1; i <= 5; i++) {

        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+F8.
        // System.out.println("i = " + i);
        int c = 0;
        int u = 0;
        int i = 1;
        System.out.println("************************ ROCK-PAPER-SCISSOR *****************************");
        System.out.println("INSTRUCTIONS : IT'S A TOURNAMENT OF 3 ROUNDS (ONE WHO SCORES 2 OR MORE WILL WIN)");
        System.out.println("             : FOR ROCK ENTER 1 ");
        System.out.println("             : FOR PAPER ENTER 2 ");
        System.out.println("             : FOR SCISSOR ENTER 3");
        while (i <= 3) {
            System.out.print("ROUND :");
            System.out.println(i);
            System.out.println("IT'S YOUR CALL :");
            Scanner s = new Scanner(System.in);
            int b = s.nextInt();
            if (b == 1) {
                System.out.println("YOU CHOSE ROCK.");
                System.out.println("IT'S MY CALL");
                Random r = new Random();
                int a = r.nextInt(1, 4);
                System.out.println(a);
                switch (a) {
                    case 2 -> {
                        System.out.println("I CHOSE PAPER");
                        System.out.println("OH! YOU LOST!");
                        i++;
                        c++;
                    }
                    case 3 -> {
                        System.out.println("I CHOSE SCISSOR");
                        System.out.println("YOU WON!");
                        i++;
                        u++;
                    }
                    default -> {
                        System.out.println("I CHOSE ROCK");
                        System.out.println("OH! THAT'S A TIE");
                    }
                }
            } else if (b == 2) {
                System.out.println("YOU CHOSE PAPER");
                System.out.println("IT'S MY CALL");
                Random r = new Random();
                int a = r.nextInt(1, 4);
                System.out.println(a);
                switch (a) {
                    case 3 -> {
                        System.out.println("I CHOSE SCISSOR");
                        System.out.println("YOU LOST");
                        i++;
                        c++;
                    }
                    case 1 -> {
                        System.out.println("I CHOSE ROCK");
                        System.out.println("YOU WON!");
                        i++;
                        u++;
                    }
                    default -> {
                        System.out.println("I CHOSE PAPER");
                        System.out.println("OH! THAT'S A TIE");
                    }
                }
            } else if (b == 3) {
                System.out.println("YOU CHOSE SCISSOR");
                System.out.println("IT'S MY CALL");
                Random r = new Random();
                int a = r.nextInt(1, 4);
                System.out.println(a);
                switch (a) {
                    case 1 -> {
                        System.out.println("I CHOSE ROCK");
                        System.out.println("YOU LOST");
                        i++;
                        c++;
                    }
                    case 2 -> {
                        System.out.println("I CHOSE PAPER");
                        System.out.println("YOU WON");
                        i++;
                        u++;
                    }
                    default -> {
                        System.out.println("I CHOSE SCISSOR");
                        System.out.println("OH! THAT'S A TIE");
                    }
                }
            } else {
                System.out.println("OOPS!");
                System.out.println("PLEASE ENTER A VALID INPUT");
            }

        }
        if(u<2){
            System.out.println("TOURNAMENT RESULT : YOU LOST!!");
        }
        else {
            System.out.println("TOURNAMENT RESULT : YOU WON!!");
        }
    }
}