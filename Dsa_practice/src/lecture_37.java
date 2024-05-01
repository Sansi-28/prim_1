public class lecture_37 {
    public static int [] bubblShort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr=new int [6];
        multidimentionalArray.scanArray1D(arr,6);
        multidimentionalArray.printArray1D(arr);
        bubblShort(arr);
        multidimentionalArray.printArray1D(arr);


    }
}
