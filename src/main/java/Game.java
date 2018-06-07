import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    Rescuer rescuer;
    Dog dog;
    Cat cat;
    Food food;
    Vet vet;
    private List<Food> availableFood = new ArrayList<Food>();
    private Entertainment[] availableActivities = new Entertainment[6];


    public List<Food> getAvailableFood() {

        return availableFood;
    }

    public Entertainment[] getAvailableActivities() {
        return availableActivities;
    }

    private List<Animal> availableAnimal = new ArrayList<>();

    public List<Animal> getAvailableAnimal() {
        return availableAnimal;
    }

    public void start() {
        rescuerName();
        this.initAnimals();
        this.displayAnimal();
        this.initFood();
        this.displayFood();


//        this.dog = new Dog();
//        this.dog.healthCondition = 100;
//        this.dog.hunger = 70;
//        this.dog.age = 4;
//
//
//
//        this.rescuer = new Rescuer();
//        this.rescuer.money = 56;
//
////        this.food = new Food();
////        this.food.name = "milkbone";
////        this.food.price = 23;
////        this.food.nutrition = 41;
////        this.food.quantity = 1;


//        Double hungerLevel = this.rescuer.feed(this.dog, this.food);
//        System.out.println("New hunger level is " + hungerLevel);


        this.initActivities();


    }

    public void displayFood() {
        System.out.println("Available foods");

        for (Food snacks : this.availableFood) {
            System.out.println(snacks);
        }

    }

    private void initFood() {
        Food food2 = new Food(22, "Pedigree");
        Food food3 = new Food(16, "Chappi");
        this.availableFood.add(food2);
        this.availableFood.add(food3);
    }

    private void initActivities() {
        Entertainment activity1 = new Entertainment();
        Entertainment activity2 = new Entertainment();
        activity1.name = "running";
        activity2.name = "brushing";
        this.availableActivities[0] = activity1;
        this.availableActivities[1] = activity2;

    }


    private String rescuerName() {
        System.out.println("Please enter player name");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    private void initAnimals() {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.setAge(4);
        animal1.setHealthCondition(88);
        animal2.setAge(2);
        animal2.setHealthCondition(90);
        this.availableAnimal.add(animal1);
        this.availableAnimal.add(animal2);


    }

    private void displayAnimal() {
        System.out.println("Available animals");
        for (Animal pets : this.availableAnimal) {
            System.out.println(pets);
        }
    }


}



