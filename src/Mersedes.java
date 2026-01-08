import java.time.LocalDateTime;

public class Mersedes extends Car implements Moovable{

  public Mersedes(String name, int number, LocalDateTime yearOfBuild, Mark mark,
      boolean state) {
    super(name, number, yearOfBuild, mark, state);
  }

  @Override
  public void move() {
    System.out.println("Mersedes mooving");
  }

  public void acceleration(){
    System.out.println("Mersedes acceleration!!! ");
  }
}
