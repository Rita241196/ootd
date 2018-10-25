package com.example.citra.bajuootdfragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        //pengecekan agar fragment hanya dibuat sekali saja
        if (savedInstanceState == null) {
            //mengambil fragment baju
            BodyPartFragment headFragment = new BodyPartFragment();
            headFragment.setmListIndex(0);
            //inisiasi adapter untuk mengaktifkan fragmen baju
            FragmentManager fragmentManager = getSupportFragmentManager();
            headFragment.setmImageIds(ImageAssets.getBaju());
            //transaksi fragmen
            fragmentManager.beginTransaction()
                    .add(R.id.baju_container, headFragment)
                    .commit();


            //mengambil fragment bawahan
            BodyPartFragment legsFragment = new BodyPartFragment();
            legsFragment.setmListIndex(0);
            //inisiasi adapter untuk mengaktifkan fragmen bawahan
            legsFragment.setmImageIds(ImageAssets.getBawahan()); //
            //transaksi fragmen bawahan
            fragmentManager.beginTransaction()
                    .add(R.id.bawahan_container, legsFragment)
                    .commit();


        }
    }
}
