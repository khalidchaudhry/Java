import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon="Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> toReturn=new ArrayList<>();

        toReturn.add(0,this.name);
        toReturn.add(1,""+this.hitPoints);
        toReturn.add(2,"" + strength);
        toReturn.add(3,weapon);
        return toReturn;
    }

    @Override
    public void read(List<String> lst) {
        if(lst==null || lst.size()==0)
        {
            return;
        }
        this.name=lst.get(0);
        this.hitPoints=Integer.parseInt(lst.get(1));
        this.strength=Integer.parseInt(lst.get(2));
        this.weapon=lst.get(3);
    }
}
