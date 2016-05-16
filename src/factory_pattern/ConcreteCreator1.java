package factory_pattern;

/**
 * HP电脑的具体构造者
 */
public class ConcreteCreator1 extends Creator {
    @Override
    public Product getConcreteCreator() {
        return new ConcreteProduct1();
    }
}
