public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        context.setMathOperation(new Subtract());
        System.out.println("Subtract => " + context.performMathOperation(4.2f, 1.2f));

        context.setMathOperation(new Sum());
        System.out.println("Sum => " + context.performMathOperation(1.5f, 4.5f));

        context.setMathOperation(new Multiplication());
        System.out.println("Multiplication => " + context.performMathOperation(1f, 3f));

    }
}
