package Objects;

public class Zvezdochet extends Human {


    private String name;

    public String getName() {
        return this.name;
    }

    public Zvezdochet(String name) {
        super(name);
        this.name = name;
    }

    public void think() {
        System.out.print(getName() + " подумал ");
    }

    void create() {

    }

    public void start() {
        System.out.print(getName() + " Приступил к работе");
    }

    @Override
    void propose() {

    }
}
