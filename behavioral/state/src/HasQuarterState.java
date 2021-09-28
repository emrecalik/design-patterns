public class HasQuarterState implements GumballMachineState{

    private final GumballMachineContext context;

    public HasQuarterState(GumballMachineContext context) {
        this.context = context;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can not insert quarter twice!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Yay!... You successfully ejected the quarter...");
        this.context.setCurrentState(this.context.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Yay!... You successfully turned the crank...");
        this.context.setCurrentState(this.context.getGumballSoldState());
    }

    @Override
    public void dispenseGumball() {
        System.out.println("You can not dispense a gumball before turning the crank!");
    }

    @Override
    public void refill() {
        System.out.println("You can not refill at the moment!");
    }
}
