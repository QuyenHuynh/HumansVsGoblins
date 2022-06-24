import java.util.ArrayList;

public class Armor {

    String name;

    int defence;

    double dropRate;

    int cost;

    ArrayList<Armor> armorsList = new ArrayList<>();

    //default constructor
    public Armor(){}

    public Armor(String name, int defence, double dropRate, int cost, ArrayList<Armor> armorsList) {
        this.name = name;
        this.defence = defence;
        this.dropRate = dropRate;
        this.cost = cost;
        this.armorsList = armorsList;
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
