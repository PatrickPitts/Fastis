package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;

public class SampleLocalDateTimes {

    public static List<LocalDateTime> get(){
        List<LocalDateTime> ret = new ArrayList<>();
        ret.add(LocalDateTime.of(2021, 6, 8,0,0));
        ret.add(LocalDateTime.of(2021, 6,10,16,30));
        ret.add(LocalDateTime.of(2021, 10,25,0,0));
        return ret;

    }
}
