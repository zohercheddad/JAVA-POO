public class Classesinterne {


    private String modele = "ThinkPad";

    // Classe interne
    private class Processeur {

        public void afficherInfo() {
            System.out.println("Modèle : " + modele);
        }
    }

    // Méthode publique qui utilise la classe interne
    public void demarrer() {
        Processeur cpu = new Processeur();
        cpu.afficherInfo();
    }

    public static void main(String[] args) {
        Classesinterne pc = new Classesinterne();
        pc.demarrer();
    }
}
