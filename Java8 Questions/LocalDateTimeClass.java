import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalDateTimeClass {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        System.out.println("Today Date : " + todayDate);
        System.out.println("Yesterday Date : " + todayDate.minusDays(1));
        System.out.println("Tomorrow Date : " + todayDate.plusDays(1));

        LocalDate date1 = LocalDate.of(2017, 1, 13);
        System.out.println(date1 + " is leap year : " + date1.isLeapYear());

        LocalDate date2 = LocalDate.of(2020, 6, 25);
        System.out.println(date2 + " is leap year : " + date2.isLeapYear());

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current system time : " + currentTime);

        LocalTime time = LocalTime.of(10, 30, 15);

        System.out.println("Time : " + time);

        LocalTime time1 = LocalTime.of(10, 30, 15);
        System.out.println("Time1 : " + time1);

        LocalTime time2 = time1.minusHours(2);
        System.out.println("Time2 : " + time2);

        LocalTime time3 = time2.plusMinutes(30);
        System.out.println("Time3 : " + time3);

        LocalDate todayDate1 = LocalDate.now();
        LocalDateTime dateTime = todayDate1.atTime(2, 30);
        System.out.println("Today Date with Time : " + dateTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time : " + now);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        System.out.println("After Formatting : " + formatDateTime);

        System.out.println("Today : " + now);
        System.out.println("DAY_OF_WEEK : " + now.get(ChronoField.DAY_OF_WEEK));
        System.out.println("DAY_OF_YEAR : " + now.get(ChronoField.DAY_OF_YEAR));
        System.out.println("DAY_OF_MONTH : " + now.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR_OF_DAY : " + now.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE_OF_DAY : " + now.get(ChronoField.MINUTE_OF_DAY));

        Clock c = Clock.systemDefaultZone();
        ZoneId zoneId = c.getZone();
        System.out.println("System Default Zone : " + zoneId);
    }
}
