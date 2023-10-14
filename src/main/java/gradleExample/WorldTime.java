package gradleExample;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class WorldTime {
    String getTimeByCountry() {
        ZoneId countryZone = ZoneId.of("UTC+1");

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime currentTime = LocalTime.now(countryZone);

        return timeFormatter.format(currentTime);
    }
}

