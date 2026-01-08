import java.time.LocalDateTime;

public class Lada extends Car implements Moovable{

  private String color;

  public Lada(String name, int number, LocalDateTime yearOfBuild, Mark mark,
      boolean state,String color) {
    super(name, number, yearOfBuild, mark, state);
    this.color=color;
  }

  @Override
  public void move() {
    System.out.println("Lada mooving");
  }

  public void stop (){
    System.out.println("Lada stop");
  }

  public void fly(){
    System.out.println("Lada flying!!!");
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Car");
    sb.append("{name='" + getName());
    sb.append(", number=" + getNumber());
    sb.append(", yearOfBuild=" + getYearOfBuild().format(formatter));
    sb.append(", mark=" + getMark());
    sb.append(", state=" + isState());
    sb.append(", color=" +color + '}');

    return sb.toString();

  }

}
