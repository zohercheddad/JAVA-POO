public class InterfaceeETabstraite {

// ================================
// Classe principale (point d’entrée)
// ================================
public class Main {
    public static void main(String[] args) {

        // Polymorphisme : même type Animal, objets différents
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.swim();
        dog.play();

        cat.swim();
        cat.play();
    }
}


// ================================
// Interface : capacité à nager
// ================================
interface Swimmer {
    void swim();
}


// ================================
// Interface : capacité à jouer
// ================================
interface Player {
    void play();
}


// ================================
// Classe abstraite Animal
// - Implémente les deux interfaces
// - Sert de base commune aux animaux
// ================================
abstract class Animal implements Swimmer, Player {
    // Pas d’implémentation ici (sera faite dans les classes filles)
}


// ================================
// Classe Dog
// ================================
class Dog extends Animal {

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}


// ================================
// Classe Cat
// ================================
class Cat extends Animal {

    @Override
    public void swim() {
        System.out.println("Cat is swimming");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
}