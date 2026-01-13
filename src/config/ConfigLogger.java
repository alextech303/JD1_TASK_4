package config;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ConfigLogger {

  public static final Logger LOGGER  = Logger.getLogger(ConfigLogger.class.getName());


  public static void configureLogger() {
//получаем корневой логер
    Logger rootLogger = Logger.getLogger("");
// удаляем все стандартные оброботчики
    Handler[] handlers = rootLogger.getHandlers();
    for (Handler handler : handlers) {
      rootLogger.removeHandler(handler);
    }
    //Создаем файлхэндлер для записи в файл
    try {
      FileHandler fileHandler = new FileHandler("app.log",1024*1024,3,true);


    fileHandler.setFormatter(new SimpleFormatter());
    fileHandler.setLevel(Level.ALL);
//добавляем оброботчики к корневому логеру
    rootLogger.addHandler(fileHandler);
    // устанавливаем уровень логирования для корневого логгера
    rootLogger.setLevel(Level.ALL);
    LOGGER.setLevel(Level.ALL);

    } catch (IOException e) {
      System.err.println("Ошибка при настройке логера: "+e.getMessage());
    }
  }

}
