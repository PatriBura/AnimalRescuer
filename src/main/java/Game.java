public class Game {
    Rescuer rescuer;
    Dog dog;
    DogFood dogFood;
    Vet vet;


    public void start() {
        Dog labrador = new Dog();
        labrador.name = "Tara";
        labrador.healthCondition = 100;
        labrador.hunger = 70;
        labrador.age = 4;
        labrador.color = "black";

        Rescuer rescuer1 = new Rescuer();
        rescuer1.name = "Emily";
        rescuer1.money = 56;
    }
}


