public class lecture_41 {
    static void merge(int[] arr, int l,int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int [] left = new int [n1];
        int [] right = new int [n2];
        int i,j,k;
        for(i=0;i<n1;i++)left[i]=arr[l+1];
        for (j=0;j<n2;j++){
            i=0;
            j=0;
            k=l;
            while(i<n1&&j<n2){
                if(left[i]<right[j])
                    arr[k++]=left[j++];
                else
                    arr[k++]=right[j++];
            }
            while(i<n1){
                    arr[k++]=left[i++];
            }
            while(j<n2)
                arr[k++]=right[j++];
        }

    }
    static void mergeShort(int [] arr , int l, int r)
    {
        if(l>=r)return;
        int mid =(l+r)/2;
        mergeShort(arr,l,mid);
        merge(arr,l,mid,r);
    }

    public static void main(String[] args) {
//        int [] arr={4,1,3,5,2};
//        mergeShort(arr,0,arr.length-1);
//        ;multidimentionalArray.printArray1D(arr);
        int [] nums1= new int[2];
        int [] nums2= new int[1];
        multidimentionalArray.scanArray1D(nums1,2);


    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=nums1.length+nums2.length;
        int[] arr=new int[nums1.length+nums2.length-2];
        int j=0;
        int k=0;
        int x=(nums1.length<=nums2.length)?nums2.length:nums1.length;
        int i=0;
        while(i<arr.length&&k<=arr.length){
            if (nums1[i]<=nums2[k]){
                arr[j++]=nums1[i++];
            }
            else arr[j++]=nums2[k++];
        }
        return 3.0;
    }
    // int mid = (nums1.length+nums2.length)/2;
//    int mid;
//        if(l%2==0)mid=l/2;
//        else mid=(l/2)+1;
//    double ans= arr[mid];
//        return ans;
// 
//}
    static void Merge(int [] nums1,int [] nums2,int arr){
        int [] ans=new int [(nums1.length+nums2.length)-2];
        int j=0;
        int k=0;
        int x=(nums1.length<=nums2.length)?nums2.length:nums1.length;
        for(int i=0;i<x;i++){
            if (nums1[i]<=nums2[k]&&i<nums1.length&&k<nums2.length){
                ans[j++]=nums1[i];
            }
            else ans[j++]=nums2[k++];
        }
    }
}
