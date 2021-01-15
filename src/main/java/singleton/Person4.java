package singleton;

public class Person4 {
    //Lazy not multi-thread safe, we need to add locks,
    public static Person4 person;
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Person4(){

    }
    // we don't have to lock all method, actually we only need to lock the inside clause
    // since we don't have to sync the if clause
    // check twice
    public static Person4 getPerson(){
        if(person == null)
            synchronized (Person4.class) {
                if(person == null)
                person = new Person4();
            }
        return person;
    }
}
