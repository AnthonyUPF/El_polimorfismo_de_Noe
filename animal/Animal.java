package animal;
import interfaces.*;

public abstract class Animal implements ITransportable{
    //Atributes
    protected String name;
    protected int age;
    protected int occupiedPlaces;

    //Constructors
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    protected int getOccupiedPlaces(){
        return occupiedPlaces;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    protected void setOccupiedPlaces(int occupiedPlaces){
        this.occupiedPlaces = occupiedPlaces;
    }

    //Abstract methods
    protected abstract void walk();

    protected abstract void sit();
    
}
