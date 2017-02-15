package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.quizapp.R.string.answer3;
import static com.example.android.quizapp.R.string.answer9;
import static com.example.android.quizapp.R.string.question_n7_radio_button_1;
import static com.example.android.quizapp.R.string.question_n8_radio_button_3;


public class ResultActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupWindowAnimations();
        setContentView(R.layout.results);
        Bundle extras = getIntent().getExtras();
        double scoreAnswers = extras.getDouble("score");
        boolean[] correctAnswerArray = extras.getBooleanArray("questionArray");


        if (scoreAnswers<100){
            String answers=getResources().getString(R.string.correct_answers_title);
            if (correctAnswerArray[0]==false){
                answers+="\n1. "+getResources().getString(R.string.question_n1)+"\n"+getResources().getString(R.string.question_n1_radio_button_2);
            }
            if (correctAnswerArray[1]==false){
                answers+="\n2. "+getResources().getString(R.string.question_n2)+"\n"+getResources().getString(R.string.question_n2_radio_button_2);
            }
            if (correctAnswerArray[2]==false){
                answers+="\n3. "+getResources().getString(R.string.question_n3)+"\n"+getResources().getString(answer3);
            }
            if (correctAnswerArray[3]==false){
                answers+="\n4. "+getResources().getString(R.string.question_n4)+"\n"+getResources().getString(R.string.question_n4_radio_button_3);
            }
            if (correctAnswerArray[4]==false){
                answers+="\n5. "+getResources().getString(R.string.question_n5)+"\n"+getResources().getString(R.string.question_n5_radio_button_3);
            }
            if (correctAnswerArray[5]==false){
                answers+="\n6. "+getResources().getString(R.string.question_n6)+"\n"+getResources().getString(R.string.question_n6_checkbox_1)+"\n"+getResources().getString(R.string.question_n6_checkbox_3)+"\n"+getResources().getString(R.string.question_n6_checkbox_4);
            }
            if (correctAnswerArray[6]==false){
                answers+="\n7. "+getResources().getString(R.string.question_n7)+"\n"+getResources().getString(question_n7_radio_button_1);
            }
            if (correctAnswerArray[7]==false){
                answers+="\n8. "+getResources().getString(R.string.question_n8)+"\n"+getResources().getString(question_n8_radio_button_3);
            }
            if (correctAnswerArray[8]==false){
                answers+="\n9. "+getResources().getString(R.string.question_n9)+"\n"+getResources().getString(answer9);
            }
            if (correctAnswerArray[9]==false){
                answers+="\n10. "+getResources().getString(R.string.question_n10)+"\n"+getResources().getString(R.string.question_n10_checkbox_2)+"\n"+getResources().getString(R.string.question_n10_checkbox_4)+"\n"+getResources().getString(R.string.question_n10_checkbox_5);
            }
            TextView wrongAnswersText = (TextView)findViewById(R.id.wrong_answers_textview);
            wrongAnswersText.setText(answers);
        }




        Button goToMainMenu = (Button)findViewById(R.id.go_to_quiz);
        goToMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quizIntent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(quizIntent);
            }
        });



    }
    private void setupWindowAnimations() {
        Slide slide = new Slide();
        slide.setDuration(1000);
        getWindow().setExitTransition(slide);
    }
}

