public class Rescuer {
    String name;
    double money;


    public double feed(Dog dog, DogFood dogFood) {

        System.out.println("Rescuer " + this.name + " feeds " + dog.name + " " + dogFood.name);
        double hungerLevel = dog.hunger - dogFood.nutrition;
        return hungerLevel;

    }
}
