package Objects;

import enums.Controler;

public class LastStage extends Rocket {

    private String name;

    public String getName() {
        return this.name;
    }

    public LastStage(String name) {
        this.name = name;
    }

    @Override
    void place() {

    }

    @Override
    void constructed() {

    }

    public String harder() {
        System.out.print(" это бы утяжелило " + getName());
        return null;
    }

    public void contain() {
        System.out.println(getName() + " имеет " + Controler.MULTI.getName() + ": " + Controler.HEAVYNESS.getName() + " и " + Controler.WEIGHTLESSNESS.getName());
    }

}
