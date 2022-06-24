
public class Goblin {

    int health = 20;
    int strength = 5;
    int defence = 1;

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

    public void attack(Human human) {
        int hp = human.getHealth();
        int str = strength;
        int newHp = hp - str;
        human.setHealth(newHp);

        if (human.getHealth() <= 0 ) {
            human.setDead(true);
        }
    }

    //TODO Make goblins drop gold, items, and exp
}
