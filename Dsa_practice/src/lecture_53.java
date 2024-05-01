public class lecture_53 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("santosh's");
//        str+=" world";
        str.append(" world");
        str.setCharAt(0,'c');
        str.append('s');

        str.deleteCharAt(15);
        str.insert(5,'t');
        str.reverse();
        str.delete(3,6);
        System.out.println(str);
    }
}
