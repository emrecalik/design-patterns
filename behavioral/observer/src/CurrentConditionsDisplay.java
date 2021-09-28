public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private Observable observable;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("***** Current Conditions Display *****");
        System.out.println("Humidity => " + this.observable.getHumidity());
        System.out.println("Pressure => " + this.observable.getPressure());
        System.out.println("Temperature => " + this.observable.getTemp());
    }

    @Override
    public void update(Observable observable) {
        this.observable = observable;
        this.display();
    }
}
