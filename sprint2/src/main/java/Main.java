import model.Apple;
import model.Food;
import model.Meat;
import model.servise.ShoppingCart;

import static model.constants.Colour.*;

public class Main {
    public static void main(String[] agrs) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, RED);
        Apple appleGreen = new Apple(8, 60, GREEN);

        Food[] food = {meat, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(food);

        shoppingCart.getTotalSum();
        shoppingCart.getTotalSumWithDiscount();
        shoppingCart.getSumVegetarian();
    }
}
