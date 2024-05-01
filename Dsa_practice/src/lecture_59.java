import java.util.Stack;

public class lecture_59 {
    static boolean balancedBracket(String x){
        Stack<Character> st = new Stack<>();
        for(int i = 0;  i<x.length();i++){
        if(x.charAt(i)=='(')st.push('(');
        if(x.charAt(i)==')')st.pop();
    }
        if(st.size()==0)return true;
        return false;
    }
    static Stack<Integer> removeConsecutiveSubsequence(int [] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<arr.length;i++){
            if(st.size()==0)st.push(arr[i]);
            if(arr[i]==arr[i+1]) {
                if (arr[i] == st.peek()) {
                    if (arr[i] != arr[i + 1]) st.pop();
                    else continue;
                }
            }
            else{
                st.push(arr[i]);
            }
        }
        return st;
    }
    public static void main(String[] args) {
//        String s = "(())((";
//        System.out.println(balancedBracket(s));
        int [] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        removeConsecutiveSubsequence(arr);

    }
}
