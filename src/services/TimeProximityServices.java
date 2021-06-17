package services;

import java.time.LocalDateTime;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class TimeProximityServices {

    static boolean thisWeek(LocalDateTime event){
        int eventWeek = event.get(WeekFields.of(new Locale("en")).weekOfYear());


        return LocalDateTime.now().get(WeekFields.of(new Locale("en")).weekOfYear()) == eventWeek;
    }
}
