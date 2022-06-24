
public class Goblin {

    int health;
    int strength;
    int defence;

    boolean dead;

    //default constructor
    public Goblin(){}

    public Goblin(int health, int strength, int defence, boolean dead) {
        this.health = health;
        this.strength = strength;
        this.defence = defence;
        this.dead = dead;
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

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public Human attack(Human human) {
        int hp = human.getHealth();
        int str = strength;
        int newHp = hp - str;
        human.setHealth(newHp);
        return human;
    }

    //TODO Make goblins drop gold, items, and exp
}
