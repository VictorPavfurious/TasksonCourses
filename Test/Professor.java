package Test;


import java.util.ArrayList;

public class Professor {
   private int age;
   private String name;

    public Professor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Students> checkingStudents(ArrayList<Students> check) {//метод с помощью которогго профессор делает перекличку
        for (Students students : check) {
            if (students.isMissDays()) {
                System.out.println(students.getName() + " is missing today!");
            }
            else {
                System.out.println(students.getName() + " is here!");
            }
        }
        return check;
    }
}

