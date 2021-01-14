package strategy.case2;

public class StrategyA implements Strategy{
    @Override
    public double cost(double num) {
        return num * 0.8;
    }
}
