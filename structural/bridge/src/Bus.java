public class Bus extends Vehicle{

    @Override
    public void produce() {
        System.out.println("***Bus Production***");
        processes.forEach(process -> process.doWork(this));
        System.out.println("***Completed***\n");
    }

    @Override
    public int processTime() {
        return 50;
    }
}
