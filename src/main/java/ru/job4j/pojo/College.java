package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Timur");
        student.setGroup("IT Job4j");
        student.setDate(new Date());
        System.out.println(student.getName() + " Учится в группе - " + student.getGroup() + " c " + student.getDate());
    }
}
