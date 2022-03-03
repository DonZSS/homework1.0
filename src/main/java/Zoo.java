import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;

public class Zoo {
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

    }

    static Swim[] createPond() {
        Swim[] createPond;
        createPond = new Swim[2];
        createPond[0] = new Duck("Утка");
        createPond[1] = new Fish("Рыба");
        return createPond;
    }
}
