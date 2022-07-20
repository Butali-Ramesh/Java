import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparatorClass {
    public static void main(String[] args) {
        Student s1 = new Student(101,"ram",19);
        Student s2 = new Student(103,"ravi",18);
        Student s3 = new Student(102,"raju",17);
        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        Collections.sort(al,new AgeOrder());
        for(Student st:al)
        {
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
        System.out.println();
        Collections.sort(al,new NameOrder());
        for(Student st:al)
        {
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
