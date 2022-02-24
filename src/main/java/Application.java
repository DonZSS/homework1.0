import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik("Борис", "Мяу", 5, 10);
        Kotik kotik2 = new Kotik();

        kotik2.setName("Мурка");
        kotik2.setVoice("Мммяяяууу");
        kotik2.setSatiety(2);
        kotik2.setWeight(8);

        String[] liveArray = kotik1.liveAnotherDay();
        for (String e : liveArray) {
            System.out.println(e);
        }

        System.out.println(kotik1.getName() + " - " + kotik1.getWeight() + " кг");
        System.out.print(kotik1.getName() + " и " + kotik2.getName() + "мяукают одинаково? - ");
        System.out.println(compareVoice(kotik1, kotik2));
        System.out.println("Создали " + Kotik.getCount() + " экземляра класса Kotik");

    }

    public static boolean compareVoice(Kotik kot1, Kotik kot2) {
        return kot1 != null && kot2 != null && kot1.getVoice().equalsIgnoreCase(kot2.getVoice());
    }

}
