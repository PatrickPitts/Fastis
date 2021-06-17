package services;


import model.SampleLocalDateTimes;

import java.time.LocalDateTime;

class TimeProximityServicesTest {

    public static void main(String[] args) {
        //testThisWeek();
        for(LocalDateTime t : SampleLocalDateTimes.get()){
            System.out.println(TimeProximityServices.thisWeek(t));
        }
    }

    static void testThisWeek() {
        System.out.println(TimeProximityServices.thisWeek(LocalDateTime.now()));
    }
}