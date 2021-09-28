public class GumballSoldState implements GumballMachineState{

    private final GumballMachineContext context;

    public GumballSoldState(GumballMachineContext context) {
        this.context = context;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can not insert a quarter yet!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can not eject a quarter!");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can not turn crank!");
    }

    @Override
    public void dispenseGumball() {
        if (this.context.getGumballCount() > 0) {
            System.out.println("Yay!... Gumball is being dispensed...");
            this.context.setGumballCount(this.context.getGumballCount() - 1);
            if (this.context.getGumballCount() > 0) {
                System.out.println("There are still many gumballs waiting for you!");
                this.context.setCurrentState(this.context.getNoQuarterState());
                return;
            }
        }
        this.context.setCurrentState(this.context.getOutOfGumballsState());
    }

    @Override
    public void refill() {
        System.out.println("You can not refill at the moment!");
    }
}
