public abstract class Personage {
    private String name;
    private String weapons;
    private int age;

    public Personage(String name, String weapons, int age) {
        this.name = name;
        this.weapons = weapons;
        this.age = age;
    }

    public abstract void speak();

    public abstract void fight();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
