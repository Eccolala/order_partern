package strategy_pattern;

/**
 * 具体策略类,代表按原价购买
 */
public class StrategyOne implements Discount {
    @Override
    public double computePrice(double price) {
        return price;
    }
}
