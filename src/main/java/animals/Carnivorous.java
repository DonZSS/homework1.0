package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal{

    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Ем мясо");
            this.setSatiety(food.getEnergy());
        }
        else
            System.out.println("Трава мне не по душе");

    }
}
