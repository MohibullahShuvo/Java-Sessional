
class Person {
    String name;
    int age;

    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

class Doctor extends Person {
    Doctor(String name, int age) {
        super(name, age);
    }

    void treatPatient() {
        System.out.println(name + " is treating patients.");
    }
}

class Teacher extends Person {
    Teacher(String name, int age) {
        super(name, age);
    }

    void teach() {
        System.out.println(name + " is teaching students.");
    }
}

class Engineer extends Person {
    Engineer(String name, int age) {
        super(name, age);
    }

    void develop() {
        System.out.println(name + " is developing projects.");
    }
}


public class Hierarchial {
    public static void main(String[] args) {
        
        Doctor doc = new Doctor("Dr. Shuvo", 22);
        Teacher teacher = new Teacher("Mr. Abir", 35);
        Engineer engineer = new Engineer("Mr. Fahim", 28);

        doc.displayInfo();
        doc.treatPatient();
        System.out.println();

        teacher.displayInfo();
        teacher.teach();
        System.out.println();

        engineer.displayInfo();
        engineer.develop();
    }
}







