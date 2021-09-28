public class NoQuarterState implements GumballMachineState{

    private final GumballMachineContext context;

    public NoQuarterState(GumballMachineContext context) {
        this.context = context;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Yay!... You have successfully inserted the quarter...");
        this.context.setCurrentState(this.context.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can not eject quarter without a quarter!");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can not turn crank without a quarter!");
    }

    @Override
    public void dispenseGumball() {
        System.out.println("You can not dispense gumball without a quarter!");
    }

    @Override
    public void refill() {
        System.out.println("You can not refill at the moment!");
    }
}
