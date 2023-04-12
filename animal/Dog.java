package animal;

public class Dog extends Animal {
    // Constructor
    public Dog(String name, int age){
        super(name, age);
        super.setOccupiedPlaces(1);
    }

    // Override methods
    @Override
    protected void walk(){
        System.out.println("Dog is walking");
    }

    @Override
    protected void sit(){
        System.out.println("Dog is sitting");
    }

    // Specific method
    public void bark(){
        System.out.println("The dog is barking");
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
