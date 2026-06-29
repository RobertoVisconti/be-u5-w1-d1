package robertovisconti.be_u5_w1_d1.entities;

import java.util.List;

public class Menu {

    private List<Pizza> pizza;
    private List<Drink> drink;
    private List<Topping> topping;

    protected Menu() {
    }

    public Menu(List<Pizza> pizza, List<Topping> topping, List<Drink> drink) {
        this.pizza = pizza;
        this.topping = topping;
        this.drink = drink;
    }

    public List<Pizza> getPizza() {
        return pizza;
    }

    public List<Drink> getDrink() {
        return drink;
    }

    public List<Topping> getTopping() {
        return topping;
    }

    public void printMenu() {
        System.out.println("******* PIZZE *******");
        for (Pizza pizza : pizza) {
            System.out.println(pizza);
        }

        System.out.println("******* TOPPING *******");
        for (Topping topping : topping) {
            System.out.println(topping);
        }

        System.out.println("******* BEVANDE *******");
        for (Drink drink : drink) {
            System.out.println(drink);
        }

    }


}


