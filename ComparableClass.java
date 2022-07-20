//import java.util.ArrayList;
//import java.util.Collections;
//
//class Student implements Comparable<Student>
//{
//    int rollno,age;
//    String name;
//    Student(int rollno,String name,int age) {
//        this.rollno = rollno;
//        this.name = name;
//        this.age = age;
//    }
//
//    public int compareTo(Student s) {
//
//        if(age==s.age)
//            return 0;
//        else if (age>s.age)
//            return 1;
//        else return 0;
//        }
//    }
//
//
//public class ComparableClass {
//
//    public static void main(String[] args) {
//        Student s1 = new Student(101,"Ram",19);
//        Student s2 = new Student(102,"javry",20);
//        Student s3 = new Student(103,"Sam",21);
//
//        ArrayList<Student> al = new ArrayList<>();
//        al.add(s1);
//        al.add(s2);
//        al.add(s3);
//        Collections.sort(al);
//        for(Student str : al)
//        {
//            System.out.println(str.age+" "+str.name+" "+ str.rollno);
//        }
//    }
//}
