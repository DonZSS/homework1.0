package animals;

import food.Food;
import model.Size;

public abstract class Animal {
    private int satiety = 5;
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public int setSatiety(int satiety) {
        return this.satiety += satiety;
    }


    public abstract void eat(Food food);

    public abstract Size getSize();

}
