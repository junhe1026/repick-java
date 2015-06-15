package mooc.java3.map_examples;

import mooc.java3.collection_examples.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by juno on 15-6-15.
 */
public class MapTest {

    public Map<String, Student> students;

    public MapTest() {
        this.students = new HashMap<String, Student>();
    }


    public void testPut() {
        Scanner console = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入学生ID：");
            String ID = console.next();
            // 判断是否存在
            Student st = students.get(ID);
            if (st == null) {
                System.out.println("请输入学生姓名：");
                String name = console.next();
                Student newSt = new Student(ID, name);
                students.put(ID, newSt);
                System.out.println("添加成功");
                i++;
            } else {
                System.out.println("ID重复");
            }
        }

    }

    public void testKeySet() {
        Set<String> keys = students.keySet();
        System.out.println("总共有 " + keys.size() + " 个学生");
        for (String key : keys) {
            Student st = students.get(key);
            if (st != null) {
                System.out.println("学生：" + st.name);
            }
        }
    }

    public void testRemove() {
        while (true) {
            System.out.println("请输入要删除的学生ID：");
            Scanner console = new Scanner(System.in);
            String id = console.next();

            Student st = students.get(id);
            if (st != null) {
                students.remove(id);
                System.out.println("删除成功");
                break;
            } else {
                System.out.println("不存在");
            }
        }

    }

    public void testEntrySet(){
        Set<Map.Entry<String, Student>> entrySet = students.entrySet();
        for (Map.Entry<String, Student > entry : entrySet){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().name);

        }
    }

    public static void main(String[] args) {
        MapTest mt = new MapTest();
        mt.testPut();
        mt.testKeySet();
        mt.testRemove();
        mt.testEntrySet();
    }
}
