import java.time.LocalDateTime;

public class Mersedes extends Car implements Moovable{

  public Mersedes(String name, int number, LocalDateTime yearOfBuild, Mark mark,
      boolean state,double price) {
    super(name, number, yearOfBuild, mark, state,price);
  }

  @Override
  public void move() {
    System.out.println("Mersedes mooving");
  }

  public void acceleration(){
    System.out.println("Mersedes acceleration!!! ");
  }
}
