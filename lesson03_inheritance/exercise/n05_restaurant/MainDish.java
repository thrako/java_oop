package lesson03_inheritance.exercise.n05_restaurant;

import java.math.BigDecimal;

public class MainDish extends Food {
    public MainDish(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}