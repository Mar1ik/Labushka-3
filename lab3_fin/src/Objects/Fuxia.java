package Objects;

public class Fuxia extends Human {

    private String name;

    public String getName() {
        return this.name;
    }

    public Fuxia(String name) {
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
}
