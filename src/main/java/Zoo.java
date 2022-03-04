import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;
import model.Aviary;
import model.Size;


public class Zoo {
    private static Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.MEDIUM);
    private static Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.LARGE);

    public static void main(String[] args) {
        Duck duck = new Duck("Утка");
        Elephant elephant = new Elephant("Слон");
        Fish fish = new Fish("Рыба");
        Kotik kotik = new Kotik("Котик");
        Rabbit rabbit = new Rabbit("Кролик");
        Wolf wolf = new Wolf("Волк");

        Grass grass = new Grass();
        Meat meat = new Meat();

        Worker worker = new Worker();

        worker.getVoice(duck);
        worker.feed(duck, grass);
        worker.feed(duck, meat);

        worker.getVoice(elephant);
        worker.feed(elephant, grass);
        worker.feed(elephant, meat);

        worker.getVoice(kotik);
        worker.feed(kotik, grass);
        worker.feed(kotik, meat);

        worker.feed(rabbit, grass);
        worker.feed(rabbit, meat);

        worker.getVoice(wolf);
        worker.feed(wolf, grass);
        worker.feed(wolf, meat);

//        worker.getVoice(fish);

        Swim[] createPond = createPond();
        System.out.println(createPond[0].swim());
        System.out.println(createPond[1].swim());

        System.out.println(elephant.getSatiety()  + " - сытость от травы");
        System.out.println(wolf.getSatiety() + " - сытость от мясо");

        fillCarnivorousAviary();
        fillHerbivoreAviary();
        getCarnivorous("Черный волк");
        getHerbivore("Кряква");



    }

    static Swim[] createPond() {
        Swim[] createPond;
        createPond = new Swim[2];
        createPond[0] = new Duck("Утка");
        createPond[1] = new Fish("Рыба");
        return createPond;
    }

    static void fillCarnivorousAviary() {
        Wolf wolf1 = new Wolf("Черный волк");
        Wolf wolf2 = new Wolf("Серый волк");
        //Rabbit rabbit = new Rabbit("Заяц Русак");
        carnivorousAviary.addAnimal(wolf1);
        carnivorousAviary.addAnimal(wolf2);
        //carnivorousAviary.addAnimal(rabbit);

    }

    static void fillHerbivoreAviary() {
        Duck duck1 = new Duck("Кряква");
        Duck duck2 = new Duck("Чирок");
        //Kotik kotik = new Kotik("Котик");
        herbivoreAviary.addAnimal(duck1);
        herbivoreAviary.addAnimal(duck2);
        //herbivoreAviary.addAnimal(kotik);
    }

    static Carnivorous getCarnivorous(String name) {
        return carnivorousAviary.getAnimal(name);
    }

    static Herbivore getHerbivore(String name) {
        return herbivoreAviary.getAnimal(name);
    }
}
