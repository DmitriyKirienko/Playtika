package by.playtika;

public class Student {
    private int id;
    private String name;
    private String family;
    private int age;

    public Student (int id, String name, String family, int age) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFamily() {
        return family;
    }

    @Override
    public String toString() {
        return "Student {" + "Name=" + name + "Family" + family + "Age" + age + "}";
    }



}
