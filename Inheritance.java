// Base class (or Superclass)
class Person {
    String name;
    int age;

    void display1() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class (or Subclass) inheriting from Person
class Teacher extends Person {
    String qualification; // Corrected typo from Stirng to String

    void display2() {
        display1(); // Calls the method from the parent class (Person)
        System.out.println("Qualification: " + qualification);
    }
}

// Class to test the inheritance implementation
public class Inheritance { // Renamed Interitance to Inheritance for correct spelling
    public static void main(String[] args) {
        // 1. Create an object of the derived class
        Teacher teacher1 = new Teacher();

        // 2. Assign values to the fields
        // Accessing fields from the Person class (inherited)
        teacher1.name = "Dr. Alice Smith";
        teacher1.age = 42;

        // Accessing field from the Teacher class
        teacher1.qualification = "Ph.D. in Computer Science";

        // 3. Call the method from the derived class
        System.out.println("Teacher Information:");
        teacher1.display2();
    }
}