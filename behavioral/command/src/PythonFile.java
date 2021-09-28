public class PythonFile implements ExecutableFile{
    @Override
    public void execute() {
        compile();
        System.out.println(".pyc File - Executing...");
    }

    private void compile() {
        System.out.println(".py File - Compiling...");
    }
}
