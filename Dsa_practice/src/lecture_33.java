import java.util.ArrayList;

public class lecture_33 {
    public static void targetSearch(int [] arr,int i,int x){
        if(i==arr.length){
            System.out.println("nahi hai isme");
            return;
        }
        if(arr[i]==x){
            System.out.printf("searched value is at: %d",i);
            return;
        }
        targetSearch(arr,i+1,x);
        return;
    }
    public static void targetSearches(int [] arr,int i,int x){
        if(i==arr.length){
            return;
        }
        if(arr[i]==x){
            targetSearches(arr,i+1,x);
            System.out.printf("searched value is at: %d\n",i);
            return;
        }
        targetSearches(arr,i+1,x);
        return;
    }
    public static ArrayList<Integer> targetSerch(int [] arr,int n,int i,int x){
        if (i== arr.length)return new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[i]==x){
            ans.add(i);
        }
        ArrayList<Integer> temp = targetSerch(arr,n,i+1,x);
        ans.addAll(temp);
        return ans;
    }
    public static boolean isSorted(int [] arr,int i){
        /*let  array = {2,3,5,4}*/
        if (i==arr.length-1)return true;
        if(arr[i]>arr[i+1])return false;
        return isSorted(arr,i+1);
    }
    public static void lastIndex(int [] arr, int i,int target){
        /*array={1 ,2 ,3 ,4 ,4 ,4 ,4}*/
        if(i==arr.length)return;
        if(arr[arr.length-i-1]==target){
            System.out.println(arr.length-i-1);
            return;
        }
        lastIndex(arr,i+1,target);
        return;
    }

    public static void main(String[] args) {
        int [] arr= new int[7];
        multidimentionalArray.scanArray1D(arr,7);
        lecture_32.printArrayRecursion(arr,0);
        lastIndex(arr,0,4);
    }
}
