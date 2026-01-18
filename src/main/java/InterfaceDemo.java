// ================================
// Interface : contrat de comportement
// ================================
interface Animal1 {

    // Toutes les méthodes sont implicitement :
    // public + abstract
    void eat();
    void makeSound();
}
// InterfaceeETabstraite

// ================================
// Classe Dog qui implémente l'interface Animal
// ================================
class Dog implements Animal1 {

    // Obligation d’implémenter toutes les méthodes de l’interface
    @Override
    public void eat() {
        System.out.println("The dog eats.");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}


// ================================
// Classe principale (point d’entrée)
// ================================
public class InterfaceDemo {

    public static void main(String[] args) {

        // Polymorphisme :
        // Le type est Animal, mais l'objet réel est Dog
        Animal1 animal = new Dog();

        // Appels des méthodes définies dans l’interface
        animal.eat();
        animal.makeSound();
    }
}
