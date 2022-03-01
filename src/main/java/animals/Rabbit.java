package animals;

public class Rabbit extends Herbivore implements Run {
    private int satiety ;


    @Override
    public String getVoice() {
        return null;
    }
    @Override
    public String run() {
        return "Кролик бежит";
    }
}
