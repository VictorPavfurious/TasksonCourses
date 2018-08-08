package Test;


public class Students {
    private int age;
    private String name;
    private boolean missDays;
    private double middle;

    public Students(int age, String name, boolean missDays, double middle) {
        this.age = age;
        this.name = name;
        this.missDays = missDays;
        this.middle = middle;

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

    public boolean isMissDays() {
        return missDays;
    }

    public void setMissDays(boolean missDays) {
        this.missDays = missDays;
    }

    public double getMiddle() {
        return middle;
    }

    public void setMiddle(double middle) {
        this.middle = middle;
    }


}
