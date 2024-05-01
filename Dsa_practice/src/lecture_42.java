import java.util.ArrayList;

public class lecture_42 {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int cnt = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot) cnt++;
        }
        int pivotIdx = st + cnt;
        swap(arr, st, pivotIdx);
        int i = st, j = end;
        while (i < pivot && j > pivot) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) i--;
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
        return pivotIdx;
    }

    static void quickShort(int[] arr, int st, int end) {
        if (st >= end) return;
        int pi = partition(arr, st, end);
        quickShort(arr, st, pi - 1);
        quickShort(arr, pi - 1, end);
    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        multidimentionalArray.scanArray1D(arr, 6);
        quickShort(arr, 0, 6);
        multidimentionalArray.printArray1D(arr);
    }

    static int [] targetSum(int[] nums,int target) {
        int [] Target= new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]+nums[j]==target&&i!=j){
                    Target[0]=i;
                    Target[1]=j;
                }
            }
        }
        return Target;
    }
}
