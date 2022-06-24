public class Human {

    String name;
    int health;
    int strength;

    boolean dead;

    //default constructor
    public Human(){}

    public Human(String name, int health, int strength, boolean dead) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.dead = dead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public Goblin attack(Goblin goblin) {
        int hp = goblin.getHealth();
        int str = strength;
        int newHp = hp - str;
        goblin.setHealth(newHp);
        return goblin;
    }

}
