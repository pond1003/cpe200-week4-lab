

public class BinaryCalculator {

    private
    Operand firstOperand;
    Operand secondOperand;


    public BinaryCalculator() {

    }

    public void setFirstOperand(Operand operand) {
        this.firstOperand = operand;
    }


    public void setSecondOperand(Operand operand) {
        this.secondOperand = operand;
    }

    public String add() {
        double fir = Double.parseDouble(firstOperand.operand);
        double sec = Double.parseDouble(secondOperand.operand);
        double s = fir+sec;

        if(fir != (int)fir || sec != (int)sec){
            return Double.toString(s);}
        else{
            int sum;
            sum = (int)s;
            return Integer.toString(sum);
        }
    }                               //Done !

    public String subtract() {
        double fir = Double.parseDouble(firstOperand.operand);
        double sec = Double.parseDouble(secondOperand.operand);
        double s;

        if(fir > sec){ s = fir-sec;}        //check value which have more value.
        else{
            s = sec-fir;
            if(fir < 0 && sec <0){s *= -1;}
                                    }
        //Check double.
        if(fir != (int)fir || sec != (int)sec){
            s *= 10;
            double temp = s;
            temp = Math.round(temp);
            temp /= 10;

            return Double.toString(temp);}
        else{
            int sum;
            sum = (int)s;
            return Integer.toString(sum);
        }
    }                               //Done !

    public String multiply() {
        double fir = Double.parseDouble(firstOperand.operand);
        double sec = Double.parseDouble(secondOperand.operand);
        double s = fir * sec;

        if(fir != (int)fir || sec != (int)sec){
            s *= 10;
            double temp = s;
            temp = Math.round(temp);
            temp /= 10;

            return Double.toString(temp);}
        else{
            int sum;
            sum = (int)s;
            return Integer.toString(sum);
        }
    }                               //Done!

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        double fir = Double.parseDouble(firstOperand.operand);
        double sec = Double.parseDouble(secondOperand.operand);
        double s;
        if(sec == 0.0 || sec == 0){
           throw new ArithmeticException();
        }
        s = fir / sec;
        s = (double)Math.round(s*100000d)/100000d;
        if(s != (int)s ){
        return Double.toString(s) ; }
        else{
            int sum;
            sum = (int)s;
            return Integer.toString(sum);
        }
    }

    public String power() {
        double fir = Double.parseDouble(firstOperand.operand);
        double sec = Double.parseDouble(secondOperand.operand);
        double s = Math.pow(fir, sec);

        if(s != (int)s ){
            return Double.toString(s) ; }
        else{
            int sum;
            sum = (int)s;
            return Integer.toString(sum);
        }
    }

}
