package Hw4_1N7;

public class Student extends Learner{
    private int kurse;
    public Student(String name, int age, int kurse){
        super(name, age);
        this.kurse = kurse;
    }

    @Override
    public String toString(){
        return "Student " + super.getName() + ", " + super.getAge() + " years which studying in " + kurse + " kurse";
    }
}
