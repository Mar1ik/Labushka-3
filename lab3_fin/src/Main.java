import Objects.*;
public class Main {
    public static void main(String[] args) {
        Znayka znayka = new Znayka("Знайка");
        StarShip starShip = new StarShip("Космический корабль");
        Cosmonaut cosmonauts = new Cosmonaut("Космонавт");
        Fuxia fuxia = new Fuxia("Фуксия");
        Zvezdochet zvezdochet = new Zvezdochet("Звездочет");
        Herring herring = new Herring("Селедочка");
        All all = new All("Все");

        //First
        all.calculate(starShip);
        System.out.print(".\n");

        //Second
        all.sleep();
        System.out.print(". ");
        starShip.calculate(starShip);
        System.out.print(".\n");

        //Third
        zvezdochet.think();
        System.out.print(": ");
        cosmonauts.Property("двеннадцать");
        starShip.calculateWithPeople(cosmonauts);



    }
}
