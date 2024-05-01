public class lecture_45 {
    public static boolean binarySearch(int[] arr, int target) {
//        boolean ans = false;
//        arr={1,2,3,4,5,6,7,8,9}
//        int mid =arr.length/2;
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return false;
    }

    public static boolean recBinarySearch(int[] arr, int st, int end, int val) {
        if (st > end) return false;
        int mid = (st + end) / 2;
        if (arr[mid] == val) return true;
        else if (val < arr[mid]) return recBinarySearch(arr, st, mid - 1, val);
        else return recBinarySearch(arr, mid + 1, end, val);

    }

    public static void main(String[] args) {
        int [] arr=new int [9];
        multidimentionalArray.scanArray1D(arr,9);
        System.out.println((binarySearch(arr,7)));
        System.out.println((recBinarySearch(arr,0,arr.length-1,7)));
    }
}
