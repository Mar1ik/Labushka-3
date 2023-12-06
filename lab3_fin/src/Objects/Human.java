package Objects;

public abstract class Human {
   String name;

   abstract void think();

   abstract void create();

   abstract void start();

   public Human(String name) {
      this.name = name;
   }
}
