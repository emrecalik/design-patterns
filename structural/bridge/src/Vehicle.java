import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    public List<Process> processes = new ArrayList<>();

    public void addProcess(Process process) {
        this.processes.add(process);
    }

    public abstract void produce();

    public abstract int processTime();
}
