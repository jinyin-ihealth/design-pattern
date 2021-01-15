package industry.factoryIndustry;

public interface Fruit {
    // Product role, the parent class of all objects created by the Industry.
    // this class is in charge of all public apis of all instances
    // the Banana and Apple classes are Concrete Product role, which means they are concrete roles created by the industry
    public void get();
}
