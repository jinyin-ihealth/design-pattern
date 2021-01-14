package decorator;

public class FlyCarDecorator extends CarDecorator{

    public FlyCarDecorator(Car car) {
        super(car);
    }
    public void fly(){
        System.out.println("could fly");
    }

    public void show(){
        this.getCar().show();
        this.fly();
    }

    @Override
    public void run() {

    }
}
