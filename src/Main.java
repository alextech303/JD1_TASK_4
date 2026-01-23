import static config.ConfigLogger.LOGGER;

import config.ConfigLogger;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class Main {


  public static void main(String[] arg) {
    ConfigLogger.configureLogger();
    final int N = 3;
    Car[] carTrack = new Car[N];
    carTrack[0] = new
        Track("SuperTrack", 1234, LocalDateTime.now().withYear(2020), Mark.TESLA, true,0);
    carTrack[1] = new
        Track("SuperTrack2", 4321, LocalDateTime.now().withYear(2022), Mark.TESLA, true,0);
    carTrack[2] = new
        Track("SuperTrack3", 1111, LocalDateTime.now().withYear(2024), Mark.TESLA, true,0);

    System.out.println("характеристики модели Track:");

    System.out.println(Mark.TESLA);

    carTrack[0].move();

    Car[] carMersedes = new Mersedes[N];

    carMersedes[0] = new
        Mersedes("Benz1", 1234, LocalDateTime.now().withYear(2020), Mark.MERCRDES, true,0);
    carMersedes[1] = new
        Mersedes("Benz2", 4321, LocalDateTime.now().withYear(2022), Mark.MERCRDES, true,0);
    carMersedes[2] = new
        Mersedes("Benz3", 1111, LocalDateTime.now().withYear(2024), Mark.MERCRDES, true,0);

    carMersedes[0].move();

    System.out.println("Общие характеристики моделей:");
    for (Mark m : Mark.values()) {
      System.out.println(m + " = " + m.ordinal());
    }

    Mersedes mersedes = new Mersedes("Benz4", 1111, LocalDateTime.now().withYear(2024),
        Mark.MERCRDES, true,0);
    mersedes.acceleration();

    Lada[] carLada = new Lada[N];

    carLada[0] = new
        Lada("Granta1", 1111, LocalDateTime.now().withYear(2020), Mark.LADA, true, 1,"green");
    carLada[1] = new
        Lada("Granta2", 2222, LocalDateTime.now().withYear(2020), Mark.LADA, true,1, "white");
    carLada[2] = new
        Lada("Granta3", 333, LocalDateTime.now().withYear(2020), Mark.LADA, true,1, "red");
    carLada[0].move();

    for (Lada lada : carLada) {
       ConfigLogger.LOGGER.severe("Цикл foreech для Lada");
      lada.fly();
    }
    carLada[0].stop();
    System.out.println(carLada[0]);
  }


}

