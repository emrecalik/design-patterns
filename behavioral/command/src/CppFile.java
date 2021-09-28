public class CppFile implements ExecutableFile{
    @Override
    public void execute() {
        compile();
        System.out.println(".obj File - Executing...");
    }

    private void compile() {
        System.out.println(".cpp File - Compiling...");
    }
}
