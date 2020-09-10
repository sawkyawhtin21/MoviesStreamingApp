package com.skh.moviesstreamingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Slide> lstSlide;
    private ViewPager slidepager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slidepager = findViewById(R.id.slider_pager);



        // prepare a list of slides
        lstSlide = new ArrayList<>();
        lstSlide.add(new Slide(R.drawable.slide1,"Slide Title \nmore test here"));
        lstSlide.add(new Slide(R.drawable.slide2,"Slide Title \nmore test here"));
        lstSlide.add(new Slide(R.drawable.slide1,"Slide Title \nmore test here"));
        lstSlide.add(new Slide(R.drawable.slide2,"Slide Title \nmore test here"));


        SliderPagerAdapter adapter = new SliderPagerAdapter(this,lstSlide);
        slidepager.setAdapter(adapter);
    }
}