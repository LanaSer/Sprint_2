package model.servise;

import model.Food;

public class ShoppingCart {
    Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }
    public void getTotalSum(){
        double sum = 0;
        for (Food value : food) {
            sum += value.getPrice() * value.getAmount();
        }
        System.out.println(String.format("цена покупок без скидки: " + sum));
    }
    public void getTotalSumWithDiscount(){
        double sum = 0;
        for (Food value : food) {
            sum += value.getPrice() * (100 - value.getDiscount()) / 100 * value.getAmount();
        }
        System.out.println(String.format("цена покупок со скидкой: " + sum));

    }
    public void getSumVegetarian() {
        double sum = 0;
        for (Food value : food) {
            if (value.isVegetarian()) {
                sum += value.getPrice() * value.getAmount();
            }
        }
            System.out.println(String.format("цена покупок вегетарианских продуктов: " + sum));
    }

}
