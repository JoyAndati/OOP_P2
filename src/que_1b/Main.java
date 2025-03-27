package que_1b;

public class Main {
    public static void main(String[] args) {
        // Testing method overloading
        MathOperations math = new MathOperations();
        System.out.println("Multiplication of 2 and 3: " + math.multiply(2, 3));
        System.out.println("Multiplication of 2, 3, and 4: " + math.multiply(2, 3, 4));

        // Testing method overriding (Polymorphism)
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound();
        myCat.makeSound();
    }
}
