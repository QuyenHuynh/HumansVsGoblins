public class Human {

    String name;
    int health;
    int strength;
    int defence;
    boolean dead;
    int positionX;
    int positionY;

    //default constructor
    public Human(){
        this.health = 100;
        this.strength = 10;
        this.defence = 2;
    }

    public Human(String name, int health, int strength, int defence, boolean dead, int positionX, int positionY) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defence = defence;
        this.dead = dead;
        this.positionX = positionX;
        this.positionY = positionY;
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

    public void attack(Goblin goblin) {
        int hp = goblin.getHealth();
        int str = strength;
        int newHp = hp - str;
        goblin.setHealth(newHp);

        if (goblin.getHealth() <= 0 ) {
            goblin.setDead(true);
        }
    }

    //TODO Allow humans to level up, equip weapons, armor, and shop via merchants
    //TODO Add an inventory and possibly potions/rest spots
    //TODO Create status ailments

}
