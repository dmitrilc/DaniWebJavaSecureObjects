package com.example;

public class Entry {

    public static void main(String[] args){
        var mutableBirthday = new MutableBirthday();
        System.out.println(mutableBirthday);
        mutableBirthday.getBirthday().setDate(10);
        System.out.println(mutableBirthday);

        var immutableBirthday = new ImmutableBirthday();
        System.out.println(immutableBirthday);
        immutableBirthday.getBirthday().plusYears(10);
        System.out.println(immutableBirthday);
    }
}
