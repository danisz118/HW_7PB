public class Main {
    public static void main(String[] args) {
        Ben ben = new Ben("Ben", "Granatenwerfer", 18);
        Bob bob = new Bob("Bob", "Kalaschnikow", 21);
        System.out.println("Имя персонажа " + ben.getName() + " используемое оружие " + ben.getWeapons()
                + " возраст бойца " + ben.getAge());
        ben.speak();
        ben.fight();
        ben.swimming();
        System.out.println("Имя персонажа " + bob.getName() + " используемое оружие " + bob.getWeapons()
                + " возраст бойца " + bob.getAge());
        bob.speak();
        bob.fight();
        bob.jump();

    }
}
