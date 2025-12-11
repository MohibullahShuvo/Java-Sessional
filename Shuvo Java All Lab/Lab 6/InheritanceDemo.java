
class Grandfather {
    void company() {
        System.out.println("Grandfather's company: BanglaHypercar Ltd.");
    }
}

class Father extends Grandfather {
    void car() {
        System.out.println("Father's car: Toyota");
    }
}

class Son extends Father {
    void bike() {
        System.out.println("Son's bike: Honda");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        
        Son mySon = new Son();

        
        mySon.company(); 
        mySon.car();     
        mySon.bike();    
    }
}
