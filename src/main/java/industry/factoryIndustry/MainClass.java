package industry.factoryIndustry;

public class MainClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

//        Fruit apple = FruitFactory.getFruit("Apple");
//        Fruit banana = FruitFactory.getFruit("Banana");
//        Fruit pear = FruitFactory.getFruit("Pear");
//
//        apple.get();
//        banana.get();
        // get appleFactory
        FruitFactory af = new AppleFactory();
        // get apple by appleFactory
        Fruit apple = af.getFruit();
        apple.get();

    }

}
