package factory_pattern;

/**
 * 具体产品,HP电脑
 */
public class ConcreteProduct1 extends Product {
    private String brand;
    public ConcreteProduct1() {
         brand = "HP";
    }

    @Override
    public void produce(String s) {
        System.out.println("刚刚生产了一台" + brand + "电脑");
    }
}
