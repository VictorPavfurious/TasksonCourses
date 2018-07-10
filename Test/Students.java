package Test;


public class Students {
    private int age;
    private String name;
    private boolean speakSkill;
    private boolean ambition;
    private int groupN;
    private boolean missDays;

    public Students(int age, String name, boolean speakSkill, boolean ambition, boolean missDays, int grop) {
        this.age = age;
        this.name = name;
        this.speakSkill = speakSkill;
        this.ambition = ambition;
        this.missDays = missDays;
        this.groupN = grop;

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

    public boolean isSpeakSkill() {
        return speakSkill;
    }

    public void setSpeakSkill(boolean speakSkill) {
        this.speakSkill = speakSkill;
    }

    public boolean isAmbition() {
        return ambition;
    }

    public void setAmbition(boolean ambition) {
        this.ambition = ambition;
    }

    public int getGroupN() {
        return groupN;
    }

    public void setGroupN(int groupN) {
        this.groupN = groupN;
    }

    public boolean isMissDays() {
        return missDays;
    }

    public void setMissDays(boolean missDays) {
        this.missDays = missDays;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", speakSkill=" + speakSkill +
                ", ambition=" + ambition +
                ", group=" + groupN +
                '}';
    }

}
