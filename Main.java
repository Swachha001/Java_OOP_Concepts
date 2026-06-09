// Abstract Class
abstract class Person {
    Person() {
        System.out.println("Person Constructor");
    }

    abstract void displayRole();
}

// Level 1
class Student extends Person {
    Student() {
        super();
        System.out.println("Student Constructor");
    }

    @Override
    void displayRole() {
        System.out.println("I am a Student");
    }
}

// Level 2
class ICTStudent extends Student {
    ICTStudent() {
        super();
        System.out.println("ICTStudent Constructor");
    }

    // Dynamic Binding
    @Override
    void displayRole() {
        System.out.println("I am an ICT Student");
    }

    // Early Binding (Method Overloading)
    void showInfo() {
        System.out.println("ICT Department");
    }

    void showInfo(String name) {
        System.out.println("Student Name: " + name);
    }

    void coding() {
        System.out.println("Coding in Java");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Constructor Chaining ===");
        ICTStudent s1 = new ICTStudent();

        System.out.println("\n=== Early Binding ===");
        s1.showInfo();
        s1.showInfo("Swachha");

        System.out.println("\n=== Dynamic Binding ===");
        Person p = new ICTStudent();
        p.displayRole();

        System.out.println("\n=== Downcasting ===");
        ICTStudent s2 = (ICTStudent) p;
        s2.coding();
    }
}
