package com.task1;

public class Universitet {

    public String facultet = "Экономика";
    String Course;

    public String getCourseString(int a) { //курс, который соответсвует возврату студента в виде строки
        if ((a - 17) <= 4 & (a > 16)) Course = "Курс " + (a - 16);
        else Course = "Не студент";
        return Course;
    }

    public int getCourseNumber(int a) { //курс, который соответсвует возврату студента в виде строки
        if ((a - 17) <= 4 & (a > 16)) return (a - 16);
        else return 0;

    }
}
