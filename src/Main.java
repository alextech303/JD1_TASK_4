import java.time.LocalDateTime;

public class Main {


  public static void main(String[] arg) {

    final int N = 3;
    Car[] carTrack = new Car[N];
    carTrack[0] = new
        Track("SuperTrack", 1234, LocalDateTime.now().withYear(2020), Mark.TESLA, true);
    carTrack[1] = new
        Track("SuperTrack2", 4321, LocalDateTime.now().withYear(2022), Mark.TESLA, true);
    carTrack[2] = new
        Track("SuperTrack3", 1111, LocalDateTime.now().withYear(2024), Mark.TESLA, true);

    System.out.println("характеристики модели Track:");

    System.out.println(Mark.TESLA);

    carTrack[0].move();

    Car[] carMersedes = new Mersedes[N];

    carMersedes[0] = new
        Mersedes("Benz1", 1234, LocalDateTime.now().withYear(2020), Mark.MERCRDES, true);
    carMersedes[1] = new
        Mersedes("Benz2", 4321, LocalDateTime.now().withYear(2022), Mark.MERCRDES, true);
    carMersedes[2] = new
        Mersedes("Benz3", 1111, LocalDateTime.now().withYear(2024), Mark.MERCRDES, true);

    carMersedes[0].move();


    System.out.println("Общие характеристики моделей:");
    for (Mark m : Mark.values()) {
      System.out.println(m + " = " + m.ordinal());
    }

    Mersedes mersedes = new Mersedes("Benz4", 1111, LocalDateTime.now().withYear(2024),
        Mark.MERCRDES, true);
    mersedes.acceleration();

    Lada[] carLada = new Lada [N];

    carLada[0] = new
        Lada("Granta1", 1111, LocalDateTime.now().withYear(2020), Mark.LADA, true, "green");
    carLada[1] = new
        Lada("Granta2", 2222, LocalDateTime.now().withYear(2020), Mark.LADA, true, "white");
    carLada[2] = new
        Lada("Granta3", 333, LocalDateTime.now().withYear(2020), Mark.LADA, true, "red");
    carLada[0].move();

for(Lada lada : carLada){
  lada.fly();
}
    }


}

