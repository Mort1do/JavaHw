package Hw10;

public class MergeArrays {
    private Tester test1;
    private Tester test2;

    public MergeArrays(Tester test1, Tester test2){
        this.test1 = test1;
        this.test2 = test2;
    }

    public Tester combineTwoArrays(){
        Tester newArr = new Tester();
        newArr.setArray(this.test1.getiDNumber());
        newArr.setArray(this.test2.getiDNumber());
        newArr.sort();
        return newArr;
    }
}
