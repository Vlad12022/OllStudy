package HashMapEx;

import java.util.Objects;

public class Student {

    private String surname;
    private String name;
    private int course;

    public Student(String surname, String name, int course) {
        this.surname = surname;
        this.name = name;
        this.course = course;
    }


    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Студент" + " " + surname + " " + name + "," + "Курс" + " " + course + "," + "Средняя оценка" + " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(surname, student.surname) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, course);
    }
}
