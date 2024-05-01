public class lecture_51 {
    public static class Student{
        String name;
        int rno;
        double percent;
    }

    public static void main(String[] args) {
        Student x = new Student();
        x.name= "sam";
        x.rno= 75;
        x.percent=45;

        Student s= new Student();
        s.name = "Akshit";
        s.percent= 65.7;
        s.rno = 65;

        System.out.println(x);
        System.out.println(s);
    }
}
