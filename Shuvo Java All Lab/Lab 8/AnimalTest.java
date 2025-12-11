
class Animal {
    void sound() {
        System.out.println("Some generic sound");
    }
}


class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}


class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}


public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.sound();
        dog.sound();
        cat.sound();
    }
}
