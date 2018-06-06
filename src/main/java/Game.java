import java.util.ArrayList;
import java.util.List;

public class Game {
    Rescuer rescuer;
    Dog dog;
    DogFood dogFood;
    Vet vet;
    private List<DogFood> availableFood = new ArrayList<DogFood>();
    private Entertainment[] availableActivities = new Entertainment[6];

    public List<DogFood> getAvailableFood() {
        return availableFood;
    }

    public Entertainment[] getAvailableActivities() {
        return availableActivities;
    }

    public void start() {
        this.initFood();
        this.displayFood();


        this.dog = new Dog();
        this.dog.name = "Tara";
        this.dog.healthCondition = 100;
        this.dog.hunger = 70;
        this.dog.age = 4;
        this.dog.color = "black";


        this.rescuer = new Rescuer();
        this.rescuer.name = "Emily";
        this.rescuer.money = 56;

        this.dogFood = new DogFood();
        this.dogFood.name = "milkbone";
        this.dogFood.price = 23;
        this.dogFood.nutrition = 41;
        this.dogFood.quantity = 1;


        Double hungerLevel = this.rescuer.feed(this.dog, this.dogFood);
        System.out.println("New hunger level is " + hungerLevel);


        this.initActivities();


    }

    public void displayFood() {
        System.out.println("Available foods");

        for (DogFood snacks : this.availableFood) {

            System.out.println(snacks.name);
        }

    }

    private void initFood() {
        DogFood dogFood2 = new DogFood();
        DogFood dogFood3 = new DogFood();
        dogFood2.name = "Pedigree";
        dogFood3.name = "Chappi";
        this.availableFood.add(dogFood2);
        this.availableFood.add(dogFood3);
    }

    private void initActivities() {
        Entertainment activity1 = new Entertainment();
        Entertainment activity2 = new Entertainment();
        activity1.name = "running";
        activity2.name = "brushing";
        this.availableActivities[0] = activity1;
        this.availableActivities[1] = activity2;

    }


}



