package tutorial;

public class tutorial10_3 {
    public static void main(String[] args) {
        Person a = new Person("ain");
        Person b = new Person("farisya");
        person(a);
        person(b);
//        if (a.compareTo(b)>0)
//        {
//            System.out.println(a);
//            System.out.println(b);
//        }
//        else
//        {
//            System.out.println(b);
//            System.out.println(a);
//        }

    }

    public static void person(Person a) {
        a.compareTo(a);
    }

}
