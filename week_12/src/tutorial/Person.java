package tutorial;

public class Person implements Comparable<Person>{
    private String name;
    private Object Person;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(tutorial.Person o) {
        return ;
    }

//    @Override
//    public String toString(Object[] Person) {
//
//        return "Name :"
//    }
//
//    public void compareTo(Person[] a){
//        for (int pass=0;pass<a.length-1;pass++) {
//            for (int i = 0; i < a.length - pass; i++) {
//                int arrange = a[i].compareTo(a[i + 1]);
//                if (arrange < 0) {
//                    Object temp = a[i].toString();
//                    a[i] = a[i + 1];
//                    a[i + 1] = (Person) temp;
//                }
//            }
//        }
//        toString(Person);
//    }
}
