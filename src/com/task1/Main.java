package com.task1;

public class Main {
    public static void main (String[] args){
        Student student1 = new Student();
        Universitet universitet = new Universitet();
        StudentFullInfo student2 = new StudentFullInfo();
        student1.SetStudent("Петр", 18, "Мужчина");
        System.out.print(universitet.getCourseString(student1.age));
        System.out.println(" Книга для изучения: " +student1.BookForStudent.getBooks(student1.age));
        student1.SetStudent("Петр", 21, "Мужчина");
        System.out.print(universitet.getCourseString(student1.age));
        System.out.println(" Книга для изучения: " +student1.BookForStudent.getBooks(student1.age));

        student2.SetStudent("Иван", 20, "Парень");
        student2.printinfo();
    }

}

