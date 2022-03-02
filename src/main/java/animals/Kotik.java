package animals;

public class Kotik extends Carnivorous implements Run, Voice {
    private String name;
    private String voice;
    private int satiety;
    private int weight;

    private static int count = 0;
    private static final int METHODS = 5;

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getVoice() {
//        return voice;
//    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

//    public void setSatiety(int satiety) {
//        this.satiety = satiety;
//    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Kotik.count = count;
    }

    @Override
    public String getVoice() {
        return this.voice = "Мяу";
    }

    @Override
    public String run() {
        return "Котик бежит";
    }

    public boolean play() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else
            return false;
    }

    public boolean sleep() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else
            return false;
    }

    public boolean wash() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else
            return false;
    }

    public boolean walk() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else
            return false;
    }

    public boolean hunt() {
        if (satiety > 0) {
            satiety--;
            return true;
        } else
            return false;
    }

    public void eat(int satietys) {
        satiety += satietys;
    }

    public void eat(int satietys, String foodName) {
        eat(satietys);
    }

    public void eat() {
        eat(3, "Вискас");
    }

    public String[] liveAnotherDay() {
        String[] myArray = new String[24];
        for (int i = 0; i < myArray.length; i++) {
            int number = (int) (Math.random() * METHODS) + 1;
            switch (number) {
                case 1:
                    if (play()) {
                        myArray[i] = (i + " - играл");
                    } else {
                        eat();
                        myArray[i] = (i + " - ел");
                    }
                    break;
                case 2:
                    if (sleep()) {
                        myArray[i] = (i + " - спал");
                    } else {
                        eat();
                        myArray[i] = (i + " - ел");
                    }
                    break;
                case 3:
                    if (wash()) {
                        myArray[i] = (i + " - умывался");
                    } else {
                        eat();
                        myArray[i] = (i + " - ел");
                    }
                    break;
                case 4:
                    if (walk()) {
                        myArray[i] = (i + " - гулял");
                    } else {
                        eat();
                        myArray[i] = (i + " - ел");
                    }
                    break;
                case 5:
                    if (hunt()) {
                        myArray[i] = (i + " - охотился");
                    } else {
                        eat();
                        myArray[i] = (i + " - ел");
                    }
                    break;
            }

        }
        return myArray;

    }
}
