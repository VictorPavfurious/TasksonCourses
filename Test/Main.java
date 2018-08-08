package Test;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        Professor professor = new Professor(40, "Anatoliy");
        ArrayList<Students> allStudents = group.createGroup();
        professor.checkingStudents(allStudents);
        System.out.println(" ");
        group.choiseLeader(allStudents);
    }

}
