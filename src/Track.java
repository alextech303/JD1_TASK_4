import java.time.LocalDateTime;

public class Track extends Car implements Moovable{


  public Track(String name, int number, LocalDateTime yearOfBuild, Mark mark, boolean state, double price) {
    super(name, number, yearOfBuild, mark, state,price);
  }

  @Override
  public void move() {
    System.out.println("Track moving");
  }
}
