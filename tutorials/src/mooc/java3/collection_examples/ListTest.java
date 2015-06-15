package mooc.java3.collection_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by juno on 15-6-15.
 */
public class ListTest {
    public List coursesToSelect;

    public ListTest(){
        this.coursesToSelect = new ArrayList();
    }

    public void testAdd(){
        Course cr1 = new Course("1", "数据结构");
        coursesToSelect.add(cr1);
        Course temp = (Course) coursesToSelect.get(0);
        System.out.println("添加了课程:" + temp.id + ":" + temp.name);

        Course cr2 = new Course("2", "C语音");
        coursesToSelect.add(0, cr2);
        Course temp2 = (Course) coursesToSelect.get(0);
        System.out.println("添加了课程:" + temp2.id + ":" + temp2.name);

//        Course cr3 = new Course("3", "Test");
//        coursesToSelect.add(4, cr3);  // IndexOutOfBound

        Course[] course = {new Course("3", "离散数学"),new Course("4", "化学")};
        coursesToSelect.addAll(Arrays.asList(course));

    }

    public void testGet(){
        System.out.println("=================");
        int size = coursesToSelect.size();
        for(int i=0; i<size; i++){
            Course cr = (Course) coursesToSelect.get(i);
            System.out.println("课程:"+cr.id+":"+cr.name);
        }
    }

    public void testIter(){
        System.out.println("=================iter");
        Iterator it = coursesToSelect.iterator();
        while (it.hasNext()){
            Course cr = (Course)it.next();
            System.out.println("课程:"+cr.id+":"+cr.name);
        }

    }

    public void testForEach(){
        System.out.println("=================for each");
        for (Object obj:coursesToSelect){
            Course cr = (Course) obj;
            System.out.println("课程:"+cr.id+":"+cr.name);
        }
    }

    public void testModify(){
        coursesToSelect.set(0, new Course("2", "毛概"));
    }

    public static void main(String[] args) {
        ListTest t1 = new ListTest();
        t1.testAdd();
        t1.testGet();
        t1.testIter();
        t1.testModify();
        t1.testForEach();
    }


}
