import config.ConfigLogger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.logging.Logger;

public abstract class Car {


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  private double price;
  private String name;
  private int number;
  private LocalDateTime yearOfBuild;
  private Mark mark;
  private boolean state;
  public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");

  public Car(String name, int number, LocalDateTime yearOfBuild, Mark mark, boolean state,double price) {
    this.name = name;
    this.number = number;
    this.yearOfBuild = yearOfBuild;
    this.mark = mark;
    this.state = state;
    this.price=price;
  }

  public abstract void move();

  public static void stopMove() {
  ConfigLogger.LOGGER.info("stopMove");

  }



  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public LocalDateTime getYearOfBuild() {
    return LocalDateTime.parse(yearOfBuild.format(formatter));
  }

  public void setYearOfBuild(LocalDateTime yearOfBuild) {
    this.yearOfBuild = yearOfBuild;
  }

  public Mark getMark() {
    return mark;
  }

  public void setMark(Mark mark) {
    this.mark = mark;
  }

  public boolean isState() {
    return state;
  }

  public void setState(boolean state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return number == car.number && state == car.state && Objects.equals(name, car.name)
        && Objects.equals(yearOfBuild, car.yearOfBuild) && mark == car.mark;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, number, yearOfBuild, mark, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Car");
    sb.append("{name='" + name);
    sb.append(", number=" + number);
    sb.append(", yearOfBuild=" + yearOfBuild.format(formatter));
    sb.append(", mark=" + mark);
    sb.append(", state=" + state + '}');
    return sb.toString();

  }
}
