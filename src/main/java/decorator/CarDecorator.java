package decorator;

public abstract class CarDecorator implements Car{
    private Car car;

    public Car getCar(){
        return car;
    }
    public CarDecorator(Car car) {
        this.car = car;
    }

    public abstract void show();
}
