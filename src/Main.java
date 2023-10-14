public class Main {
  public static void main(String[] args) {
    AgenceDePresse agenceDePresse = new AgenceDePresse();

    Chaine chaine1 = new Chaine("ALOULA");
    Chaine chaine2 = new Chaine("2M");

    agenceDePresse.abonnerObserver (chaine1);
    agenceDePresse.abonnerObserver (chaine2);

    // Simulation de réception de nouvelles par l'agence de presse
    agenceDePresse.recevoirNouvelle("\n MATCH AMICAL REPORTE ");

    // Désabonnement d'une chaîne
    agenceDePresse.desabonnerObserver (chaine1);

    // Nouvelle notification
    agenceDePresse.recevoirNouvelle("\n PLUIES ENREGISTREES DANS LE NORD ");
  }
}
