package industry.simpleIndustry;

public class FruitFactory {
    // the industry class is in charge of creating all instances to be called directly
    // creator role
//    /**
//     *  get instance of Apple
//     */
//    public static Fruit getApple(){
//        return new Apple();
//    }
//
//    /**
//     *  get instance of Banana
//     */
//    public static Fruit getBanana(){
//        return new Banana();
//    }
    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
//        if(type.equalsIgnoreCase("apple")) return Apple.class.newInstance();
//        else if(type.equalsIgnoreCase("banana"))
//            return Banana.class.newInstance();
//        else System.out.println("not found");
//        return null;

            String path = "src/main/java/industry/simpleIndustry/";
            Class fruit = Class.forName(path + type );
            return (Fruit) fruit.newInstance();

    }
}
