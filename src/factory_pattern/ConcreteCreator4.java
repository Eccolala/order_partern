package factory_pattern;

/**
 * Lenovo电脑的具体构造者
 */
public class ConcreteCreator4 extends Creator {
    @Override
    public Product getConcreteCreator() {
        return new ConcreteProduct4();
    }
}
