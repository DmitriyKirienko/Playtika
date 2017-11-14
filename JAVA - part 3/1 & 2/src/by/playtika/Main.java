package by.playtika;
import by.playtika.ComparatorAge;

import java.io.IOException;
import java.util.Collections;

public class Main {

    public static void main(String[] args)  {
	Collection col = new Collection();
	Student s1 = new Student(1, "Dmitriy", "Kirienko", 30);
	Student s2 = new Student(20, "Ivan", "Petrov", 22);
	Student s3 = new Student(15, "Maks", "Sidorov", 26);
	try {
		col.addStudent(s1);
	} catch (SimpleException ex) {
		System.out.print("Exception2");
	}
	try {
			col.addStudent(s2);
		} catch (SimpleException ex1) {
			System.out.print("Exception2");
		}
	try {
			col.addStudent(s3);
		} catch (SimpleException ex2) {
			System.out.print("Exception2");
		}

	System.out.println(col.getCollection());
	col.getCollection().sort(new ComparatorAge());
	System.out.println(col.getCollection());
	System.out.println(col.filtr('K'));
	System.out.println(col.arifm());
	col.write("c:\\JAVA\\Playtika\\HomeTask\\JAVA - part 3\\note.txt");
	System.out.print(col.read("c:\\JAVA\\Playtika\\HomeTask\\JAVA - part 3\\note.txt"));
    }
}
