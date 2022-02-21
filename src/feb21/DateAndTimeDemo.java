package feb21;

import java.time.*;

/**
 * Drawback of old date time Api
 * 1 .Does not have setter method and are not thread safe
 * 2. Few Date operation
 *   To overcome this the new date and time api introduce in java 8
 */
public class DateAndTimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj);
        Month month = obj.getMonth();
        System.out.println(month);
        int day = obj.getDayOfMonth();
        System.out.println(day);
        System.out.println("=============================================");
        Duration hr = Duration.ofHours(10);
        LocalTime time1 = time.plus(hr);
        System.out.println("after Change" + time1);
        Duration gap = Duration.between(time, time1);
        System.out.println("duration gap between time1" +
                " & time2 is " + gap);
    }
}
