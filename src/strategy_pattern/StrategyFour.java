package strategy_pattern;

/**
 * 具体策略类，按原价6折购买
 */
public class StrategyFour implements Discount{
    @Override
    public double computePrice(double price) {
        return price * 0.6;
    }
}
