package Test;


import java.util.ArrayList;
import java.util.List;

public class Main {
     static Students students;
     static Group group;
    public static void main(String[] args) {
        group = new Group("programmer", 1);
        Professor professor = new Professor(40, "Anatoliy");
        ArrayList<Students> list = new ArrayList<>();
        list.add(new Students(18,"Petryha", false, true, true, group.getNumber()));
        list.add(new Students(20,"Vanya", true, true, false, group.getNumber()));
        list.add(new Students(19,"Yan", true, false, false, group.getNumber()));
        list.add(new Students(17,"Mark", false, false, true, group.getNumber()));

        getS(list);

        System.out.println(" ");

        for (int i = 0; i < list.size(); i++) {
            professor.checkingStudents(list.get(i));
        }


    }

    public static List<Students> getS(ArrayList<Students> list) {

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).isSpeakSkill() && list.get(i).isAmbition() && !list.get(i).isMissDays()) {
                System.out.println(list.get(i).getName() + ", are captain!");
            }
            else {
                System.out.println(list.get(i).getName() + ", can not be captain...");
            }
        }

        return list;

    }


}
