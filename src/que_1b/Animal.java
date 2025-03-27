package que_1b;

// Animal class demonstrating method overriding
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class overriding makeSound()
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Cat class overriding makeSound()
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
