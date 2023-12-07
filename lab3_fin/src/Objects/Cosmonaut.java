package Objects;

import Interfaces.Property;

public class Cosmonaut extends Human implements Property {


    private String name;

    public String getName() {
        return this.name;
    }

    public Cosmonaut(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void think() {
        System.out.print(getName() + "задумался");
    }

    @Override
    void create() {
        System.out.print(getName() + "сделал");
    }

    void start() {
        System.out.print(getName() + " Приступил к работе");
    }

    @Override
    void propose() {

    }

    @Override
    public void property(String o) {
        this.name = o + " " + this.name;

    }

    @Override
    public String toString() {
        return name;
    }
}
