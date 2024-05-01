import java.util.Scanner;

public class lecture_19 extends lecture_18{
    public static int[] prefixSum(int [] arr){
        int j=1;
        int [] prefixSum=new int [arr.length];
        prefixSum[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            prefixSum[j++]=prefixSum[j-2]+arr[i];
        }
        multidimentionalArray.printArray1D(prefixSum);
        return prefixSum;
    }
    public static void sumInRange(int[]arr,int q) {
        for (int j = 0; j < q; j++) {
            System.out.println("Enter the indices :");
            Scanner s = new Scanner(System.in);
            int l = s.nextInt();
            int r = s.nextInt();
            int sum = 0;
            for (int i = l; i <= r; i++) {
                sum = sum + arr[i];
            }
            System.out.println(sum);
        }
    }
    public static int suminRange(int[]arr,int l,int r){
        int sum=0;
        for (int i=l;i<=r;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
public static boolean equalPartition(int [] arr){
        boolean arc=false;
        for(int i=0;i<arr.length;i++){
            if (suminRange(arr,0,i)==suminRange(arr,i+1,arr.length-1)){
                arc=true;
                return arc;
            }
        }
        return arc;
}
    public static void main(String[] args) {
        int [] arr= new int[5];
        multidimentionalArray.scanArray1D(arr,5);
//        sumInRange(arr,4);
        System.out.println(equalPartition(arr));
    }
}
