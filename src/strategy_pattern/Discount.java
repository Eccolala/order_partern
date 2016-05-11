package strategy_pattern;

/**
 * 策略类接口
 */
public interface Discount {
    double computePrice(double price);
}
