

package SortingBYComparable;

import java.util.ArrayList;
import java.util.Collections;


public class Student implements Comparable<Student>{
    int rollNo;
    String name;
    int age;
    @Override
    public int compareTo(Student st) {
        return this.name.compareTo(st.name);
    }   

    public Student() {
    }

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
    return  rollNo +"   "+name+"  "+age;
    }

    
}
class Test{
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay" , 23));
        al.add(new Student(106, "Ajay" , 27));
        al.add(new Student(105, "Jai" , 21));
        Collections.sort(al);
        for(Student st: al)
            System.out.println(st);
    }
}
