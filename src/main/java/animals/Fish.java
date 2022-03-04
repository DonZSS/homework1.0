package animals;

import model.Size;

public class Fish extends Carnivorous implements Swim {

    public Fish(String name) {
        super(name);
    }

    @Override
    public String swim() {
        return "Рыба плавает";
    }

    public String getVoice() {
        return null;
    }

    @Override
    public Size getSize() {
        return Size.MEDIUM;
    }
}
