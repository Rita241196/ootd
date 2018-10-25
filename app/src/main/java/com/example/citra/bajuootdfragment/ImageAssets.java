package com.example.citra.bajuootdfragment;

import java.util.ArrayList;
import java.util.List;


public class ImageAssets {

    ////variabel pengelompokan gambar baju
    private static List<Integer> baju = new ArrayList<Integer>(){{
        add(R.drawable.baju1);
        add(R.drawable.baju2);
        add(R.drawable.baju3);
        add(R.drawable.baju4);
        add(R.drawable.baju5);
        add(R.drawable.baju6);
        add(R.drawable.baju7);
    }};

    //variabel pengelompokan gambar bawahan
    private static List<Integer> bawahan = new ArrayList<Integer>(){{
        add(R.drawable.bw1);
        add(R.drawable.bw2);
        add(R.drawable.bw3);
        add(R.drawable.bw4);
        add(R.drawable.bw5);
        add(R.drawable.bw6);
        add(R.drawable.bw7);
    }};

    //metode untuk heads
    public static List<Integer> getBaju(){
        return baju;
    }

    //metode untuk legs
    public static List<Integer> getBawahan(){
        return bawahan;
    }
}
