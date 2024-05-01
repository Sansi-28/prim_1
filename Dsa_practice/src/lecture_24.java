import java.util.ArrayList;
import java.util.Collection;


public class lecture_24 {
    public static void main(String[] args) {
        ArrayList<Integer> i= new ArrayList<Integer>();
        i.add(0,12);
        i.add(32);
        i.add(5);
        i.add(6);
        i.add(7);
        i.add(8);
        i.add(9);
        System.out.println(i.get(5)+" "+i.size());
    }
}
