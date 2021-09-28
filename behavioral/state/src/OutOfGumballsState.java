public class OutOfGumballsState implements GumballMachineState{

    private final GumballMachineContext context;

    public OutOfGumballsState(GumballMachineContext context) {
        this.context = context;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can not insert a quarter!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can not eject a quarter!");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can not turn the crank!");
    }

    @Override
    public void dispenseGumball() {
        System.out.println("You can not dispense a Gumball!");
    }

    @Override
    public void refill() {
        System.out.println("Yay!... Refill is successful...");
        this.context.setCurrentState(this.context.getNoQuarterState());
    }
}
