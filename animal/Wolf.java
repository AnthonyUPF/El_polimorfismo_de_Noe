package animal;

public class Wolf extends Animal{
    // Constructor
    public Wolf(String name, int age){
        super(name, age);
        super.setOccupiedPlaces(2);
    }

    // Override methods
    @Override
    protected void walk(){
        System.out.println("Wolf is walking");
    }

    @Override
    protected void sit(){
        System.out.println("Wolf is sitting");
    }

    // Specific method
    public void howl(){
        System.out.println("The wolf is howling");
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
