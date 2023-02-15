package org.example;

import java.util.ArrayList;
import java.util.List;

public class Caching {

    private static Caching caching;

    private final List<String>  frequentData = new ArrayList<>();


    private Caching(){

    }

    public static Caching getInstance()
    {
        if(caching==null)
        {
            caching = new Caching();
        }
        return caching;
    }

    public void saveFrequentData(String data)
    {
        frequentData.add(data);

    }

    public void getFrequentData(){
        for (String individualData : frequentData) {
            System.out.println("data " + individualData);
        }
    }
}
