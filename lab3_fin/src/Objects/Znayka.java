package Objects;

public class Znayka extends Human {

    private String name;

    public String getName() {
        return name;
    }

    public Znayka(String name) {
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
    public void propose() {
        System.out.print(getName() + " предположил ");
    }

    public void hope() {
        System.out.print(getName() + " надеялся");
    }


}
