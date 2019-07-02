package com.Gord.classwork.lec_6_7.task_4;

public class Sinica extends Bird {
   private final String nameBird="Sinica";
   private int sizeBird;


    public Sinica(String nameBird, int sizeBird) {
        super( sizeBird);
    }

    @Override
    public int getSizeBird() {
        return sizeBird;
    }

    @Override
    public String getNameBird() {
        return nameBird;
    }


}
