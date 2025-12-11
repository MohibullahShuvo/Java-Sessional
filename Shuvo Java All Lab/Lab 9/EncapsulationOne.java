
class Student {
    
    private String name;
    private String id;
    private double cgpa;

   
    void setName(String name) {
        this.name = name;
    }

    void setId(String id) {
        this.id = id;
    }

    void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    
    String getName() {
        return name;
    }

    String getId() {
        return id;
    }

    double getCgpa() {
        return cgpa;
    }
}


public class EncapsulationOne {
    public static void main(String[] args) {
        
        Student student = new Student();

        
        student.setName("Shuvo");
        student.setId("20251211");
        student.setCgpa(3.85);

        
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID  : " + student.getId());
        System.out.println("CGPA        : " + student.getCgpa());
    }
}
