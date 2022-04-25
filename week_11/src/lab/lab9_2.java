package lab;

public class lab9_2 {
    public static void main(String[] args) {

    }
}

class PersonProfile{
    private String name, gender, birthdate;

    public PersonProfile(String name, String gender, String birthdate) {
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "name : " + name + "\ngender : " + gender + "\nbirthdate : " + birthdate;
    }
}

class Student extends PersonProfile{
    private String courseName, courseCode, session, filename;
    private int mark;

    public Student(String name, String gender, String birthdate, String filename) {
        super(name, gender, birthdate);
        this.filename = filename;
    }

    public void getGrade(){

    }
}