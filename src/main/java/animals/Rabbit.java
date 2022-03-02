package animals;

public class Rabbit extends Herbivore implements Run {


    @Override
    public String run() {
        return "Кролик бежит";
    }
}
