package Objects;

import java.sql.SQLOutput;

public class SpaceObject {

    private String name;

    public String getName() {
        return this.name;
    }

    public SpaceObject(String name) {
        this.name = name;
    }

    public String delivery(SpaceObject object1, SpaceObject object2) {
        System.out.print(" доставить с " + object1 + " на " + object2);
        return null;
    }

    @Override
    public String toString() {
        return name;
    }

    public void coming() {
        System.out.print("прибыв на " + getName() + " ");
    }
}
