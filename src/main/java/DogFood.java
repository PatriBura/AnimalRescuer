public class DogFood {
    double price;
    double quantity;
    double nutrition;
    DogFood milkbone = new DogFood();

    public void setMilkbone(DogFood milkbone) {
         milkbone.price = 23;
         milkbone.nutrition = 41;
         milkbone.quantity = 1;
    }
}
