package Objects;

import Interfaces.Calculated;
import Interfaces.HavePlace;

public class StarShip extends Rocket implements Calculated, HavePlace {
    public Object place;
    private String name;

    public String getName() {
        return this.name;
    }

    public StarShip(String name) {
        this.name = name;
    }


    @Override
    void place() {
        System.out.print("был рассчитан на " + getName());
    }

    @Override
    void constructed() {
        System.out.print(getName() + " был спроектирован ");
    }

    public String cosmanauts(String name) {
        this.name = name;
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void placement(Cosmonaut cos) {
        System.out.print("В " + getName() + "вмещается" + cos);
    }

    @Override
    public void calculate(StarShip star) {
        System.out.print(star + "был рассчитан ");
    }

    @Override
    public void calculate(Cosmonaut cos) {
        System.out.print(getName() + " был рассчитан на " + cos);
    }

    @Override
    public void calculate(Human human) {
        System.out.print("Рассчитать " + getName() + " на большее " + human + " было нельзя");
    }


}
