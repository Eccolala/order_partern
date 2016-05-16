package factory_pattern;

/**
 * 具体产品,Acer电脑
 */
public class ConcreteProduct2 extends Product{
    private String brand;
    public ConcreteProduct2() {
         brand = "Acer";
    }

    @Override
    public void produce(String s) {
        System.out.println("刚刚生产了一台" + brand + "电脑");
    }
}
