public class lecture_40{
    public static int [] sortZeroes(int []arr){
        for(int i=0;i<arr.length-1;i++){
            //a={3,0,4,0,0,6,0}
            for(int j=i;j< arr.length-1;j++){
            if(arr[j]==0) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            }
        }
        return arr;
    }
    public static String [] lexicoSorting(String [] arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i;j< arr.length;j++){
                if(arr[min].compareTo(arr[j])>0){
                    min=j;
                }
            }
            if (arr[i].compareTo(arr[min])>0) {
                String temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        String[] arr={"apple","papaya","watermelon","mango","kiwi","orange"};
        lexicoSorting(arr);
        multidimentionalArray.printArray1D(arr);

    }
}
