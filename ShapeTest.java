// Base class
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}

// Subclass: Circle
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    
    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }
}

// Subclass: Triangle
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

// Subclass: Square
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing Square");
    }
}

// Main class to test polymorphism
public class ShapeTest {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        c.draw();  // Should print "Drawing Circle"
        c.erase(); // Should print "Erasing Circle"

        t.draw();  // Should print "Drawing Triangle"
        t.erase(); // Should print "Erasing Triangle"

        s.draw();  // Should print "Drawing Square"
        s.erase(); // Should print "Erasing Square"
    }
}

