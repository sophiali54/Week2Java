package uoft.csc207.week2;

public class Student extends Person {
    // initialize additional attributes of subclass
    private final String studentid;

    public Student(String[] name, String utorid, String studentid) {
        // calling superclass constructor, hand attributes
        super(name, utorid);
        this.studentid = studentid;
    }
}
