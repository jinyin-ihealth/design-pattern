package industry.realExample;


public class AddOperation extends Operation {
    @Override
    public double getResult(){
        double result = this.getNum1() + this.getNum2();
        return result;
    }
}
