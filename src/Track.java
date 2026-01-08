import java.time.LocalDateTime;

public class Track extends Car implements Moovable{


  public Track(String name, int number, LocalDateTime yearOfBuild, Mark mark, boolean state) {
    super(name, number, yearOfBuild, mark, state);
  }

  @Override
  public void move() {
    System.out.println("Track moving");
  }
}
