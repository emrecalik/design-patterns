public class Context {

    private MathOperation mathOperation;

    public void setMathOperation(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public float performMathOperation(float num1, float num2) {
        return this.mathOperation.doOperation(num1, num2);
    }
}
