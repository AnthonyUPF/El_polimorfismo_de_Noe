package food;
import interfaces.*;

public class Food implements ITransportable{
    // Attributes
    private String name;
    private int occupiedPlaces;

    // Constructor
    public Food(String name, int occupiedPlaces){
        this.name = name;
        this.occupiedPlaces = occupiedPlaces;
    }

    // Getters
    public String getName(){
        return this.name;
    }

    protected int getOccupiedPlaces(){
        return this.occupiedPlaces;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setOccupiedPlaces(int occupiedPlaces){
        this.occupiedPlaces = occupiedPlaces;
    }

    //Other methods

    @Override
    public void move() {
        if(getOccupiedPlaces()==1){
            System.out.println("The place of food " +getName()+" is moving to the ark");
        }else{
            System.out.println("The " + getOccupiedPlaces() + " places of food " +getName()+" is moving to the ark");
        }
    }

    @Override
    public void stop() {
        if(getOccupiedPlaces()==1){
            System.out.println("The place of food "+getName()+ " is stopping in the ark");
        }else{
            System.out.println("The " + getOccupiedPlaces() + " places of food "+getName()+ " is stopping in the ark");
        }
    }

    @Override
    public int occupancy() {
        return getOccupiedPlaces();
    }
    
}
