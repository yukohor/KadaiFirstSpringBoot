package com.techacademy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class KadaiFirstController {

    @GetMapping("/dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {

        String year = val1.substring(0, 4);
        String month = val1.substring(4, 6);
        String day = val1.substring(6);
        System.out.println(year + month + day);
        int num = Integer.parseInt(year);
        int num2 = Integer.parseInt(month);
        int num3 = Integer.parseInt(day);

        Calendar cal = Calendar.getInstance();
        {

            cal.set(num, num2, num3);
        }

        String out;
        out = null;
        switch (cal.get(Calendar.DAY_OF_WEEK)) {
        case Calendar.SUNDAY:
            out = "sunday";
            break;
        case Calendar.MONDAY:
            out ="Monday";
            break;
        case Calendar.TUESDAY:
            out ="Tuesday";
            break;
        case Calendar.WEDNESDAY:
            out ="Wednesday";
            break;
        case Calendar.THURSDAY:
            out ="Thursday";
            break;
        case Calendar.FRIDAY:
            out ="Friday";
            break;
        case Calendar.SATURDAY:
            out ="Saturday";
            break;

        }

        return "実行結果:" + out;
    }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "実行結果" + res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "実行結果" + res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "実行結果" + res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "実行結果" + res;
    }

}
