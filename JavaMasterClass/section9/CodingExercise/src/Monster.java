import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
    @Override
    public List<String> write() {
        ArrayList<String> toReturn=new ArrayList<>();

        toReturn.add(0,this.name);
        toReturn.add(1,""+this.hitPoints);
        toReturn.add(2,"" + this.strength);
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
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }


}
