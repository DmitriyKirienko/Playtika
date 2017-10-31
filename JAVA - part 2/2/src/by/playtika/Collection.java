package by.playtika;

import java.util.ArrayList;
import by.playtika.*;

public class Collection {
    private ArrayList<Student> collection = new ArrayList<>();

    public void addStudent (Student n) {
        this.collection.add(n);
    }

    public ArrayList<Student> getCollection() {
        return collection;
    }

    public ArrayList<Student> filtr(char n) {
        ArrayList<Student> filtr = new ArrayList<>();
        for (Student i: collection) {
            if (i.getFamily().charAt(0) == n) {
                filtr.add(i);
            }
        }
        return filtr;
    }

    public int arifm() {
        int s = 0;
        int ar = 1;
        for (Student i: collection) {
            s = s + i.getAge();
            ar = s / collection.size();
        }
        return ar;
    }

}
