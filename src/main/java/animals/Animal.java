package animals;

import food.Food;

public abstract class Animal {
    private int satiety = 5;

    public int getSatiety() {
        return satiety;
    }

    public int setSatiety(int satiety) {
        return this.satiety += satiety;
    }


    public abstract void eat(Food food);

}
