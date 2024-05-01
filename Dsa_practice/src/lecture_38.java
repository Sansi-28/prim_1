public class lecture_38 {
    public static int [] selectionShort(int []arr){
          for(int i=0;i<arr.length;i++) {
              int min = i;
//              min = minOfArray(arr,i+1);
              for (int j = i + 1; j < arr.length-1; j++) {
                  if (arr[j] < arr[min]) {
                      min = j;
                  }
              }
              if (arr[i] > arr[min]) {
                  int temp = arr[i];
                  arr[i] = arr[min];
                  arr[min] = temp;
              }
          }
          return arr;
    }
    public static int [] insertionShort(int []arr){
        //arr={3,2,5,6,7,1}
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp= arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
                }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr= new int[6];
        multidimentionalArray.scanArray1D(arr,6);
        multidimentionalArray.printArray1D(arr);
        insertionShort(arr);
        multidimentionalArray.printArray1D(arr);
    }
}
