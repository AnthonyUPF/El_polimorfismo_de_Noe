package animal;

public class Sheep extends Animal {
    // Constructor
    public Sheep(String name, int age){
        super(name, age);
        super.setOccupiedPlaces(3);
    }

    // Override methods
    @Override
    protected void walk(){
        System.out.println("Sheep is walking");
    }

    @Override
    protected void sit(){
        System.out.println("Sheep is sitting");
    }

    // Specific method
    public void bleat() {
        System.out.println("The sheep is bleating.");
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