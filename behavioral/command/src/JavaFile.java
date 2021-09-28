public class JavaFile implements ExecutableFile{
    @Override
    public void execute() {
        compile();
        System.out.println(".jar File - Executing...");
    }

    private void compile() {
        System.out.println(".java File - Compiling...");
    }
}
