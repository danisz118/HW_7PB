public class Bob extends Personage implements Jump,Swimming {
    public Bob(String name, String weapons, int age) {
        super(name, weapons, age);
    }

    @Override
    public void speak() {
        System.out.println("Говорит на English");
    }

    @Override
    public void fight() {
        System.out.println("Приемы Taekwondo");

    }

    @Override
    public void jump() {
        System.out.println("Способность Bob is jumping");
    }

    @Override
    public void swimming() {
        System.out.println("Способность Bob swims");
    }
}
