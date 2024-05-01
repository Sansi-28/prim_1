import java.util.Scanner;

public class multidimentionalArray {
    public static void printArray1D(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static void printArray1D(String [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static void copyArray(int[] arr,int [] rr){
        for (int i=0;i<arr.length;i++){
            rr[i]=arr[i];
        }
    }

    public static void printArray2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void printArrayForPascals2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void scanArray1D(int[] arr,int l){
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < l; i++) {
                arr[i]= s.nextInt();
        }
    }


    void muliplyArray(int[][] arr, int c1, int r1, int[][] rr, int c2, int r2) {
        int[][] multiply = new int[r1][c2];
        for (int i = 0; i <r1; i++) {
            for (int j = 0; j <c2; j++) {
                multiply[i][j] = 0;
                for (int k = 0; k < r2; k++) {
                        multiply[i][j] = multiply[i][j]+(arr[i][k] * rr[k][j]);
                }
            }
        }
        printArray2D(multiply);
    }

    public static void main(String[] args) {
        multidimentionalArray b = new multidimentionalArray();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = s.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = s.nextInt();
        System.out.println("Enter the matrix:");
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.nextInt();
            }
            System.out.println();
        }
        b.printArray2D(arr);
        System.out.println("Enter the number of rows: ");
        int r1 = s.nextInt();
        System.out.println("Enter the number of columns: ");
        int c1 = s.nextInt();
        System.out.println("Enter the matrix:");
        int[][] rr = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                rr[i][j] = s.nextInt();
            }
            System.out.println();
        }
        b.printArray2D(rr);
        b.muliplyArray(arr,c,r,rr,c1,r1);
    }
    public static void scanArray2D(int[][] arr,int r,int c){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.nextInt();
            }
            System.out.println();
        }
        multidimentionalArray.printArray2D(arr);
    }
}