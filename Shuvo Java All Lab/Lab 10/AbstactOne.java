
abstract class Shape {
    
    abstract double area();
}


class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

   
    @Override
    double area() {
        return 3.14159 * radius * radius;
    }
}


class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    @Override
    double area() {
        return length * width;
    }
}


public class AbstactOne {
    public static void main(String[] args) {
        
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(5, 10);

        
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
