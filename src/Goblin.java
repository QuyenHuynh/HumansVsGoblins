
public class Goblin {

    int health;
    int strength;
    int defence;
    boolean dead;
    int positionX;
    int positionY;

    //default constructor
    public Goblin(){
        this.health = 20;
        this.strength = 8;
        this.defence = 1;
    }

    public Goblin(int health, int strength, int defence, boolean dead, int positionX, int positionY) {
        this.health = health;
        this.strength = strength;
        this.defence = defence;
        this.dead = dead;
        this.positionX = positionX;
        this.positionY = positionY;
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

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
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
