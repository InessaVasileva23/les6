package com.task1;

public class StudentFullInfo extends Student { //наследование

        Universitet InfoUniversitet = new Universitet();
        void printinfo(){
            System.out.println();
            System.out.println("Факультет: " +InfoUniversitet.facultet + " " +InfoUniversitet.getCourseString(age));
            System.out.println("ФИО: " +FIO + " Возраст " +age +" пол " +gender);
            System.out.println("Книга для изучения: " +BookForStudent.getBooks(age) +" находится в " +BookForStudent.RoomForReading);

        }
}
