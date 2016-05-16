package factory_pattern;

/**
 * Acer电脑的具体构造者
 */
public class ConcreteCreator2 extends Creator {
    @Override
    public Product getConcreteCreator() {
        return new ConcreteProduct2();
    }
}
