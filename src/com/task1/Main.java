package com.task1;

class student {
    String FIO;
    int age;
    String gender;
    bibliotic objB = new bibliotic();

     void SetStudent (String name, int a, String g) {
        FIO = name;
        age = a;
        gender = g;
    }
}
class studentfull extends student {
    University univ1 = new University();
    void printinfo(){
        System.out.println("Факультет: " +univ1.facultet + " " +univ1.getKurs(age));
        System.out.println("ФИО: " +FIO + " Возраст " +age +" пол " +gender);
        System.out.println("Книга для изучения: " +objB.getBooks(age) +" находится в " +objB.chitalnuyZal);

    }
}
public class Main {
    public static void main (String[] args){
        student stud1 = new student();
        University univ1 = new University();
        studentfull stud2 = new studentfull();
        stud1.SetStudent("Петя", 18, "Мужик");
        System.out.println("Книга для изучения: " +stud1.objB.getBooks(stud1.age));
        System.out.println(univ1.getKurs(stud1.age));
        stud1.SetStudent("Петя", 21, "Мужик");
        System.out.println("Книга для изучения: " +stud1.objB.getBooks(stud1.age));
        System.out.println(univ1.getKurs(stud1.age));

        stud2.SetStudent("Иван", 20, "Парень");
        stud2.printinfo();
    }

}

