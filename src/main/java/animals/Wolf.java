package animals;

public class Wolf extends Carnivorous implements Run, Voice {

    private final String voice;


    public Wolf() {
        this.voice = "У-у-у-у-у";
    }


    @Override
    public String getVoice() {
        return this.voice;
    }

    @Override
    public String run() {
        return "Волк бежит";
    }

}
