package Company;
import java.util.Random;
import java.util.Scanner;
public class Game {
    public static int j=0;
    int number;
    int input;
    Random r = new Random();
    public int generator(){
        number = r.nextInt(1, 101);
        return number;
    }
    public void takeUserInput(){
        Scanner s = new Scanner(System.in);
        input= s.nextInt();
    }
    public void isCorrectNumber(){
        if (number==input){
            System.out.println("You WON!!");
            j++;
          }
        else if (number>input){
            System.out.println("Ahh!! Your input is LESSER than mine");
        }
        else {
            System.out.println(" Ahh!! Your input is GREATER than mine ");
        }
    }
    public static void main(String[] args) {
        int k=0;
        Game santosh = new Game();
        System.out.println("___________________WELCOME TO NUMBER GUESSING GAME___________________\nNOTE: Guess the number in minimum chances");
                santosh.generator();
                while (j!=1){
                        k++;
                        System.out.println("Guess :-" + k);
                        santosh.takeUserInput();
                        santosh.isCorrectNumber();
                }
                }
    }
