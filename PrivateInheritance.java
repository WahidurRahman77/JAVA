// Base class (or Superclass)
class Person {
    // Fields are private to enforce encapsulation.
    // They can only be accessed or modified through public methods (getters/setters).
    private String name;
    private int age;
    
    // Public getter method for the 'name' field
    public String getName() {
        return name;
    }
    
    // Public setter method for the 'name' field
    public void setName(String name){
        this.name = name;
    }
    
    // Public getter method for the 'age' field (Typo 'getAame' corrected)
    public int getAge() {
        return age;
    }

    // Public setter method for the 'age' field
    public void setAge(int age){
        this.age = age;
    }

    // This method can access the private fields because it is part of the Person class.
    void display1() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class (or Subclass) inheriting from Person
class Teacher extends Person {
    // This field has default (package-private) access
    String qualification;

    void display2() {
        // Calls the inherited display1() method from the Person class.
        // This works because display1() has default access and is in the same package.
        display1(); 
        System.out.println("Qualification: " + qualification);
    }
}

// Class to test the inheritance implementation
public class PrivateInheritance {
    public static void main(String[] args) {
        // 1. Create an object of the derived class
        Teacher teacher1 = new Teacher();

        // 2. Assign values to the fields.
        // Use the public setter methods inherited from the Person class
        // because the 'name' and 'age' fields are private.
        teacher1.setName("Dr. Alice Smith"); 
        teacher1.setAge(42);

        // Access the 'qualification' field directly as it's not private.
        teacher1.qualification = "Ph.D. in Computer Science";

        // 3. Call the method from the derived class to display all information.
        System.out.println("Teacher Information:");
        teacher1.display2();
    }
}
