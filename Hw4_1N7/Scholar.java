package Hw4_1N7;

public class Scholar extends Learner{
    private int clas;
    Scholar(String name, int age, int clas){
        super(name, age);
        this.clas = clas;
    }

    @Override
    public String toString(){
        return "Scholar " + super.getName() + ", " + super.getAge() + " years which studying in " + clas + " class";
    }
}
