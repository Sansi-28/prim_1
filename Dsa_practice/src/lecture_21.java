import java.util.Arrays;

public class lecture_21 extends lecture_19{
    public static int[][] transpose(int [][] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        return arr;
    }
    public static void nintyDegreeRotation(int[][] arr){
        transpose(arr);
        reversing2darray.reverse2d(arr);
    }

    public static void main(String[] args) {
        int [] [] arr = new int[3][3];
        multidimentionalArray.scanArray2D(arr,3,3);
        nintyDegreeRotation(arr);
        multidimentionalArray.printArray2D(arr);
    }
}
