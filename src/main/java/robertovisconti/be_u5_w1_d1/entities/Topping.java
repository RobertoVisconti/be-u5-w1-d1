package robertovisconti.be_u5_w1_d1.entities;

public class Topping extends ElementMenu {

    protected Topping() {
        super();
    }

    public Topping(String name, double price, int calories) {
        super(name, price, calories);
    }

    @Override
    public String toString() {
        return "Topping{} " + super.toString();
    }
}
