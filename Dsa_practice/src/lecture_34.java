public class lecture_34 {
    public static String removingChar(String s,char a,int i) {
        /*String=apple
         */
        if (i == s.length()) return "";
        String sm = removingChar(s, a, i + 1);
        char chart = s.charAt(i);
        if (s.charAt(i) != a) {
            return chart + sm;
        } else {
            return sm;
        }
    }

static int[] twoSum(int[] num, int target){
        int[] sol = new int[2];
            for (int a = 0; a < num.length; a++) {
                for (int j = 0; j < num.length; j++) {
                    if (num[a] + num[j] == target) {

                        sol[0] = a;
                        sol[1] = j;
                        break;
                    }
                    else {
                        java.lang.System.exit(0);
                    }
                    }
                }
            return sol;
        }
    public static String reverseOfString(String s,int i){
        /*String= apple--->elppa*/
        if (i==s.length())return"";
        String new_s= reverseOfString(s,i+1);
        char newchar= s.charAt(i);
        return new_s+newchar;
    }
    public static boolean palidromeInString(String s,int i){
        boolean ans=false;
        if (i==s.length()/2)return true;
        if(s.charAt(i)==s.charAt(s.length()-i-1)){
            return palidromeInString(s,i+1);
        }else return false;
    }

    public static void main(String[] args) {
        System.out.println(reverseOfString("apple",0));
        System.out.println(palidromeInString("qweuytrewq",0));
    }
}
