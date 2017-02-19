package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;

/**
 * Created by Hp on 15/02/2017.
 */

public class TransitionActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
        setupWindowAnimations();

    }

    private void setupWindowAnimations() {
        Fade fade = new Fade();
        fade.setDuration(1000);
        getWindow().setEnterTransition(fade);
    }
}
