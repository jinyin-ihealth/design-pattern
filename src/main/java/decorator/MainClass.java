package decorator;

public class MainClass {
    public static void main(String[] args) {
        Car car = new RunCar();
        CarDecorator swimcar = new SwimCarDecorator(car);
        CarDecorator flySwimCar = new FlyCarDecorator(swimcar);
        flySwimCar.show();
    }
}
