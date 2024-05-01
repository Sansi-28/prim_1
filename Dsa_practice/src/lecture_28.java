import com.sun.source.tree.BreakTree;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class lecture_28 {
    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }
        int fact =n*factorial(n-1);
        return fact;
    }
    public static int fibonacci(int n){
        if (n==0||n==1){
            return n;
        }
        int prev=fibonacci(n-1);
        int pprev =fibonacci(n-2);
        return prev+pprev;
    }
    public static int sumOfDigits(int n){
        if(n/10==0){
            return n;
        }
        int sum= n%10+sumOfDigits(n/10);
        return sum;
    }
    public static int pRaisedToQ(int p,int q){
        if (q==0)return 1;
        if(q==1){
            return p;
        }
        int ans = pRaisedToQ(p,q-1)*p;
        return ans;
    }
    public static int pow(int p,int q){
        if (q==0)return 1;
        int smallpow=pow(p,q/2);
        if (q%2==0){
            return smallpow*smallpow;
        }
        return p*smallpow*smallpow;
    }
    public static void multiples(int num,int k){
        if (k==1){
            System.out.print(num+"\t");
            return;
        }
        multiples(num,k-1);
        System.out.printf(num*k+"\t");
        return;
    }

    public static int alternativeSum(int n){
        if (n==0)return 0;
        if (n%2==0){
            return alternativeSum(n-1)-n;
        }
        return alternativeSum(n-1)+n;
    }
    public static int gcd(int m,int n){
        if(n%m==0)return m;
        return gcd(n%m,m);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        System.out.println(gcd(n,m));
    }
}
