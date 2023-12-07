package Objects;

import enums.Controler;

import java.util.Objects;

public abstract class Human {
    private String name;

    abstract void think();

    abstract void create();

    abstract void start();

    abstract void propose();

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void find(Thing thing) {
        System.out.println(getName() + " надеялись найти " + thing);
    }

    public void having(Thing thing) {
        System.out.print("Обладая  " + thing);
    }

    public void produce() {
        System.out.print(" нетрудно соорудить " + Controler.GRAVITYAPP.getName());
    }

    public void helpfind() {
        System.out.print(" поможет найти Незнайку и Пончика");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
