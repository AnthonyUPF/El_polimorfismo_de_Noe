package animal;

public class Elephant extends Animal{
    // Constructor
    public Elephant(String name, int age){
        super(name, age);
        super.setOccupiedPlaces(15);
    }

    // Override methods
    @Override
    protected void walk(){
        System.out.println("Elephant is walking");
    }

    @Override
    protected void sit(){
        System.out.println("Elephant is sitting");
    }

    // Specific method
    public void trumpet() {
        System.out.println("The elephant is trumpeting.");
    }

    @Override
    public void move() {
        walk();
    }

    @Override
    public void stop() {
        sit();
    }

    @Override
    public int occupancy() {
        return getOccupiedPlaces();
    }
}
