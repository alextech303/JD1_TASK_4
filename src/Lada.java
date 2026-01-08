import java.time.LocalDateTime;

public class Lada extends Car implements Moovable{

  public Lada(String name, int number, LocalDateTime yearOfBuild, Mark mark,
      boolean state) {
    super(name, number, yearOfBuild, mark, state);
  }

  @Override
  public void move() {
    System.out.println("Lada mooving");
  }
}
