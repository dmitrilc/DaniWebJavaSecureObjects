package com.example;

import java.time.ZonedDateTime;
import java.util.List;

public class SecureBirthdaysHolder {
    private List<ZonedDateTime> birthdays;

    public boolean isCorrectBirthday(ZonedDateTime input){
        return birthdays.contains(input);
    }
}