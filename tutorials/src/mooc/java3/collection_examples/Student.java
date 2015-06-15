package mooc.java3.collection_examples;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by juno on 15-6-15.
 */
public class Student implements Comparable<Student> {

    public String id;
    public String name;
    public Set courses;

    public Student(String id, String name){
        this.id = id;
        this.name = name;
        this.courses = new HashSet();
    }

    @Override
    public int compareTo(Student student) {
        return this.id.compareTo(student.id);
    }
}
