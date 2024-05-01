import java.util.Scanner;

public class reversing2darray extends multidimentionalArray{
    public static void reverse1d(int [] arr){
        for(int i=0;i< arr.length/2;i++){
            int temp =arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }

    public static void reverse2d(int [][] arr){
        for(int j=0;j< arr.length;j++){
            for(int i=0;i<arr.length/2 ;i++){

                int temp =arr[j][i];
                arr[j][i]=arr[j][arr.length-1-i];
                arr[j][arr.length-1-i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner s= new Scanner(System.in);
        int r=s.nextInt();

        System.out.println("Enter the number of coloumns:");
        int c=s.nextInt();
        System.out.println("Enter the elements:" );
        int [][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        printArray2D(arr);
        reverse2d(arr);
        printArray2D(arr);


    }
}
