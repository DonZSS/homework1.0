package animals;


import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Ем траву");
        }
        else System.out.println("Мясо мне не по душе");

    }

}
