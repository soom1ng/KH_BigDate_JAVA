package Static_method;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
    final static String DOMAIN = "192.168.0.1";
}