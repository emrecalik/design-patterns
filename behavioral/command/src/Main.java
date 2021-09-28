public class Main {
    public static void main(String[] args) {
        FileCommand fileCommand = new FileCommand();
        fileCommand.addFile(new JavaFile());
        fileCommand.addFile(new PythonFile());
        fileCommand.addFile(new CppFile());
        fileCommand.execute();
    }
}
