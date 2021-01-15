package singleton;

public class Person2 {
    //Lazy not multi-thread safe, we need to add locks,
    public static  Person2 person;
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Person2(){

    }
    //public static synchronized Person2 getPerson() this one is safe
    public static Person2 getPerson(){
        if(person == null) person = new Person2();
        return person;
    }
}
