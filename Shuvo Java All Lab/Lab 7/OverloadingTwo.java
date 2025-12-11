
class Shape {

    
    double area(double length, double width) {
        return length * width;
    }

    
    double area(double radius) {
        return 3.14159 * radius * radius;
    }
}


public class OverloadingTwo {
    public static void main(String[] args) {
        Shape shape = new Shape();

        
        double rectArea = shape.area(5, 10);
        System.out.println("Area of Rectangle: " + rectArea);

        
        double circleArea = shape.area(7);
        System.out.println("Area of Circle: " + circleArea);
    }
}
