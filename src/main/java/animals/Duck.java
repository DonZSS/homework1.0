package animals;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {

    private final String voice;


    public Duck() {
        this.voice = "Кря-кря!";
    }


    @Override
    public String getVoice() {
        return this.voice;
    }

    @Override
    public String fly(){
        return "Утка летит";
    }

    @Override
    public String swim() {
        return "Утка плавает";
    }

    @Override
    public String run() {
        return "Утка бежит";
    }
}
