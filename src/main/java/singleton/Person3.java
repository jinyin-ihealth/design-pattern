package singleton;

public class Person3 {
    //Lazy not multi-thread safe, we need to add locks,
    public static Person3 person;
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Person3(){

    }
    // we don't have to lock all method, actually we only need to lock the inside clause
    // since we don't have to sync the if clause
    public static  Person3 getPerson(){
        if(person == null)
            synchronized (person) {

                person = new Person3();
            }
        return person;
    }
}
