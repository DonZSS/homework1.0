package animals;

import model.Size;

public class Elephant extends Herbivore implements Run, Voice {

    private final String voice;


    public Elephant(String name) {
        super(name);
        this.voice = "Ффффыыыыыы";
    }


    @Override
    public String getVoice() {
        return this.voice;
    }

    @Override
    public String run() {
        return "Слон бежит";
    }


    @Override
    public Size getSize() {
        return Size.LARGE;
    }
}
