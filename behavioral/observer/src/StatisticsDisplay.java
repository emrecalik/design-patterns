public class StatisticsDisplay implements Observer, DisplayElement{

    private Observable observable;

    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.observable = new Observable();
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("***** Statistics Display *****");
        System.out.println("Humidity => " + this.observable.getHumidity());
        System.out.println("Pressure => " + this.observable.getPressure());
        System.out.println("Temperature => " + this.observable.getTemp());
    }

    @Override
    public void update(Observable observable) {
        this.observable = observable;
        this.analyzeData();
        this.display();
    }

    private void analyzeData() {
        this.observable.setHumidity(this.observable.getHumidity() * 3);
        this.observable.setPressure(this.observable.getPressure() + 12);
        this.observable.setTemp(this.observable.getTemp() + 141);
    }
}
