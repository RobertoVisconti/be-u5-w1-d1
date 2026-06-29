package robertovisconti.be_u5_w1_d1.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends ElementMenu {

    private List<Topping> toppings = new ArrayList<>();

    protected Pizza() {
        super();
    }


    public Pizza(String name, double price, int calories) {
        super(name, price, calories);
    }


    public List<Topping> getToppings() {
        return toppings;
    }


    // METODO CALCOLO PREZZO
    @Override
    public double getPrice() {
        double total = super.getPrice();
        for (Topping topping : toppings) {
            total += topping.getPrice();
        }
        return total;
    }


    // METODO CALCOLO CALORIE
    @Override
    public int getCalories() {
        int total = super.getCalories();
        for (Topping topping : toppings) {
            total += topping.getCalories();
        }
        return total;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + getName() + '\'' +
                ", toppings=" + toppings +
                ", totalCalories=" + getCalories() +
                ", totalPrice=" + getPrice() +
                '}';
    }

}
