public class lecture_17 extends lecture_16{
    public static int[] makeFrequencyArray(int[]arr,int max){
        int [] freq=new int [max];
        for (int i=0;i< arr.length;i++){
            freq[arr[i]]=freq[arr[i]]+1;
        }
        return freq;
    }
    public static void swapInArray(int[] arr,int i,int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void oneStepRotation(int[] arr,int n) {
        for (int j=0;j<n;j++){
            for (int i=arr.length-1;i>0;i--){
                swapInArray(arr,i,i-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr=new int [5];
        multidimentionalArray.scanArray1D(arr,5);
        oneStepRotation(arr,33);
        multidimentionalArray.printArray1D(arr);
    }
}
