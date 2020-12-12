package com.task1;

public class Library extends Universitet {
   private String Director = "Федор Петрович";
    private String [] books = {"Мастер и Маргарита", "Петр I. Экономика Руси", "Петр II. Экономика Руси", "Петр III. Экономика Руси","Петр IV. Экономика Руси", "Петр V. Экономика Руси. Забрать можно у " + Director};

    public String RoomForReading = "Главный читальный зал";
    public String getBooks(int age){
     return books [getCourseNumber(age)];
    }

    /*public String getBooks(int age) {

    }
        switch (age) {
            case 17:
                books = "Петр I. Экономика Руси";
                break;
            case 18:
                books = "Петр II. Экономика Руси";
                break;
            case 19:
                books = "Петр III. Экономика Руси";
                break;
            case 20:
                books = "Петр IV. Экономика Руси";
                break;
            case 21:
                books = "Петр V. Экономика Руси. Забрать можно у " + Director;
                break;
            default:
                books = "Мастер и Маргарита";
                break;
        }
        return books;
    }*/
}
