package Objects;

public class Znayka extends Human{

    private String name;

    String getName(){
        return this.name;
    }
    public Znayka(String name){
        super(name);
        this.name = name;
    }

    public void think() {
        System.out.print (getName() + " задумался ");

    }

    public void create() {
        System.out.print(getName() + " сделал ");
    }


    public void start() {
        System.out.print(getName() + " Приступил к работе");
    }
}
