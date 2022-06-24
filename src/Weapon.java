import java.util.ArrayList;

public class Weapon {

    String name;

    int strength;

    double dropRate;

    int cost;

    //TODO implement weapons other than swords
    int attackRange;

    static ArrayList<Weapon> weaponsList = new ArrayList<>();

    public Weapon(String name, int strength, double dropRate, int cost) {
        this.name = name;
        this.strength = strength;
        this.dropRate = dropRate;
        this.cost = cost;
    }

    //TODO Convert weapons into an interface with Swords, Bows, Axes, Spears, etc. as classes
    public void createWeapons() {
        Weapon woodenSword = new Weapon("Wooden Sword", 3, .25, 1);
        Weapon bronzeSword = new Weapon("Bronze Sword", 7, .15, 5);
        Weapon ironSword = new Weapon("Iron Sword", 14, .05, 20);
        Weapon steelSword = new Weapon("Steel Sword", 20, .03, 35);
        Weapon mithrilSword = new Weapon("Mithril Sword", 35, .02, 55);
        Weapon adamantSword = new Weapon("Adamant Sword", 40, .01, 80);

        weaponsList.add(woodenSword);
        weaponsList.add(bronzeSword);
        weaponsList.add(ironSword);
        weaponsList.add(steelSword);
        weaponsList.add(mithrilSword);
        weaponsList.add(adamantSword);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public double getDropRate() {
        return dropRate;
    }

    public void setDropRate(double dropRate) {
        this.dropRate = dropRate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public ArrayList<Weapon> getWeaponsList() {
        return weaponsList;
    }

    public void setWeaponsList(ArrayList<Weapon> weaponsList) {
        this.weaponsList = weaponsList;
    }
}
