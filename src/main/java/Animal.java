public class Animal {

    private String name ;
    private double age;
    private double healthCondition;
    private String color;
    private double hunger;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(double healthCondition) {
        this.healthCondition = healthCondition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHunger() {
        return hunger;
    }

    public void setHunger(double hunger) {
        this.hunger = hunger;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", healthCondition=" + healthCondition +
                ", color='" + color + '\'' +
                ", hunger=" + hunger +
                '}';
    }
}
