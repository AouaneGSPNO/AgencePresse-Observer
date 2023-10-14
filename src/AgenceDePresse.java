import java.util.ArrayList;
import java.util.List;

public class AgenceDePresse {
  private List<Observer> chaines = new ArrayList ();

  public void abonnerObserver(Observer Observer) {
    chaines.add(Observer);
  }

  public void desabonnerObserver(Observer Observer) {
    chaines.remove(Observer);
  }

  public void recevoirNouvelle(String nouvelle) {
    notifierObservers(nouvelle);
  }

  private void notifierObservers(String nouvelle) {
    for (Observer Observer : chaines) {
      Observer.mettreAJour(nouvelle);
    }
  }
}
