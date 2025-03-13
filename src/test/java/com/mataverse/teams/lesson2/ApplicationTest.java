package com.mataverse.teams.lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void DayofWeekPrinter(){
        Application application = new Application();
        int[] input = {1,2,4,5,9};
        String value = application.dayWeek(input);
        String result = "Monday,Tuesday,Thursday,Friday,Unknown";
        Assertions.assertEquals(result, value);
    }

}