package animals;

import model.Size;

public class Rabbit extends Herbivore implements Run {


    public Rabbit(String name) {
        super(name);
    }

    @Override
    public String run() {
        return "Кролик бежит";
    }

    @Override
    public Size getSize() {
        return Size.MEDIUM;
    }
}
