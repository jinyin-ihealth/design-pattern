package industry.realExample;


public class OperationFactory {
    public static Operation getOperation(String oper) {
        if("+".equals(oper)) return new AddOperation();
        return null;
    }
}
