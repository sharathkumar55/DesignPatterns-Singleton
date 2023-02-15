package org.example;

public class Main {
    public static void main(String[] args) {

        Caching caching = Caching.getInstance();
        caching.saveFrequentData("java");
        Caching caching2 = Caching.getInstance();
        caching2.saveFrequentData("MySql");
        caching.getFrequentData();
    }
}