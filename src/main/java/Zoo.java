import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Elephant elephant = new Elephant();
        Fish fish = new Fish();
        Kotik kotik = new Kotik();
        Rabbit rabbit = new Rabbit();
        Wolf wolf = new Wolf();

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
        createPond[0] = new Duck();
        createPond[1] = new Fish();
        return createPond;
    }
}
