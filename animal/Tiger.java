package animal;

public class Tiger extends Animal{
    // Constructor
    public Tiger(String name, int age){
        super(name, age);
        super.setOccupiedPlaces(5);
    }

    // Override methods
    @Override
    protected void walk(){
        System.out.println("Tiger is walking");
    }

    @Override
    protected void sit(){
        System.out.println("Tiger is sitting");
    }

    // Specific method
    public void roar(){
        System.out.println("The tiger is roaring");
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
