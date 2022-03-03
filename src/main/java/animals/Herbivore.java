package animals;


import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {

    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Ем траву");
            this.setSatiety(food.getEnergy());
        } else System.out.println("Мясо мне не по душе");

    }

}
