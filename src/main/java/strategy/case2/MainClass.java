package strategy.case2;

public class MainClass {
    public static void main(String[] args) {
        double num = 200;
        Context context = new Context(new StrategyB());
        double newNum = context.cost(num);
        System.out.println(newNum);
    }
}
