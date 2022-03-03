package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal{

    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println("Ем мясо");
            this.setSatiety(food.getEnergy());
        }
        else
            throw new WrongFoodException("Трава мне не по душе");

    }
}
