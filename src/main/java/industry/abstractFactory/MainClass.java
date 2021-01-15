package industry.abstractFactory;



public class MainClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

//        Fruit apple = FruitFactory.getFruit("Apple");
//        Fruit banana = FruitFactory.getFruit("Banana");
//        Fruit pear = FruitFactory.getFruit("Pear");
//
//        apple.get();
//        banana.get();
        // get appleFactory
        FruitFactory af = new NorthFruitFactory();
        // get apple by appleFactory
        Fruit apple = af.getApple();
        apple.get();

        Fruit banana = af.getBanana();
        banana.get();

        // get appleFactory
        FruitFactory bf = new SouthFruitFactory();
        // get apple by appleFactory
        Fruit apple1 = bf.getApple();
        apple1.get();

        Fruit banana1 = af.getBanana();
        banana1.get();
    }

}
