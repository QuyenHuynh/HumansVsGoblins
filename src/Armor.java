import java.util.ArrayList;

public class Armor {

    String name;

    int defence;

    double dropRate;

    int cost;

    static ArrayList<Armor> armorsList = new ArrayList<>();

    //default constructor
    public Armor(){}

    public Armor(String name, int defence, double dropRate, int cost) {
        this.name = name;
        this.defence = defence;
        this.dropRate = dropRate;
        this.cost = cost;
    }

    //TODO Convert armors into an interface with helmet, chest, and leggings as classes
    public void createArmor() {
        Armor woodenArmor = new Armor("Wooden Armor", 3, .25, 1);
        Armor bronzeArmor = new Armor("Bronze Armor", 7, .15, 5);
        Armor ironArmor = new Armor("Iron Armor", 14, .05, 20);
        Armor steelArmor = new Armor("Steel Armor", 20, .03, 35);
        Armor mithrilArmor = new Armor("Mithril Armor", 35, .02, 55);
        Armor adamantArmor = new Armor("Adamant Armor", 40, .01, 80);

        armorsList.add(woodenArmor);
        armorsList.add(bronzeArmor);
        armorsList.add(ironArmor);
        armorsList.add(steelArmor);
        armorsList.add(mithrilArmor);
        armorsList.add(adamantArmor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
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

    public ArrayList<Armor> getArmorsList() {
        return armorsList;
    }

    public void setArmorsList(ArrayList<Armor> armorsList) {
        this.armorsList = armorsList;
    }
}
