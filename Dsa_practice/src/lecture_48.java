public class lecture_48 {
    static boolean isDividionPosssible(int [] a, int m, int mxChocAllowed){
        int numOfStudents =1;
        int choc=0;

        for (int i=0; i< a.length;i++){
            if(a[i]>mxChocAllowed)return false;
            if(choc+a[i]<=mxChocAllowed){
                choc +=a[i];
            }else{
                numOfStudents++;
                choc = a[i];
            }
        }
        return numOfStudents<=m;
    }
    static int distriuteChoclates(int [] a,int m){
        if(a.length<m)return -1;
        int ans =0, st = 1, end =(int)1e9;

        while(st<= end){
            int mid = st+(end-st)/2;
            if(isDividionPosssible(a,m,mid)){
                ans = mid;
                end =mid-1;
            }else {
                st = mid +1;

            }
        }
        return ans;
    }
    static boolean isPossible(int [] a,int k,int dist ) {
        int kidsPlaced =1;
        int lastKid = a[0];
        for(int i =1;i<a.length; i++){
            if(a[i]-lastKid >= dist){
                kidsPlaced++;
                lastKid=a[i];
            }
        }
        return kidsPlaced>=k;
    }
    static int raceTrack(int[] a,int k){
        if(k>a.length)return -1;
        int st = 0, end = (int) 1e9;
        int ans = -1;
        while(st<=end){
            int mid = st +(end-st)/2;
            if(isPossible(a,k,mid)){
                ans=mid;
                st = mid+1;
            }else{
                end = mid-1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int [] a= {1,2,4,8,9};
        int m= 3;
        System.out.println(raceTrack(a,m));
    }
}
