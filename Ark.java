import java.util.ArrayList;
import animal.*;
import food.*;
import interfaces.ITransportable;

public class Ark{
    private static ArrayList<Animal> arkWarehouseAnimal= new ArrayList<Animal>();
    private static ArrayList<Food> arkWarehouseFood= new ArrayList<Food>();
    private static int availablePlaces = 50;
    private static int occupiedPlacesFood = 0;

    public static void main(String[] args){
        Sheep sheep = new Sheep("Dolly", 3);
        Dog dog = new Dog("Fido", 5);
        Elephant elephant = new Elephant("Jumbo", 10);
        Wolf wolf = new Wolf("Alpha", 7);
        Tiger tiger = new Tiger("Tigger", 4);
        Lion lion = new Lion("Leo", 6);

         
        Ark.store(sheep);
        Ark.store(dog);
        Ark.store(elephant);
        Ark.store(wolf);
        Ark.store(tiger);
        Ark.store(lion);

    
        Food food = new Food("Grass", 3);
        Food food2 = new Food("Meat", 5);
        Food food3 = new Food("Fish", 2);
        Food food4 = new Food("Vegetables", 4);
        Food food5 = new Food("Fruits", 3);

        Ark.store(food);
        Ark.store(food2);
        Ark.store(food3);
        Ark.store(food4);
        Ark.store(food5);

        if(arkWarehouseAnimal.size()==1){
            System.out.println("In total we have " + arkWarehouseAnimal.size() + " animal in the ark");
        }else{
            System.out.println("In total we have " + arkWarehouseAnimal.size() + " animals in the ark");
        }

        if(arkWarehouseFood.size()==1){
            System.out.println("In total we have " + occupiedPlacesFood + " occupied place of food in the ark");
        }else{
            System.out.println("In total we have " + occupiedPlacesFood + " occupied places of food in the ark");
        }

    }

    public static void store(ITransportable item){  
        if(availablePlaces>=item.occupancy()){
            item.move();
            item.stop();
            availablePlaces-=item.occupancy();
            if(item instanceof Animal){
                arkWarehouseAnimal.add((Animal) item);
                System.out.println("A "+ item.getClass().getSimpleName() + " has just entered in the ark");

            }else if(item instanceof Food){
                arkWarehouseFood.add((Food) item);
                occupiedPlacesFood+=item.occupancy();
                System.out.println("The food "+((Food)item).getName() +" has just entered in the ark");
            }        
        }else{
            if(item instanceof Animal){
                System.out.println("There are no places available for this " + item.getClass().getSimpleName() + " in the ark");
            }else if(item instanceof Food){
                System.out.println("There are no places available for the food " + ((Food)item).getName() + " in the ark");
            }
        }   
    }  

    

    

}