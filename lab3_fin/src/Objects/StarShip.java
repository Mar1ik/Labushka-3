package Objects;

import Interfaces.Calculated;
import Interfaces.HavePlace;

public class StarShip extends Rocket implements Calculated, HavePlace {
    public Object place;
    private String name;

    public String getName(){
        return this.name;
    }

    public StarShip(String name){
        this.name = name;
    }

    @Override
    public void calculate() {
        System.out.print(getName() + "был рассчитан");
    }

    @Override
    void place() {
        System.out.print("был рассчитан на " + getName());
    }

    public String cosmanauts(String name){
        this.name = name;
        return name;
    }

    @Override
    public String toString() {
        return "StarShip{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void Placement(Cosmonaut cos) {
        System.out.print("В " + getName() + "вмещается" + cos);
    }
}
