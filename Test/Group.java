package Test;


import java.util.ArrayList;

public class Group {

    public ArrayList<Students> createGroup() { // создаем группу и помещаем в неё студентов

        ArrayList<Students> list = new ArrayList<>(); // список студентов в группе
        list.add(new Students(18,"Petryha", false, 10.2));
        list.add(new Students(20,"Vanya", true, 6.0));
        list.add(new Students(19,"Yan", true, 7.2));
        list.add(new Students(17,"Mark", false, 10.0));
        list.add(new Students(20,"Pavlusha",true, 9.8));

        return list;
    }

    public void choiseLeader(ArrayList<Students> group) { // метод выбора старосты в группе , среди студентов,
                                                           // старостой станет тот у кого лучше балл
        String name = "";
        double middle = 0;

        for (Students students : group) {
            if(middle < students.getMiddle()) {
                name = students.getName();
                middle = students.getMiddle();
            }
            else {
                continue;
            }
        }
        System.out.println(name + " is leader in this group!");

    }

}
