package strategy;

public class MainClass {
    public static void main(String[] args) {
//        Strategy stra = new MD5Strategy();
//        stra.encrypt();
        Context context = new Context(new MDSStrategy());
        context.encrypt();
    }
}
