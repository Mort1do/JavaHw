package Hw4_1N3;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public Person(){

    }

    public String move(){
        return fullName + " are moving";
    }

    public String talk(){
        return fullName + " are talking";
    }
}
