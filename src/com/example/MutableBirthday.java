package com.example;

import java.util.Date;

public final class MutableBirthday {
    private final Date birthday = new Date(2000, 1, 1);

    public Date getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "birthday= " + birthday;
    }
}
