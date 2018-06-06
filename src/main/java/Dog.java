public class Dog {

    String name ;
    double age;
    double healthCondition;
    String color;
    double hunger;


    public void bark() {
        System.out.println("Ham Ham");
    }

    public String getAgeCategory() {
        if (age < 5) {
            return "young";
        } else if (age >=5 && age < 7) {
            return "middle age";
        } else {
            return "old";
        }
    }

}

