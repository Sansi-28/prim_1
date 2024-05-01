import java.util.Scanner;

public class lecture_23 extends lecture_21{

    public static void bruteForceMethod(int [][] arr,int r1, int c1,int r2,int c2){
        int sum=0;
        for (int i=r1;i<=r2;i++){
            for (int j=c1;j<=c2;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);
    }
    public static int pre_CalculationRowise(int [][] arr) {
        int[][] prefixSum = new int[1050][1050];
        for (int i = 0; i < arr.length; i++) {
            prefixSum[i] = lecture_19.prefixSum(arr[i]);
        }
        System.out.println("Enter the number of queries:");
        Scanner s = new Scanner(System.in);

        int q = s.nextInt();
        for (int i = 0; i < q; i++) {
            int sum = 0;
            System.out.println("Enter the indices of r1 and c1: ");
            int r1 = s.nextInt();
            int c1 = s.nextInt();
            System.out.println("Enter the indices of r2 and c2: ");
            int r2 = s.nextInt();
            int c2 = s.nextInt();

            for (int j = r1; j <= r2; j++) {
                sum = sum + (prefixSum[j][c2] - prefixSum[j][c1 - 1]);
            }
            System.out.println(sum);

        }
        return 1;
    }
    public static int pre_CalculationRowiseAndColoumnwis(int [][] arr) {
        int[][] prefixSum = new int[1050][1050];
        for (int i = 0; i < arr.length; i++) {
                prefixSum[i] = lecture_19.prefixSum(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr.length;j++){
//                prefixSum[][j] = lecture_19.prefixSum()
            }
        }
        System.out.println("Enter the number of queries:");
        Scanner s = new Scanner(System.in);

        int q = s.nextInt();
        for (int i = 0; i < q; i++) {
            int sum = 0;
            System.out.println("Enter the indices of r1 and c1: ");
            int r1 = s.nextInt();
            int c1 = s.nextInt();
            System.out.println("Enter the indices of r2 and c2: ");
            int r2 = s.nextInt();
            int c2 = s.nextInt();

            for (int j = r1; j <= r2; j++) {
                sum = sum + (prefixSum[j][c2] - prefixSum[j][c1 - 1]);
            }
            System.out.println(sum);

        }
        return 1;
    }


    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        multidimentionalArray.scanArray2D(arr, 7, 7);
//        bruteForceMethod(arr,3,1,5,4);
        System.out.println(pre_CalculationRowise(arr));
    }
}
