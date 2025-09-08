class Student {
    String name;
    int id;
    static String University = "Premier University";

    Student(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("University Name: " + University);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Student s1 = new Student("Wahidur Rahman", 4);
        Student s2 = new Student("MD. Abir Hasan", 13);

        s1.display();
        s2.display();
    }
}