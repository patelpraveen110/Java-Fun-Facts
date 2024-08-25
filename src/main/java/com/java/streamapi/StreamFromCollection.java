package com.java.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamFromCollection {

    public static void main(String[] args) {
        Student student1 = new Student(1,"praveen", "12345", 27);
        Student student2 = new Student(1,"praveen", "12345", 27);
        Student student3 = new Student(1,"praveen", "12345", 27);

        List<Student> studentList = Arrays.asList(student1, student2, student3);
        studentList.stream().forEach(System.out::println);
    }
}
