package Hw10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Tester{
    private ArrayList<Student> iDNumber = new ArrayList<>();
    private Comparator<Student> comparator = new StudentComparator();

    public void setArray(ArrayList<Student> arr){
        this.iDNumber.addAll(arr);
    }

    public void outArray(){
        for (Student student: this.iDNumber) {
            System.out.println(student);
        }
    }

    public void sort(){
        this.quickSort(0, this.iDNumber.size());
    }

    private int partition(int low, int high)
    {
        Student pivot = this.iDNumber.get(high);
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (comparator.compare(this.iDNumber.get(j), pivot) == -1) {
                i++;
                Collections.swap(iDNumber, i, j);
            }
        }
        Collections.swap(iDNumber, i + 1, high);
        return (i + 1);
    }

    private void quickSort(int low, int high)
    {
        if (low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }

    public ArrayList<Student> getiDNumber() {
        return iDNumber;
    }
}