package sem1;

public class Student {

    //1(b) instant variable
    private long contactNum; //instance v = v that outside method/block of constructor but inside class

    //1(c)
    public Student() {
        contactNum = 0;
    }

    //1(d)
    public Student(long contactNum) {
        this.contactNum = contactNum;
    }

    //1(e) mutator
    public void setContactNum(long contactNum) {
        this.contactNum = contactNum;
    }

    //1(e) accessor
    public long getContactNum() {
        return contactNum;
    }

    //1(f) to display the contact number
    public String toString() {
        String str = "contact number " + contactNum;

        return str;
    }
}
