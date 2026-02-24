public class TestDate {

    public static void main(String[] args) {

        try {
            Date d1 = new Date(15, 2, 2025);
            d1.afficher();

            Date d2 = new Date(40, 2, 2025); // erreur
            d2.afficher();

        } catch (NombreJourException e) {
            System.out.println(e.getMessage());
        }
    }
}