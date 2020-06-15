public class Ben extends Personage implements Run,Swimming{
    public Ben(String name, String weapons, int age) {
        super(name, weapons, age);
    }

    @Override
    public void speak() {
        System.out.println("Говорит на Deutsche");
    }

    @Override
    public void fight() {
        System.out.println("Приемы  Karate");
    }

    @Override
    public void run() {
        System.out.println("Способность Ich renne");
    }

    @Override
    public void swimming() {
        System.out.println("Способность Schwimmen");
    }
}
