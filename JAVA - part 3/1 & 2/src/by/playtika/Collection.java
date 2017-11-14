package by.playtika;

import java.io.FileWriter;
import java.util.ArrayList;
import by.playtika.*;
import java.io.*;

public class Collection {
    private ArrayList<Student> collection = new ArrayList<>();

    public void addStudent (Student n) throws SimpleException {
        if (n.getAge() > 60) {
            SimpleException se = new SimpleException();
            throw se;
        }
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
    public void write (String filename)  {
        try {
            FileWriter out = new FileWriter(filename, false);
            for (Student i: collection) {
                out.write(i.toString());
            }
            out.flush();
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }

    public static String read (String filename) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            System.out.println("Exception1");
        }
        return sb.toString();
    }


}
