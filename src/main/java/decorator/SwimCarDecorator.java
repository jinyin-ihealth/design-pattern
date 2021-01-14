package decorator;

public class SwimCarDecorator extends CarDecorator{
    public SwimCarDecorator(Car car) {
        super(car);
    }
    @Override
    public void show() {
        this.getCar().show();
        this.swim();
    }

    @Override
    public void run() {

    }

    public void swim(){
        System.out.println("could swim");
    }
}
