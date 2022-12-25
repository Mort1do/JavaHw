package Hw10;

public class Student {
    private String name;
    private String surname;
    private byte course;
    private String group;
    private int averageScore;

    public Student(String name, String surname, byte course, String group, int averageScore){
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.group = group;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public byte getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public String getSurname() {
        return surname;
    }

    public int getAverageScore() {
        return averageScore;
    }
}
