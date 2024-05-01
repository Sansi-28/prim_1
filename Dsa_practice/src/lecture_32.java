public class lecture_32 {
    public static void printArrayRecursion(int [] arr,int i){
        if (i==arr.length-1){
            System.out.println(arr[i]);
            return;
        }
        System.out.println(arr[i]+"\t");
        printArrayRecursion(arr,i+1);
        return;
    }
    public static int maxOfArray(int [ ]arr,int i){
        if (i== arr.length-1)return arr[i];
        if (arr[i] <maxOfArray(arr,i+1)){
            return maxOfArray(arr,i+1);
        }
        return arr[i];
    }
    public static int sumOfArray(int []arr,int i){
        if(i==arr.length-1)return arr[i];
        int sum= arr[i]+sumOfArray(arr,i+1);
        return sum;
    }

    public static void main(String[] args) {
        int [] arr= new int[5];
        multidimentionalArray.scanArray1D(arr,5);
        printArrayRecursion(arr,0);
        System.out.println(sumOfArray(arr,0));
    }
}
