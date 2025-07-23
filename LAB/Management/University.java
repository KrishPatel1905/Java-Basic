package Management;

public class University {
    public static void main(String[] args) {
//        student s= new student("Krish", 18, 3);
//        teacher t=new teacher("heet", 30, "Java");
       person upcaststudent = new student("Krish", 18, 3);
       person upcastteacher =new teacher("heet", 30, "Java");
        upcastteacher.get();
        upcaststudent.get();
//        s.get();
//        t.get();
    }
}
//how  to communicate student and teacher means variable exchanges