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
        LastStage lastStage = new LastStage("Последняя ступень");
        SpaceObject moon = new SpaceObject("Луна");
        SpaceObject earth = new SpaceObject("Земля");

        Thing moonrock = new Thing("лунный камень");
        Thing stockpile = new Thing("Запасы");


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
        cosmonauts.setQuantity();
        starShip.calculate(cosmonauts);
        System.out.print(".\n");

        //Fourth
        starShip.calculate(cosmonauts);
        lastStage.harder();
        System.out.print(", ");
        moonrock.needPlace();
        System.out.print(", ");
        stockpile.delivery(moon, earth);
        System.out.print(".\n");

        //Sixth
        znayka.propose();
        lastStage.contain();


        //Seventh
        znayka.hope();
        System.out.print(", что ");
        moon.coming();
        all.find(moonrock);

        //Eiththrr
        all.having(moonrock);
        all.produce();
        System.out.print(",  который ");
        all.helpfind();
    }
}
