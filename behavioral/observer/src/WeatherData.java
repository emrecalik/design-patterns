import java.util.ArrayList;

public class WeatherData implements Subject{

    private final ArrayList<Observer> observers;

    private final Observable observable;

    public WeatherData() {
        this.observers = new ArrayList<>();
        this.observable = new Observable();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(observable);
        }
    }

    public void measurementChanged() {
        this.notifyObservers();
    }

    public void setMeasurements(Observable observable) {
        this.observable.setHumidity(observable.getHumidity());
        this.observable.setPressure(observable.getPressure());
        this.observable.setTemp(observable.getTemp());
        this.measurementChanged();
    }
}
