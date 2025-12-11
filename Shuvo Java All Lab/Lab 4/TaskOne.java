
class Car {
    
    String brand;
    String model;
    double price;

    
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    
    void displayCar() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    
    public static void main(String[] args) {
        
        Car myCar = new Car("Toyota", "Corolla", 25000);

        
        myCar.displayCar();
    }
}
