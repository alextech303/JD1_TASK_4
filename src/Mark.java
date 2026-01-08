import java.time.LocalDateTime;
import java.util.Calendar;

public enum Mark {

  MERCRDES("AMG","Germany",LocalDateTime.now().withYear(1988)),TESLA("Y","USA",LocalDateTime.now().withYear(1999)),LADA("Granda","Russia",LocalDateTime.now());
private String model;
private String country;
private LocalDateTime yearOfProduce;

  Mark(String model, String country, LocalDateTime yearOfProduce) {
    this.model = model;
    this.country = country;
    this.yearOfProduce = yearOfProduce;
  }

  @Override
  public String toString() {
    return "Mark{" +
        "model='" + model + '\'' +
        ", country='" + country + '\'' +
        ", yearOfProduce=" + yearOfProduce.format(Car.formatter) +
        '}';
  }
}
