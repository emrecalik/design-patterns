public class Main {
    public static void main(String[] args) {
        GumballMachineContext context = new GumballMachineContext(10);
        context.insertQuarter();
        context.insertQuarter();
        context.ejectQuarter();
        context.insertQuarter();
        context.turnCrank();
        context.insertQuarter();
        context.dispenseGumball();
        context.insertQuarter();
    }
}
