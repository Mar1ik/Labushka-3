package enums;

public enum Controler {
    WEIGHTLESSNESS("Управление в условии невесомости"),
    HEAVYNESS("Управление в условии тяжести"),

    MULTI("Двоякое управление"),

    GRAVITYAPP("Прибор невесомости");
    private final String name;

    private Controler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
