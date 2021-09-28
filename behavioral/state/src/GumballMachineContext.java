public class GumballMachineContext {

    private final GumballMachineState noQuarterState;

    private final GumballMachineState hasQuarterState;

    private final GumballMachineState gumballSoldState;

    private final GumballMachineState outOfGumballsState;

    private GumballMachineState currentState;

    private int gumballCount;

    public GumballMachineContext(int gumballCount) {
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.gumballSoldState = new GumballSoldState(this);
        this.outOfGumballsState = new OutOfGumballsState(this);

        this.currentState = noQuarterState;

        this.gumballCount = gumballCount;
    }

    public void insertQuarter() {
        this.currentState.insertQuarter();
    }

    public void turnCrank() {
        this.currentState.turnCrank();
    }

    public void dispenseGumball() {
        this.currentState.dispenseGumball();
    }

    public void ejectQuarter() {
        this.currentState.ejectQuarter();
    }

    public void refill(int gumballCount) {
        this.gumballCount += gumballCount;
        this.currentState.refill();
    }

    // Getters
    public GumballMachineState getNoQuarterState() {
        return noQuarterState;
    }

    public GumballMachineState getHasQuarterState() {
        return hasQuarterState;
    }

    public GumballMachineState getGumballSoldState() {
        return gumballSoldState;
    }

    public GumballMachineState getOutOfGumballsState() {
        return outOfGumballsState;
    }

    public GumballMachineState getCurrentState() {
        return currentState;
    }

    public int getGumballCount() {
        return gumballCount;
    }

    // Setters
    public void setCurrentState(GumballMachineState currentState) {
        this.currentState = currentState;
    }

    public void setGumballCount(int gumballCount) {
        this.gumballCount = gumballCount;
    }
}
