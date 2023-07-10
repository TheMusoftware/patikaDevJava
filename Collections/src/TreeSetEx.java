import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new ComparatorByNote());
        students.add(new Student("Mustafa",100));
        students.add(new Student("Nursen",92));
        students.add(new Student("Didem",70));
        students.add(new Student("Firuze",100));

        Student student =  students.lower(new Student("Ali",93));
        // return greatest element lower given
        for (Student s : students){
            System.out.println(s.getName());

        }
        System.out.println(student.getName());
    }
}
