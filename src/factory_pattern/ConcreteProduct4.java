package factory_pattern;

/**
 * 具体产品,Lenovo电脑
 */
public class ConcreteProduct4 extends Product {
    private String brand;

    public ConcreteProduct4() {
        brand = "Lenovo";
    }

    @Override
    public void produce(String s) {
        System.out.println("刚刚生产了一台" + brand + "电脑");
    }
}
