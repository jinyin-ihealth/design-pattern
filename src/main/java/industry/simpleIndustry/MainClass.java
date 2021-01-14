package industry.simpleIndustry;

public class MainClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//        Fruit apple = new Apple();
//        Fruit banana = new Banana();
//        apple.get();
//        banana.get();
//        Fruit apple = FruitFactory.getApple();
//        Fruit banana = FruitFactory.getBanana();
//        apple.get();
//        banana.get();
        Fruit apple = FruitFactory.getFruit("Apple");
        Fruit banana = FruitFactory.getFruit("Banana");
        apple.get();
        banana.get();

    }

}
