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

    @Override
    void think() {

    }

    @Override
    void create() {

    }

    void start() {
        System.out.print(getName() + " Приступил к работе");
    }
}
