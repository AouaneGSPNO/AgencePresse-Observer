public class Chaine implements Observer{
  private String nom;

  public  Chaine(String nom) {
    this.nom = nom;
  }

  @Override
  public void mettreAJour(String nouvelle) {
    System.out.println("Chaîne  '" + nom + "' a reçu une nouvelle : " + nouvelle);
  }
}
