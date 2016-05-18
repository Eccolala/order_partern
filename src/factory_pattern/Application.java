package factory_pattern;


public class Application {
    public static void main(String arg[]) {
        //工厂抽象类
        Product mProduct;

        //实例化制造HP电脑的工人
        Creator mHP = new ConcreteCreator1();
        mProduct = mHP.getConcreteCreator();
        //生产HP电脑
        mProduct.produce("HP");
        //实例化制造Acer电脑的工人
        Creator mAcer = new ConcreteCreator2();
        mProduct = mAcer.getConcreteCreator();
        mProduct.produce("Acer");
        //实例化制造DELL电脑的工人
        Creator mDELL = new ConcreteCreator3();
        mProduct = mDELL.getConcreteCreator();
        mProduct.produce("DELL");
        //实例化制造Lenovo电脑的工人
        Creator mLenovo = new ConcreteCreator4();
        mProduct = mLenovo.getConcreteCreator();
        mProduct.produce("Lenovo");



    }
}
