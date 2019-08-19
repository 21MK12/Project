import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestHelloWorld {
    @Before
    public void setup(){
        DateFormat dateFormat1 = new SimpleDateFormat("HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        FileInputStream fis;
        try {
            fis = new FileInputStream("src/main/resources/config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testHello() throws Exception {
        Hello_World hw = new Hello_World();
        hw.print_current_Time();
        hw.print_massage();
    }
    @Test
    public void print_current_Time() {

    }

    @Test
    public void print_massage() {
    }
}
