class Person{
    String name;
    int age;

    void displayinformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String qualification;

    @Override
    void displayinformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Qualification: " + qualification);
    }
}

public class Overrinding {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Nola";
        t1.age = 50;
        t1.qualification = "Haddi";
        t1.displayinformation();
    }
}
