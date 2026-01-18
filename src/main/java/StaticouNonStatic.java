public class StaticouNonStatic {

    // =====================================================
    // CAS 1 : Méthode STATIC pour des entiers
    // - Appartient à la classe, pas à un objet
    // - Peut être appelée directement depuis main
    // =====================================================
    static int maxInt(int a, int b) {
        return (a > b) ? a : b;
    }

    // =====================================================
    // CAS 2 : Méthode STATIC pour des doubles
    // =====================================================
    static double maxDouble(double a, double b) {
        return (a > b) ? a : b;
    }

    // =====================================================
    // CAS 3 : Méthode NON STATIC pour des long
    // - Nécessite une instance
    // =====================================================
    long maxLong(long a, long b) {
        return (a > b) ? a : b;
    }

    // =====================================================
    // Point d'entrée
    // =====================================================
    public static void main(String[] args) {

        // --- Appel des méthodes STATIC ---
        int resultatInt = maxInt(3, 7);
        double resultatDouble = maxDouble(2.5, 1.2);

        // --- Création de l'objet pour appeler la méthode NON STATIC ---
        StaticouNonStatic obj = new StaticouNonStatic();
        long resultatLong = obj.maxLong(10L, 20L);

        // --- Affichage ---
        System.out.println("Max int     = " + resultatInt);
        System.out.println("Max double  = " + resultatDouble);
        System.out.println("Max long    = " + resultatLong);
    }
}


