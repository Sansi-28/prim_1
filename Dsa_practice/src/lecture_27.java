import java.util.Scanner;

public class lecture_27 {
    static void printDecreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
   static void printIncreasing(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value you want to  print: ");
        int n=s.nextInt();
        printIncreasing(n);
        printDecreasing(n);
    }
}
