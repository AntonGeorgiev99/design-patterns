import java.util.LinkedList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new LinkedList<Observer>();

    protected void notifyObserver() {
        for (Observer o : observers)
            o.update();
    }

    public void register(Observer o) {
        observers.add(o);
    }

    public void remove(Observer o) {
        observers.remove(o);
    }
}
