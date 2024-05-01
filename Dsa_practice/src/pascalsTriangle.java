import java.util.ArrayList;
import java.util.Scanner;

public class pascalsTriangle extends multidimentionalArray{
    public static String spiralPrinting(int [][] arr){
        ArrayList<Integer> array = new ArrayList<>();
        int i=0,a=0;
        int j=0,count=0;
        while(a<=arr.length/2){
            for(j=a;j<arr[i].length;j++){
                if(count==arr.length* arr.length)return "completed";
                System.out.print(arr[i][j]+"\t");
                count++;
                if(j==arr.length-a-1){
//                    j=arr.length-1;
                    break;
                }
            }i++;
            for(;i< arr.length;i++){
                if(count==arr.length* arr.length)return "completed";
                System.out.print(arr[i][j]+"\t");
                count++;
                if(i== arr.length-a-1)break;
            }
            j--;
            for(;j<arr[i].length;j--) {
                if(count==arr.length* arr.length)return "completed";
                System.out.print(arr[i][j] + "\t");
                count++;
                if (j == a) {
//                    j=arr.length-1;
                    break;
                }

            }i--;
            a++;
                for(;i< arr.length-a;i--){
                    if(count==arr.length* arr.length)return "completed";
                    System.out.print(arr[i][j]+"\t");
                    count++;
                    if(i==a)break;
                }
            }
        return "completed";
        }
    public static String spiralGenerator(int [][] arr){
        int i=0,a=0;
        int j=0,count=1;
        while(a<=arr.length/2){
            for(j=a;j<arr[i].length;j++){
                arr[i][j]=count;
                if(count==arr.length* arr.length)return "completed";

                count++;
                if(j==arr.length-a-1){
//                    j=arr.length-1;
                    break;
                }
            }i++;
            for(;i< arr.length;i++){
                arr[i][j]=count;
                if(count==arr.length* arr.length)return "completed";

                count++;
                if(i== arr.length-a-1)break;
            }
            j--;
            for(;j<arr[i].length;j--) {
                arr[i][j]=count;
                if(count==arr.length* arr.length)return "completed";

                count++;
                if (j == a) {
//                    j=arr.length-1;
                    break;
                }

            }i--;
            a++;
            for(;i< arr.length-a;i--){
                arr[i][j]=count;
                if(count==arr.length* arr.length)return "completed";

                count++;
                if(i==a)break;
            }
        }
        multidimentionalArray.scanArray2D(arr,arr.length,arr.length);
        return "completed";
    }
    public static void pascaltriangle(int n){
        multidimentionalArray q= new multidimentionalArray();
         int [][] arr=new int[n][n];
         for (int i=0;i<arr.length;i++){
             arr[i][0]=1;
             for (int j=1;j<i;j++){
                 arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
             }
             arr[i][i]=1;
         }
        q.printArrayForPascals2D(arr);
    }
    public static void main(String[] args) {
//        pascaltriangle(5);
        int [][] arr = new int [3][4];
        multidimentionalArray.scanArray2D(arr,5,5);
        spiralPrinting(arr);
//        spiralGenerator(arr);
        multidimentionalArray.printArray2D(arr);
    }
}
