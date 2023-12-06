package Objects;

public class Herring extends Human {

    public String getName(){
        return this.name;
    }
    public Herring(String name) {
        super(name);
        this.name = name;
    }

    public void think() {
        System.out.print (getName() + " задумалась ");

    }

    public void create() {
        System.out.print(getName() + " сделала ");
    }


    public void start() {
        System.out.print(getName() + " Приступила к работе ");
    }
}
