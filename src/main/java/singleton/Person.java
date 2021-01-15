package singleton;

public class Person {
    //Hungry could make sure multi-thread safe since there is only one object, no matter how many times, you only get
    // object created on the first line
    public static final Person person = new Person();
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Person(){

    }

    public static Person getPerson(){
        return person;
    }
}
