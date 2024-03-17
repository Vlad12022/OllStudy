package HashMapEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {

        Student st1 = new Student("�������", "����", 1);
        Student st2 = new Student("�������", "����", 2);
        Student st3 = new Student("��������", "����", 3);
        Student st4 = new Student("����������", "�����", 4);
        Student st5 = new Student("���������", "�������", 5);

        Map<Student, Double> student1 = new HashMap<>();
        student1.put(st1, 5.02);
        student1.put(st2, 6.50);
        student1.put(st3, 7.80);
        student1.put(st4, 9.40);
        student1.put(st5, 3.2);

        for (Map.Entry<Student, Double> entry : student1.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}