public class InterfaceeETabstraite {

    // ================================
    // Point d’entrée (classe interne statique)
    // ================================
    public static class Main {
        public static void main(String[] args) {

            Animal dog = new Dog();
            Animal cat = new Cat();

            dog.swim();
            dog.play();

            cat.swim();
            cat.play();
        }
    }

    // ================================
    // Interfaces
    // ================================
    interface Swimmer {
        void swim();
    }

    interface Player {
        void play();
    }

    // ================================
    // Classe abstraite
    // ================================
    abstract static class Animal implements Swimmer, Player {
    }

    // ================================
    // Implémentations
    // ================================
    static class Dog extends Animal {

        @Override
        public void swim() {
            System.out.println("Dog is swimming");
        }

        @Override
        public void play() {
            System.out.println("Dog is playing");
        }
    }

    static class Cat extends Animal {

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
