import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

public class Hello_World {

    static Logger logger = Logger.getLogger(Hello_World.class);
//    HOUR=8,HOUR_OF_DAY=8,MINUTE=59,SECOND=47

//    Good morning, World! в 06:00 - 09:00

//    Good day, World! в 09:00 - 19:00

//    Good evening, World! в 19:00 - 23:00

//    Good night, World! в 23:00 - 06:00


    public void print_current_Time() {
        logger.info("Начало работы метода вывода текущей даты и времени.");
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
    }

    public void print_massage() {

        logger.info("Начало работы метода вывода сообщения в консоль.");
        DateFormat dateFormat1 = new SimpleDateFormat("HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        System.out.println(dateFormat1.format(calendar.getTime()));

        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            logger.info("Подключение к файлу конфигурации ");
            property.load(fis);

            String morning = property.getProperty("hw.morning");
            String day = property.getProperty("hw.day");
            String evening = property.getProperty("hw.evening");
            String night = property.getProperty("hw.night");

            switch (calendar.get(Calendar.HOUR_OF_DAY)) {

                case 6:
                    System.out.println(morning);
                    logger.info("Вывод на консоль: Good morning, World!");
                    break;
                case 7:
                    System.out.println(morning);
                    logger.info("Вывод на консоль: Good morning, World!");
                    break;
                case 8:
                    System.out.println(morning);
                    logger.info("Вывод на консоль: Good morning, World!");
                    break;
                case 9:
                    System.out.println(day);
                    logger.info("Вывод на консоль: Good day, World!");
                    break;
                case 10:
                    System.out.println(day);
                    logger.info("Вывод на консоль: Good day, World!");
                    break;
                case 11:
                    System.out.println(day);
                    logger.info("Вывод на консоль: Good day, World!");
                    break;
                case 12:
                    System.out.println(day);
                    logger.info("Вывод на консоль: Good day, World!");
                    break;
                case 13:
                    System.out.println(day);
                    logger.info("Вывод на консоль: Good day, World!");
                    break;
                case 14:
                    System.out.println(day);
                    logger.info("Вывод на консоль: Good day, World!");
                    break;
                case 15:
                    System.out.println(day);
                    logger.info("Вывод на консоль: Good day, World!");
                    break;
                case 16:
                    System.out.println(day);
                    logger.info("Вывод на консоль: Good day, World!");
                    break;
                case 17:
                    System.out.println(day);
                    logger.info("Вывод на консоль: Good day, World!");
                    break;
                case 18:
                    System.out.println(day);
                    logger.info("Вывод на консоль: Good day, World!");
                    break;
                case 19:
                    System.out.println(evening);
                    logger.info("Вывод на консоль: Good evening, World!");
                    break;
                case 20:
                    System.out.println(evening);
                    logger.info("Вывод на консоль: Good evening, World!");
                    break;
                case 21:
                    System.out.println(evening);
                    logger.info("Вывод на консоль: Good evening, World!");
                    break;
                case 22:
                    System.out.println(evening);
                    logger.info("Вывод на консоль: Good evening, World!");
                    break;
                case 23:
                    System.out.println(night);
                    logger.info("Вывод на консоль: Good night, World!");
                    break;
                case 0:
                    System.out.println(night);
                    logger.info("Вывод на консоль: Good night, World!");
                    break;
                case 1:
                    System.out.println(night);
                    logger.info("Вывод на консоль: Good night, World!");
                    break;
                case 2:
                    System.out.println(night);
                    logger.info("Вывод на консоль: Good night, World!");
                    break;
                case 3:
                    System.out.println(night);
                    logger.info("Вывод на консоль: Good night, World!");
                    break;
                case 4:
                    System.out.println(night);
                    logger.info("Вывод на консоль: Good night, World!");
                    break;
                case 5:
                    System.out.println(night);
                    logger.info("Вывод на консоль: Good night, World!");
                    break;
            }
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }
}
