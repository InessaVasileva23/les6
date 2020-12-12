package com.task1;

public class Student {
    //В классе студент, содержится следующуая информация:
    String FIO;
    int age;
    String gender;
    Library BookForStudent = new Library();

    void SetStudent (String name, int a, String g) { //метод
        FIO = name;
        age = a;
        gender = g;
    }
}
