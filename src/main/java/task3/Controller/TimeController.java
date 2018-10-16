package task3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import task3.Model.Time;
import task3.Service.TimeService;

@Controller
public class TimeController {

    @GetMapping("/current-time")
    @ResponseBody
    public Time showTimes(){
        return new Time(TimeService.currentTime(), TimeService.canadaTime());

    }
}