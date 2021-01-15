package industry.abstractFactory;

import industry.abstractFactory.Apple;

public class NorthBanana extends Apple {
    @Override
    public void get() {
        System.out.println("collect north banana");
    }
}
