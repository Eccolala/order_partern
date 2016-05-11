package strategy_pattern;

/**
 * 具体策略类，按原价7折购买
 */
public class StrategyThree implements Discount{
    @Override
    public double computePrice(double price) {
        return price * 0.7;
    }
}
