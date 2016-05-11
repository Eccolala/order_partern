package strategy_pattern;

/**
 * 具体策略类,按原价减一元购买
 */
public class StrategyTwo implements Discount{
    @Override
    public double computePrice(double price) {
        return price - 1;
    }
}
