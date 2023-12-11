package Objects;

import Interfaces.ApplyableToHuman;
import Interfaces.Calculated;
import enums.Controler;

public class All extends Human implements Calculated, ApplyableToHuman {
    private String name;

    public String getName() {
        return this.name;
    }

    public All(String name) {
        super(name);
        this.name = name;
    }

    public void think() {
        System.out.print(getName() + " задумался ");

    }

    public void create() {
        System.out.print(getName() + " сделал ");
    }


    public void start() {
        System.out.print(getName() + " Приступил к работе");
    }

    @Override
    void propose() {

    }

    @Override
    public void sleep() {
        System.out.print(getName() + " не спали ");
    }

    @Override
    public void calculate(StarShip star) {
        System.out.print(getName() + " проектировали " + star);
    }

    @Override
    public void calculate(Cosmonaut cos) {

    }

    @Override
    public void calculate(Human human) {

    }


}
