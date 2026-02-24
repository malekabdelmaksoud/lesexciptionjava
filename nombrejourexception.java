class NombreJourException extends Exception {

    public NombreJourException() {
        super("Erreur : le nombre de jours doit être compris entre 1 et 31.");
    }
}