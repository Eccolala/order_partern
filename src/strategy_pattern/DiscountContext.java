package strategy_pattern;

/**
 * 上下文类,
 */
public class DiscountContext {
    Discount discount;

    public void setStrategy(Discount discount) {
        this.discount = discount;
    }

    public double getTotalPrice(double price) {
        if (discount != null)
            return discount.computePrice(price);
        else
            return 0;
    }


}
