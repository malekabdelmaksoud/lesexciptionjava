class Date {

    private int jour;
    private int mois;
    private int annee;

    public Date(int j, int m, int a) throws NombreJourException {

        if (j < 1 || j > 31) {
            throw new NombreJourException();
        } else {
            jour = j;
            mois = m;
            annee = a;
        }
    }

    public void afficher() {
        System.out.println(jour + "/" + mois + "/" + annee);
    }
}