package task3.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalTime;

@AllArgsConstructor
@Getter
public class Time {

    private final LocalTime currentTime;
    private final LocalTime canadaTime;

}
