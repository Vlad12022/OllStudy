package HomeWork;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Student {

    private int id;
    private String name;
    private LocalDate birthdate;
    private String address;
    private long number;
    private Faculty faculty;
    private int course;
    private String group;


    public static final String GROUP_A = "A";
    public static final String GROUP_B = "B";
    public static final String GROUP_D = "D";
    public static final String GROUP_F = "F";
    public static final String GROUP_C = "C";

    public static final int COURSE_1 = 1;
    public static final int COURSE_2 = 2;
    public static final int COURSE_3 = 3;
    public static final int COURSE_4 = 4;
    public static final int COURSE_5 = 5;

    public Student(int id, String name, LocalDate birthdate, String address, long number, Faculty faculty, int course, String group) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.address = address;
        this.number = number;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(int id, String name, Faculty faculty) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
    }

    public Student(int id, String name, Faculty faculty, String group) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.group = group;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", faculty=" + faculty.getFaculty() +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && number == student.number && course == student.course && Objects.equals(name, student.name) && Objects.equals(birthdate, student.birthdate) && Objects.equals(address, student.address) && faculty == student.faculty && Objects.equals(group, student.group);
    }


}



































