package xofever.feifei.student;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0;i<students.length;i++){
            students[i] = new Student();
            System.out.println("输入学生编号");
            students[i].setID(s.next());
            System.out.println("输入学生姓名");
            students[i].setName(s.next());
            //System.out.println(students[i]);
        }

        Class clas = new Class(students,"软件181");

        System.out.println(clas);

    }
}
