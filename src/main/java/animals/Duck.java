package animals;

public class Duck extends Herbivore implements Fly, Swim, Voice {
    private String voice;


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

}
