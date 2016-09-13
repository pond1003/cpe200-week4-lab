

public class Operand {
    protected String operand;

    protected Operand(String operand) {
        this.operand = operand;
    }

    protected Operand(int operand) {
         this.operand = Integer.toString(operand);
    }

    protected Operand(double operand) {
        this.operand = Double.toString(operand);

    }

}
