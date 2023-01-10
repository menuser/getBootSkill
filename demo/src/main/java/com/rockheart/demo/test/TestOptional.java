package com.rockheart.demo.test;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * test java 8 optional
 */
public class TestOptional {


    public static void main(String[] args) {

        //initial optional object
        Student s = new Student(21,100,"shixin");
//        Student s = null;
        Optional<Student> optional = Optional.ofNullable(s);

        //scenario 1 - if object is exists, do what?
        optional.ifPresent(TestOptional::printStudent);

        //the different between orElse and orElseGet
        Student student = optional.orElse(createStudent());//饿汉式，直接调用方法创建student对象
        Student student1 = optional.orElseGet(TestOptional::createStudent);//懒汉式，如果optional.getStudent()获取到的对象是null，则创建对象

        //filter


        //map and flatMap


    }

    /**
     * print student's name
     * @param student
     */
    public static void printStudent(Student student){
        System.out.println("student.getName() = " + student.getName());
    }

    /**
     * return a new student object
     * @return
     */
    public static Student createStudent(){
        System.out.println("createStudent : create a new object");
        return new Student();
    }

    /**
     * student instance class
     */
    @Data
    @Setter
    @Getter
    private static class Student{

        private int age;
        private int scope;
        private String name;

        public Student(int age, int scope, String name) {
            this.age = age;
            this.scope = scope;
            this.name = name;
        }

        public Student() {
        }

    }

}
