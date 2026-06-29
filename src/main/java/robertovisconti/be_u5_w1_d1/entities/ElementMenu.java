package robertovisconti.be_u5_w1_d1.entities;

public abstract class ElementMenu {

    private String name;
    private double price;
    private int calories;

    protected ElementMenu() {
    }


    public ElementMenu(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }

}
