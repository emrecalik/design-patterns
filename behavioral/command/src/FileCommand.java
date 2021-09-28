import java.util.ArrayList;
import java.util.List;

public class FileCommand {
    private final List<ExecutableFile> executableFiles = new ArrayList<>();

    public void addFile(ExecutableFile executableFile) {
        this.executableFiles.add(executableFile);
    }

    public void removeFile(ExecutableFile executableFile) {
        this.executableFiles.remove(executableFile);
    }

    public void execute() {
        for(ExecutableFile executableFile : executableFiles) {
            executableFile.execute();
        }
    }
}
