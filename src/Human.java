import java.util.Scanner;

public class Human {

    String name;
    int health;
    int strength;
    int defence;
    boolean dead;
    int positionX;
    int positionY;

    //TODO Adjust methods to include weapon and armor strengths
    Armor armor;
    Weapon weapon;
    Inventory inventory;

    boolean weaponEquipped;
    boolean armorEquipped;

    //default constructor
    public Human(){
        this.health = 100;
        this.strength = 10;
        this.defence = 2;
    }

    public Human(String name, int health, int strength, int defence, boolean dead, int positionX, int positionY, Armor armor, Weapon weapon, Inventory inventory, boolean weaponEquipped, boolean armorEquipped) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defence = defence;
        this.dead = dead;
        this.positionX = positionX;
        this.positionY = positionY;
        this.armor = armor;
        this.weapon = weapon;
        this.inventory = inventory;
        this.weaponEquipped = weaponEquipped;
        this.armorEquipped = armorEquipped;
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

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public boolean isWeaponEquipped() {
        return weaponEquipped;
    }

    public void setWeaponEquipped(boolean weaponEquipped) {
        this.weaponEquipped = weaponEquipped;
    }

    public boolean isArmorEquipped() {
        return armorEquipped;
    }

    public void setArmorEquipped(boolean armorEquipped) {
        this.armorEquipped = armorEquipped;
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

    public void printStats(Human human) {
        System.out.println("==========================================");
        System.out.println("                  STATUS                  ");
        System.out.println("==========================================");
        System.out.println("Name: " + human.getName());
        System.out.println("Health: " + human.getHealth());
        System.out.println("Strength: " + human.getStrength());
        System.out.println("Defence: " + human.getDefence());
        System.out.println("Weapon: " + human.getWeapon());
        System.out.println("Armor: " + human.getArmor());
        System.out.println("==========================================");
    }

    //TODO Allow humans to level up, equip weapons, armor, and shop via merchants
    //TODO Add an inventory and possibly potions/rest spots
    //TODO Create status ailments

}
