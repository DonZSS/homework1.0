package animals;


import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Herbivore extends Animal {

    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            System.out.println("Ем траву");
            this.setSatiety(food.getEnergy());
        } else
            throw new WrongFoodException("Мясо мне не по душе");

    }

}
