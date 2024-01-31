import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {
        // Calendar calendar = Calendar.getInstance();
        // System.out.println(calendar.getTime());
        // System.out.println(calendar.getTimeInMillis());

        // System.out.println("-------------------");
        // System.out.println(System.currentTimeMillis());
        // System.out.println("-------------------");

        // calendar.set(Calendar.SECOND, 0);
        // calendar.set(Calendar.MINUTE, 0);
        // calendar.set(Calendar.HOUR_OF_DAY, 0);
        // calendar.set(Calendar.MILLISECOND, 0);
        // System.out.println(calendar.getTime());
        // System.out.println(calendar.getTimeInMillis());

        String[] weekDays = {
            "周日", "周一", "周二", "周三", "周四", "周五", "周六"
        };

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        try {
            Date date = formatter.parse("20221206");
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            System.out.println(dayOfWeek - 1);
            System.out.println(weekDays[dayOfWeek - 1]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}