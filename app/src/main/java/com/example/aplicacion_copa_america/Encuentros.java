package com.example.aplicacion_copa_america;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Encuentros extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuentros);

        tabLayout = findViewById(R.id.tabLayoutId);
        viewPager = findViewById(R.id.viewPagerId);
        adapter = new ViewPageAdapter(getSupportFragmentManager());

        //Adding fragments
        adapter.AddFragment(new FragmentEquipos(), "");
        adapter.AddFragment(new FragmentFavoritos(), "");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.equipos);
        tabLayout.getTabAt(1).setIcon(R.drawable.favoritos);
    }
}
