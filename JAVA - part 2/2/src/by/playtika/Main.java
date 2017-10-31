package by.playtika;
import by.playtika.ComparatorAge;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	Collection col = new Collection();
	Student s1 = new Student(1, "Dmitriy", "Kirienko", 28);
	Student s2 = new Student(20, "Ivan", "Petrov", 22);
	Student s3 = new Student(15, "Maks", "Sidorov", 26);
	col.addStudent(s1);
	col.addStudent(s2);
	col.addStudent(s3);
	System.out.println(col.getCollection());
	col.getCollection().sort(new ComparatorAge());
	System.out.println(col.getCollection());
	System.out.println(col.filtr('K'));
	System.out.println(col.arifm());
    }
}
