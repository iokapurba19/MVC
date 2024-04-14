package academic.model;

public class Person {
    String ID;
    String Name;

    public Person(){
        this.ID = "";
        this.Name = "";
    }

    public Person(String id, String name){
        this.ID = id;
        this.Name = name;
    }

    public void setID(String id) {
        this.ID = id;
    } 

    public String getID() {
        return this.ID;
    }

    public String getName() {
        return this.Name;
    }

    @Override
    public String toString(){
        return this.ID + "|" + this.Name;
    }
    
}
