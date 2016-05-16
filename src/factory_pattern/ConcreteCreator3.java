package factory_pattern;

/**
 * DELL电脑的具体构造者
 */
public class ConcreteCreator3 extends Creator {
    @Override
    public Product getConcreteCreator() {
        return new ConcreteProduct3();
    }
}
