package Objects;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cosmonaut extends Human {

    Scanner scanner = new Scanner(System.in);
    int quantity = scanner.nextInt();
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
    public String toString() {
        return name;
    }

    public void setQuantity(){
        this.name = quantity + " " + this.name;
    }
}
