public class Food {
    double price;
    double quantity;
    double nutrition;
    String name;

    public Food(double nutrition, String name) {
        this.nutrition = nutrition;
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "nutrition=" + nutrition +
                ", name='" + name + '\'' +
                '}';
    }
}
