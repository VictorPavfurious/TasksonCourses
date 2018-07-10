package Test;


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

    public Students checkingStudents(Students s) {
        if(s.isMissDays()) {
            System.out.println(s.getName() + " miss!");
        }
        else {
            System.out.println(s.getName() + " here!");
        }
        return s;
    }
}

