package Objects;

public class Thing {

    private String name;

    public String getName() {
        return name;
    }

    public Thing(String name) {
        this.name = name;
    }

    public String needPlace() {
        System.out.print(" должно остаться место для " + getName());
        return null;
    }

    public String delivery(SpaceObject from, SpaceObject to) {
        System.out.print(getName() + " доставить с " + from + " на " + to);
        return null;
    }

    @Override
    public String toString() {
        return name;
    }
}
