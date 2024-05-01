import java.util.Arrays;
import java.util.Scanner;

public class lecture_16 extends pascalsTriangle {
    public static void uniqueInteger(int [] arr){
        int temp=0;
        for (int i=0;i< arr.length;i++){
            int count=0;
            for (int j=0;j< arr.length;j++){
                if (arr[i]!=arr[j]){
                    temp=arr[i];
                    count++;
                }
            }
            if (count!=5){
                System.out.print(temp);
            }
        }
    }
    public static void firstRepeatingInteger(int [] arr){
        int temp=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if (arr[i]==arr[j]&&i!=j){
                    System.out.println(arr[i]);
                    java.lang.System.exit(0);
                }
                temp++;
            }

            }
        if (temp== arr.length* arr.length){
                System.out.print("-1");
        }
    }
    public static void secondLargest(int []arr){
        for (int i=0;i< arr.length;i++){
           if(arr[i]!=arr[i+1]){
               System.out.print(arr[i+1]);
               break;
           }
        }
    }
    public static void decreasingBubbleShort(int []arr){
        for (int j=0;j<arr.length;j++){
        for (int i=0;i< arr.length-1;i++){
            if (arr[i]<=arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            }
        }
    }
    public static void increasingBubbleShort(int []arr){
        for (int j=0;j<arr.length;j++){
        for (int i=arr.length-1;i>0;i--){
            if (arr[i]<=arr[i-1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            }
        }
    }
    public static int targetSum(int [] arr,int n){
        int count=0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]+arr[j]==n){
                    count++;
                }
                }
        }
        return count/2;
    }
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the length of the array:");
//        int a=s.nextInt();
//        int[] arr=new int[a];
//        System.out.println("Enter the elements:");
//        for (int i=0;i< arr.length;i++){
//            arr[i]=s.nextInt();
//        }
//        multidimentionalArray.printArray1D(arr);
//
//        System.out.println(targetSum(arr,7));
//        int [][] src=new int[3][3];
//        multidimentionalArray.scanArray2D(src,3,3);
//        int [][] arc = new int [4][5];
//        multidimentionalArray.scanArray2D(arc,4,5);
        int [] arr=new int[7];
        multidimentionalArray.scanArray1D(arr,7);
//        firstRepeatingInteger(arr);
        decreasingBubbleShort(arr);
        increasingBubbleShort(arr);
        multidimentionalArray.printArray1D(arr);

    }
}
