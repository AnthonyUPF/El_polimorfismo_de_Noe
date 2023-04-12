package animal;

public class Lion extends Animal{
    // Constructor
    public Lion(String name, int age){
        super(name, age);
        super.setOccupiedPlaces(4);
    }

    // Override methods
    @Override
    protected void walk(){
        System.out.println("Lion is walking");
    }

    @Override
    protected void sit(){
        System.out.println("Lion is sitting");
    }

    // Specific method
    public void roar(){
        System.out.println("The lion is roaring");
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
