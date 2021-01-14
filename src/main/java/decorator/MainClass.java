package decorator;

public class MainClass {
    public static void main(String[] args) {
        Car car = new RunCar();
        car.show();
        System.out.println("--------");

        CarDecorator swimcar = new SwimCarDecorator(car);
        swimcar.show();
        System.out.println("--------");

        CarDecorator flySwimCar = new FlyCarDecorator(swimcar);
        flySwimCar.show();
    }
}
