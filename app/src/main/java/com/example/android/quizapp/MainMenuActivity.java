package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by redlor on 19/02/2017.
 */

public class MainMenuActivity extends AppCompatActivity implements TextWatcher {

private EditText editPlayer;



    public class SplashActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_menu);

            Intent intent = new Intent(this, MainMenuActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        editPlayer = (EditText) findViewById(R.id.edt_player);
        editPlayer.addTextChangedListener(this);


    Button goToQuiz = (Button)findViewById(R.id.btn_go_to_quiz);
    goToQuiz.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent quizIntent = new Intent(MainMenuActivity.this, MainActivity.class);
            startActivity(quizIntent);

        }
    });

}
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }

    @Override
    public void afterTextChanged(Editable s) {


        if (s == editPlaye.getText()) {
            String tx1 = s.toString();
            Intent quizIntent = new Intent(MainMenuActivity.this, MainActivity.class);
            quizIntent.putExtra("name", tx1);

        }


    }
}
