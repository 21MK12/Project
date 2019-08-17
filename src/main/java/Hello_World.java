import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

public class Hello_World extends Thread {


//    HOUR=8,HOUR_OF_DAY=8,MINUTE=59,SECOND=47

//    Good morning, World! в 06:00 - 09:00

//    Good day, World! в 09:00 - 19:00

//    Good evening, World! в 19:00 - 23:00

//    Good night, World! в 23:00 - 06:00


    @Override
    public void run() {

    }

    public void print_current_Date_and_Time() {
        DateFormat dateFormat = new SimpleDateFormat(" HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));
    }

    public void print_massage() {

        DateFormat dateFormat1 = new SimpleDateFormat("HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        System.out.println(dateFormat1.format(calendar.getTime()));

        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);

            String morning = property.getProperty("hw.morning");
            String day = property.getProperty("hw.day");
            String evening = property.getProperty("hw.evening");
            String night = property.getProperty("hw.night");

            switch (calendar.get(Calendar.HOUR)) {

                case 0:
                    System.out.println(night);
                    break;
                case 1:
                    System.out.println(night);
                    break;
                case 2:
                    System.out.println(night);
                    break;
                case 3:
                    System.out.println(night);
                    break;
                case 4:
                    System.out.println(night);
                    break;
                case 5:
                    System.out.println(night);
                    break;
                case 6:
                    System.out.println(morning);
                    break;
                case 7:
                    System.out.println(morning);
                    break;
                case 8:
                    System.out.println(morning);
                    break;
                case 9:
                    System.out.println(day);
                    break;
                case 10:
                    System.out.println(day);
                    break;
                case 11:
                    System.out.println(day);
                    break;
                case 12:
                    System.out.println(day);
                    break;
                case 13:
                    System.out.println(day);
                    break;
                case 14:
                    System.out.println(day);
                    break;
                case 15:
                    System.out.println(day);
                    break;
                case 16:
                    System.out.println(day);
                    break;
                case 17:
                    System.out.println(day);
                    break;
                case 18:
                    System.out.println(day);
                    break;
                case 19:
                    System.out.println(evening);
                    break;
                case 20:
                    System.out.println(evening);
                    break;
                case 21:
                    System.out.println(evening);
                    break;
                case 22:
                    System.out.println(evening);
                    break;
                case 23:
                    System.out.println(night);
                    break;
            }
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }
}
