package HomeWork;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student[] student = new Student[5];
        student[0] = new Student(111, "������� ����", LocalDate.of(2001, 2, 12), "���������� 6", 375447832935L, Faculty.JOURNALISTIC, Student.COURSE_1, Student.GROUP_A);
        student[1] = new Student(1113, "������ ����", Faculty.ECONOMIC, Student.GROUP_C);
        student[2] = new Student(1223, "�������� ���������", Faculty.JURIDICAL);
        student[3] = new Student(1245, "������ ���������", Faculty.JURIDICAL);
        student[4] = new Student(1244, "������� ������", LocalDate.of(1998, 10, 5), "�������� 5", 3752578898L, Faculty.PHILOLOGICAL, Student.COURSE_3, Student.GROUP_A);

        Faculty faculty1 = Faculty.JURIDICAL;

        StringBuilder res = new StringBuilder("�������� ������� ������ �� ����� �����:");

        for (Student value : student) {
            if (value.getFaculty().equals(faculty1)) {
                res.append(" ").append(value.getName()).append(" ").append(value.getFaculty()).append(",");
            }
        }
        System.out.println(res.substring(0, res.length() - 1));


        System.out.println();


        String groupA = Student.GROUP_A;

        StringBuilder res1 = new StringBuilder("�������� ������� ������ � ����� ������:");

        for (Student value : student) {
            if (value.getGroup() != null && value.getGroup().equals(groupA)) {
                res1.append(" ").append(value.getName()).append(" ������: ").append(value.getGroup()).append(",");
            }

        }
        System.out.println(res1.substring(0, res1.length() - 1));


        // ������ �� ���� ������� �������� ����������


    }


}




