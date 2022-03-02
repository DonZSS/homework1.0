package animals;

public class Fish extends Carnivorous implements Swim {

    @Override
    public String swim() {
        return "Рыба плавает";
    }

    public String getVoice() {
        return null;
    }

}
