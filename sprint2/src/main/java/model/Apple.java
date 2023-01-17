package model;

import model.constants.Colour;

import static model.constants.Discount.DISCOUNT60;

public class Apple extends Food{
    String colour;
    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        setVegetarian(true);

    }
    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED)) {
            return DISCOUNT60;
        } else
            return 0;
    }

}
