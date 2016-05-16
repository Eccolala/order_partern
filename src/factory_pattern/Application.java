package factory_pattern;


public class Application {
    public static void main(String arg[]) {
        //工厂抽象类
        Product mProduct;

        //实例化HP电脑工厂
        Creator mHP = new ConcreteCreator1();
        mProduct = mHP.getConcreteCreator();
        //生产HP电脑
        mProduct.produce("HP");
        //实例化Acer电脑工厂
        Creator mAcer = new ConcreteCreator2();
        mProduct = mAcer.getConcreteCreator();
        mProduct.produce("Acer");
        //实例化DELL电脑工厂
        Creator mDELL = new ConcreteCreator3();
        mProduct = mDELL.getConcreteCreator();
        mProduct.produce("DELL");
        //实例化Lenovo电脑工厂
        Creator mLenovo = new ConcreteCreator4();
        mProduct = mLenovo.getConcreteCreator();
        mProduct.produce("Lenovo");



    }
}
