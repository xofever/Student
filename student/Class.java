package xofever.feifei.student;

import java.util.Arrays;

public class Class {
    private Student[] students;
    private String className;

    public Class() {
    }

    public Class(Student[] students, String className) {
        this.students = students;
        this.className = className;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Class{" +
                "students=" + Arrays.toString(students) +
                ", className='" + className + '\'' +
                '}';
    }
}
