public class lecture_18 extends lecture_17{
    public static void oddEvenSorting(int [] arr){
        int a=0,k=arr.length-1;
        while(a<k){
            if (arr[a]%2!=0&&arr[k]%2==0){
                lecture_17.swapInArray(arr,a,k);
            }
            if (arr[k]%2!=0){
                k--;
            }
            if (arr[a]%2==0){
                a++;
            }
        }
    }
    public static int[] absoluteOfArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            arr[i]=Math.abs(arr[i]);
        }
        return arr;
    }
    static void squareInNonDecreasingOrder(int [] arr){
        absoluteOfArray(arr);
        lecture_16.increasingBubbleShort(arr);
        for (int i=0;i<arr.length;i++){
            arr[i]=(arr[i]*arr[i]);
        }
    }

    public static void main(String[] args) {
        int [] arr=new int[7];
        multidimentionalArray.scanArray1D(arr,7);
//        oddEvenSorting(arr);
        squareInNonDecreasingOrder(arr);
        multidimentionalArray.printArray1D(arr);

    }
}
