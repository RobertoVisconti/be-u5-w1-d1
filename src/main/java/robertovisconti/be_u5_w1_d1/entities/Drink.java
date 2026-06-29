package robertovisconti.be_u5_w1_d1.entities;

public class Drink extends ElementMenu {

    protected Drink() {
        super();
    }

    public Drink(String name, double price, int calories) {
        super(name, price, calories);
    }

    @Override
    public String toString() {
        return "Drink{} " + super.toString();
    }

}
