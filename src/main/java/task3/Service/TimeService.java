package task3.Service;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.ZoneId;

@Component
public class TimeService {

    public static LocalTime currentTime()
    {
        return LocalTime.now();
    }
    public static LocalTime canadaTime()
    {
        return LocalTime.now(ZoneId.of("UTC-7"));
    }
}