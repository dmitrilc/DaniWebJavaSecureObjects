package com.example;

import java.time.LocalDate;

public final class ImmutableBirthday {
    private final LocalDate birthday = LocalDate.of(2000, 1, 1);

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "birthday= " + birthday;
    }
}
