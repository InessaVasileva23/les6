package com.task1;

public class University {

    public String facultet = "Экономика";
    String kurs;

    public String getKurs(int a) {
        if ((a - 17) <= 4 & (a > 16)) kurs = "Курс " + (a - 16);
        else kurs = "Не студент";
        return kurs;
    }
}
