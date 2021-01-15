package industry.realExample;

public class MainClass {
    public static void main(String[] args) {
        double num1 = 1;
        double num2 = 2;
        String oper = "+";
        Operation operation = OperationFactory.getOperation(oper);
        operation.setNum1(num1);
        operation.setNum2(num2);
        double result = operation.getResult();
        System.out.println(result);
    }


}
