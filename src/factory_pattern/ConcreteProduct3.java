package factory_pattern;

/**
 * 具体产品,DELL电脑
 */
public class ConcreteProduct3 extends Product{
    private String brand;
    public ConcreteProduct3() {
         brand = "DELL";
    }

    @Override
    public void produce(String s) {
        System.out.println("刚刚生产了一台" + brand + "电脑");
    }
}
