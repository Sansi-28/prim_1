public class lecture_47 {
    static boolean searchIn2dArray(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;
        int start = 0, end = rows * cols - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int midElement = arr[mid / cols][mid % cols];

            if (midElement == target)
                return true;
            else if (midElement < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return false;
    }
    static int peakIndexOfArray(int [] arr){
        int indx=0,st=0,end=arr.length-1;

        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1])return mid;
            if(arr[mid]>arr[mid+1]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }

        return indx;
    }


    static boolean searchIn2dArrayMethod2(int[][] matrix, int target) {
        int i=0, j=matrix[0].length-1;
        while(i< matrix.length&&j>=0) {
            if (matrix[i][j] == target) return true;

            if (matrix[i][j] < target) i++;
            else j--;
        }


        return false;
    }


    public static void main(String[] args) {
        int [][] arr= new int [3][3];
        multidimentionalArray.scanArray2D(arr,3,3);
        System.out.println(searchIn2dArrayMethod2(arr,3));
    }
}
