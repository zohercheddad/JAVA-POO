
class Machine {
    public void start() {
        System.out.println("Starting...");
    }
}

public class ClassesAnonymes {
    public static void main(String[] args) {

        // Classe anonyme : on modifie le comportement de start()
        Machine m = new Machine() {
            @Override
            public void start() {
                System.out.println("Starting with custom behavior!");
            }
        };

        m.start();
    }
}
