package decorator;

public class RunCarDecorator {
    public void run(){
        System.out.println("could run");
    }

    public void show(){
        this.run();
    }
}
