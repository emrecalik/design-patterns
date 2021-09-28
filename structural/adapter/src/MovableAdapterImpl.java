public class MovableAdapterImpl implements MovableAdapter{

    private final Movable movable;

    public MovableAdapterImpl(Movable movable) {
        this.movable = movable;
    }

    @Override
    public double getSpeedInKmh() {
        return movable.getSpeedInMph() * 1.61;
    }
}
