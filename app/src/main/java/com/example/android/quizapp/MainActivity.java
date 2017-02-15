package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public class SplashActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_card_view);

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    double score = 0;
    boolean allDone;

    private RadioButton radioQ1Op1, radioQ1Op2, radioQ1Op3, radioQ2Op1, radioQ2Op2, radioQ2Op3, radioQ4Op1, radioQ4Op2, radioQ4Op3;
    private RadioButton radioQ5Op1, radioQ5Op2, radioQ5Op3, radioQ7Op1, radioQ7Op2, radioQ7Op3, radioQ8Op1, radioQ8Op2, radioQ8Op3;
    private RadioGroup radioGroupQ1, radioGroupQ2, radioGroupQ4, radioGroupQ5, radioGroupQ7, radioGroupQ8;
    private EditText textQ3, textQ9;
    private CheckBox chkQ6Op1, chkQ6Op3, chkQ6Op4, chkQ10Op2, chkQ10Op3, chkQ10Op5;
    private CheckBox chkQ6Op2, chkQ6Op5, chkQ10Op1, chkQ10Op4;

    String answerQ3 = "1995";
    String answerQ9 = "public";
    String Q3Text, Q9text;

    private boolean booleanQ1Op1 = false;
    private boolean booleanQ1Op2 = false;
    private boolean booleanQ1Op3 = false;
    private boolean booleanQ2Op1 = false;
    private boolean booleanQ2Op2 = false;
    private boolean booleanQ2Op3 = false;
    private boolean booleanQ4Op1 = false;
    private boolean booleanQ4Op2 = false;
    private boolean booleanQ4Op3 = false;
    private boolean booleanQ5Op1 = false;
    private boolean booleanQ5Op2 = false;
    private boolean booleanQ5Op3 = false;
    private boolean booleanQ7Op1 = false;
    private boolean booleanQ7Op2 = false;
    private boolean booleanQ7Op3 = false;
    private boolean booleanQ8Op1 = false;
    private boolean booleanQ8Op2 = false;
    private boolean booleanQ8Op3 = false;

    private boolean booleanQ6Op1 = false;
    private boolean booleanQ6Op2 = false;
    private boolean booleanQ6Op3 = false;
    private boolean booleanQ6Op4 = false;
    private boolean booleanQ6Op5 = false;
    private boolean booleanQ10Op1 = false;
    private boolean booleanQ10Op2 = false;
    private boolean booleanQ10Op3 = false;
    private boolean booleanQ10Op4 = false;
    private boolean booleanQ10Op5 = false;

    static final String score_saved = "score";
    static final String q1Op1_saved = "Q1Op1";
    static final String q1Op2_saved = "Q1Op2";
    static final String q1Op3_saved = "Q1Op3";
    static final String q2Op1_saved = "Q2Op1";
    static final String q2Op2_saved = "Q2Op2";
    static final String q2Op3_saved = "Q2Op3";
    static final String q4Op1_saved = "Q4Op1";
    static final String q4Op2_saved = "Q4Op2";
    static final String q4Op3_saved = "Q4Op3";
    static final String q5Op1_saved = "Q5Op1";
    static final String q5Op2_saved = "Q5Op2";
    static final String q5Op3_saved = "Q5Op3";
    static final String q7Op1_saved = "Q7Op1";
    static final String q7Op2_saved = "Q7Op2";
    static final String q7Op3_saved = "Q7Op3";
    static final String q8Op1_saved = "Q8Op1";
    static final String q8Op2_saved = "Q8Op2";
    static final String q8Op3_saved = "Q8Op3";
    static final String q3Text_saved = "Q3Text";
    static final String q9Text_saved = "Q9Text";
    static final String Q6chk1_saved = "Q6Chk1";
    static final String Q6chk2_saved = "Q6Chk2";
    static final String Q6chk3_saved = "Q6Chk3";
    static final String Q6chk4_saved = "Q6Chk4";
    static final String Q6chk5_saved = "Q6Chk5";
    static final String Q10chk1_saved = "Q10chk1";
    static final String Q10chk2_saved = "Q10chk2";
    static final String Q10chk3_saved = "Q10chk3";
    static final String Q10chk4_saved = "Q10chk4";
    static final String Q10chk5_saved = "Q10chk5";


    @Override
    protected void onResume() {
        super.onResume();

        radioQ1Op1.setChecked(booleanQ1Op1);
        radioQ1Op2.setChecked(booleanQ1Op2);
        radioQ1Op3.setChecked(booleanQ1Op3);
        radioQ2Op1.setChecked(booleanQ2Op1);
        radioQ2Op2.setChecked(booleanQ2Op2);
        radioQ2Op3.setChecked(booleanQ2Op3);
        radioQ4Op1.setChecked(booleanQ4Op1);
        radioQ4Op2.setChecked(booleanQ4Op2);
        radioQ4Op3.setChecked(booleanQ4Op3);
        radioQ5Op1.setChecked(booleanQ5Op1);
        radioQ5Op2.setChecked(booleanQ5Op2);
        radioQ5Op3.setChecked(booleanQ5Op3);
        radioQ7Op1.setChecked(booleanQ7Op1);
        radioQ7Op2.setChecked(booleanQ7Op2);
        radioQ7Op3.setChecked(booleanQ7Op3);
        radioQ8Op1.setChecked(booleanQ8Op1);
        radioQ8Op2.setChecked(booleanQ8Op2);
        radioQ8Op3.setChecked(booleanQ8Op3);

        textQ3.setText(Q3Text);
        textQ9.setText(Q9text);

        chkQ6Op1.setChecked(booleanQ6Op1);
        chkQ6Op2.setChecked(booleanQ6Op2);
        chkQ6Op3.setChecked(booleanQ6Op3);
        chkQ6Op4.setChecked(booleanQ6Op4);
        chkQ6Op5.setChecked(booleanQ6Op5);
        chkQ10Op1.setChecked(booleanQ10Op1);
        chkQ10Op2.setChecked(booleanQ10Op2);
        chkQ10Op3.setChecked(booleanQ10Op3);
        chkQ10Op4.setChecked(booleanQ10Op4);
        chkQ10Op5.setChecked(booleanQ10Op5);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {               // save variable to temporary variable
        super.onSaveInstanceState(outState);
        outState.putDouble(score_saved, score);

        outState.putBoolean(q1Op1_saved, radioQ1Op1.isChecked());
        outState.putBoolean(q1Op2_saved, radioQ1Op2.isChecked());
        outState.putBoolean(q1Op3_saved, radioQ1Op3.isChecked());
        outState.putBoolean(q2Op1_saved, radioQ2Op1.isChecked());
        outState.putBoolean(q2Op2_saved, radioQ2Op2.isChecked());
        outState.putBoolean(q2Op3_saved, radioQ2Op3.isChecked());
        outState.putBoolean(q4Op1_saved, radioQ4Op1.isChecked());
        outState.putBoolean(q4Op2_saved, radioQ4Op2.isChecked());
        outState.putBoolean(q4Op3_saved, radioQ4Op3.isChecked());
        outState.putBoolean(q5Op1_saved, radioQ5Op1.isChecked());
        outState.putBoolean(q5Op2_saved, radioQ5Op2.isChecked());
        outState.putBoolean(q5Op3_saved, radioQ5Op3.isChecked());
        outState.putBoolean(q7Op1_saved, radioQ7Op1.isChecked());
        outState.putBoolean(q7Op2_saved, radioQ7Op2.isChecked());
        outState.putBoolean(q7Op3_saved, radioQ7Op3.isChecked());
        outState.putBoolean(q8Op1_saved, radioQ8Op1.isChecked());
        outState.putBoolean(q8Op2_saved, radioQ8Op2.isChecked());
        outState.putBoolean(q8Op3_saved, radioQ8Op3.isChecked());

        outState.putString(q3Text_saved, textQ3.getText().toString());
        outState.putString(q9Text_saved, textQ9.getText().toString());

        outState.putBoolean(Q6chk1_saved, chkQ6Op1.isChecked());
        outState.putBoolean(Q6chk2_saved, chkQ6Op2.isChecked());
        outState.putBoolean(Q6chk3_saved, chkQ6Op3.isChecked());
        outState.putBoolean(Q6chk4_saved, chkQ6Op4.isChecked());
        outState.putBoolean(Q6chk5_saved, chkQ6Op5.isChecked());
        outState.putBoolean(Q10chk1_saved, chkQ6Op1.isChecked());
        outState.putBoolean(Q10chk2_saved, chkQ10Op2.isChecked());
        outState.putBoolean(Q10chk3_saved, chkQ10Op3.isChecked());
        outState.putBoolean(Q10chk4_saved, chkQ10Op4.isChecked());
        outState.putBoolean(Q10chk5_saved, chkQ10Op5.isChecked());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        score = savedInstanceState.getDouble(score_saved);

        booleanQ1Op1 = savedInstanceState.getBoolean(q1Op1_saved);
        booleanQ1Op2 = savedInstanceState.getBoolean(q1Op2_saved);
        booleanQ1Op3 = savedInstanceState.getBoolean(q1Op3_saved);
        booleanQ2Op1 = savedInstanceState.getBoolean(q2Op1_saved);
        booleanQ2Op2 = savedInstanceState.getBoolean(q2Op2_saved);
        booleanQ2Op3 = savedInstanceState.getBoolean(q2Op3_saved);
        booleanQ4Op1 = savedInstanceState.getBoolean(q4Op1_saved);
        booleanQ4Op2 = savedInstanceState.getBoolean(q4Op2_saved);
        booleanQ4Op3 = savedInstanceState.getBoolean(q4Op3_saved);
        booleanQ5Op1 = savedInstanceState.getBoolean(q5Op1_saved);
        booleanQ5Op2 = savedInstanceState.getBoolean(q5Op2_saved);
        booleanQ5Op3 = savedInstanceState.getBoolean(q5Op3_saved);
        booleanQ7Op1 = savedInstanceState.getBoolean(q7Op1_saved);
        booleanQ7Op2 = savedInstanceState.getBoolean(q7Op2_saved);
        booleanQ7Op3 = savedInstanceState.getBoolean(q7Op3_saved);
        booleanQ8Op1 = savedInstanceState.getBoolean(q8Op1_saved);
        booleanQ8Op2 = savedInstanceState.getBoolean(q8Op2_saved);
        booleanQ8Op3 = savedInstanceState.getBoolean(q8Op3_saved);

        Q3Text = savedInstanceState.getString(q3Text_saved);
        Q9text = savedInstanceState.getString(q9Text_saved);

        booleanQ6Op1 = savedInstanceState.getBoolean(Q6chk1_saved);
        booleanQ6Op2 = savedInstanceState.getBoolean(Q6chk2_saved);
        booleanQ6Op3 = savedInstanceState.getBoolean(Q6chk3_saved);
        booleanQ6Op4 = savedInstanceState.getBoolean(Q6chk4_saved);
        booleanQ6Op5 = savedInstanceState.getBoolean(Q6chk5_saved);
        booleanQ10Op1 = savedInstanceState.getBoolean(Q10chk1_saved);
        booleanQ10Op2 = savedInstanceState.getBoolean(Q10chk2_saved);
        booleanQ10Op3 = savedInstanceState.getBoolean(Q10chk3_saved);
        booleanQ10Op4 = savedInstanceState.getBoolean(Q10chk4_saved);
        booleanQ10Op5 = savedInstanceState.getBoolean(Q10chk5_saved);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);




// the following line prevents the soft keyboard to appear as soon as the app is launched
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

// link variables with objects in the layout:
        radioQ1Op1 = (RadioButton) findViewById(R.id.q1_radio_button_1);
        radioQ1Op2 = (RadioButton) findViewById(R.id.q1_radio_button_2);
        radioQ1Op3 = (RadioButton) findViewById(R.id.q1_radio_button_3);
        radioQ2Op1 = (RadioButton) findViewById(R.id.q2_radio_button_1);
        radioQ2Op2 = (RadioButton) findViewById(R.id.q2_radio_button_2);
        radioQ2Op3 = (RadioButton) findViewById(R.id.q2_radio_button_3);
        textQ3 = (EditText) findViewById(R.id.text_question3);
        radioQ4Op1 = (RadioButton) findViewById(R.id.q4_radio_button_1);
        radioQ4Op2 = (RadioButton) findViewById(R.id.q4_radio_button_2);
        radioQ4Op3 = (RadioButton) findViewById(R.id.q4_radio_button_3);
        radioQ5Op1 = (RadioButton) findViewById(R.id.q5_radio_button_1);
        radioQ5Op2 = (RadioButton) findViewById(R.id.q5_radio_button_2);
        radioQ5Op3 = (RadioButton) findViewById(R.id.q5_radio_button_3);
        chkQ6Op1 = (CheckBox) findViewById(R.id.question_6_checkbox_1);
        chkQ6Op2 = (CheckBox) findViewById(R.id.question_6_checkbox_2);
        chkQ6Op3 = (CheckBox) findViewById(R.id.question_6_checkbox_3);
        chkQ6Op4 = (CheckBox) findViewById(R.id.question_6_checkbox_4);
        chkQ6Op5 = (CheckBox) findViewById(R.id.question_6_checkbox_5);
        radioQ7Op1 = (RadioButton) findViewById(R.id.q7_radio_button_1);
        radioQ7Op2 = (RadioButton) findViewById(R.id.q7_radio_button_2);
        radioQ7Op3 = (RadioButton) findViewById(R.id.q7_radio_button_3);
        radioQ8Op1 = (RadioButton) findViewById(R.id.q8_radio_button_1);
        radioQ8Op2 = (RadioButton) findViewById(R.id.q8_radio_button_2);
        radioQ8Op3 = (RadioButton) findViewById(R.id.q8_radio_button_3);
        textQ9 = (EditText) findViewById(R.id.text_question9);
        chkQ10Op1 = (CheckBox) findViewById(R.id.question_10_checkbox_1);
        chkQ10Op2 = (CheckBox) findViewById(R.id.question_10_checkbox_2);
        chkQ10Op3 = (CheckBox) findViewById(R.id.question_10_checkbox_3);
        chkQ10Op4 = (CheckBox) findViewById(R.id.question_10_checkbox_4);
        chkQ10Op5 = (CheckBox) findViewById(R.id.question_10_checkbox_5);
        radioGroupQ1 = (RadioGroup) findViewById(R.id.radio_group_q1);
        radioGroupQ2 = (RadioGroup) findViewById(R.id.radio_group_q2);
        radioGroupQ4 = (RadioGroup) findViewById(R.id.radio_group_q4);
        radioGroupQ5 = (RadioGroup) findViewById(R.id.radio_group_q5);
        radioGroupQ7 = (RadioGroup) findViewById(R.id.radio_group_q7);
        radioGroupQ8 = (RadioGroup) findViewById(R.id.radio_group_q8);


    }

    private void setupWindowAnimations() {
        Slide slide = new Slide();
        slide.setDuration(1000);
        getWindow().setExitTransition(slide);
    }

// the following method calculate the score when the button is pressed:
            public void submitScore(View v) {

// to be able to submit the game, the player must have all questions answered:
                allDone = true;

                allQuestionsDone(radioGroupQ1);
                allQuestionsDone(radioGroupQ2);
                allQuestionsDone(radioGroupQ4);
                allQuestionsDone(radioGroupQ5);
                allQuestionsDone(radioGroupQ7);
                allQuestionsDone(radioGroupQ8);

                editTextsDone();

                checkBoxesDone();



                if (allDone) {

                    boolean[] questionArray = new boolean[10];
                    Intent resultIntent = new Intent(MainActivity.this, ResultActivity.class);

                    if (radioQ1Op2.isChecked()) {
                        score = score + 10;
                        questionArray[0] =true;
                    }
                    else {
                        questionArray[0]=false;
                    }

                    if (radioQ2Op2.isChecked()) {
                        score = score + 10;
                        questionArray[1] =true;
                    }
                    else {
                        questionArray[1]=false;
                    }
                    if (textQ3.getText().toString().equals(answerQ3)) {
                        score = score + 10;
                        questionArray[2] =true;
                    }
                    else {
                        questionArray[2]=false;
                    }

                    if (radioQ4Op3.isChecked()) {
                        score = score + 10;
                        questionArray[3] =true;
                    }
                    else {
                        questionArray[3]=false;
                    }
                    if (radioQ5Op3.isChecked()) {
                        score = score + 10;
                        questionArray[4] =true;
                    }
                    else {
                        questionArray[4]=false;
                    }
                    if (chkQ6Op1.isChecked() & chkQ6Op3.isChecked() & chkQ6Op4.isChecked()) {
                        score = score + 10;
                        questionArray[5] =true;
                    }
                    if (chkQ6Op1.isChecked() & chkQ6Op3.isChecked()) {
                        score = score + 6.67;
                        questionArray[5] =true;
                    }
                    if (chkQ6Op1.isChecked() & chkQ6Op4.isChecked()) {
                        score = score + 6.67;
                        questionArray[5] =true;
                    }
                    if (chkQ6Op3.isChecked() & chkQ6Op4.isChecked()) {
                        score = score + 6.67;
                        questionArray[5] =true;
                    }
                    if (chkQ6Op1.isChecked() | chkQ6Op4.isChecked() | chkQ6Op3.isChecked()) {
                        score = score + 3.33;
                        questionArray[5] =true;
                    }
                    else {
                        questionArray[5]=false;
                    }
                    if (radioQ7Op1.isChecked()) {
                        score = score + 10;
                        questionArray[6] =true;
                    }
                    else {
                        questionArray[6]=false;
                    }
                    if (radioQ8Op3.isChecked()) {
                        score = score + 10;
                        questionArray[7] =true;
                    }
                    else {
                        questionArray[7]=false;
                    }
                    if (textQ9.getText().toString().equals(answerQ9)) {
                        score = score + 10;
                        questionArray[8] =true;
                    }
                    else {
                        questionArray[8]=false;
                    }
                    if (chkQ10Op2.isChecked() & chkQ10Op3.isChecked() & chkQ10Op5.isChecked()) {
                        score = score + 10;
                        questionArray[9] =true;
                    }
                    if (chkQ10Op2.isChecked() & chkQ6Op3.isChecked()) {
                        score = score + 6.67;
                        questionArray[9] =true;
                    }
                    if (chkQ10Op2.isChecked() & chkQ10Op5.isChecked()) {
                        score = score + 6.67;
                        questionArray[9] =true;
                    }
                    if (chkQ10Op3.isChecked() & chkQ10Op5.isChecked()) {
                        score = score + 6.67;
                        questionArray[9] =true;
                    }
                    if (chkQ10Op2.isChecked() | chkQ10Op3.isChecked() | chkQ10Op5.isChecked()) {
                        score = score + 3.33;
                        questionArray[9] =true;
                    }
                    else {
                        questionArray[9]=false;
                    }
                    resultIntent.putExtra("questionArray", questionArray);
                    startActivity(resultIntent);
                  Toast.makeText(this, "Your score is: " + score + "%", Toast.LENGTH_LONG).show();
                    setupWindowAnimations();
                } else {
                    Toast.makeText(this, "You have not answered all the questions!", Toast.LENGTH_SHORT).show();
                }
            }





    // this methods prepare a boolean variable that will check if all questions have been answered
    private void allQuestionsDone(RadioGroup radioGroup) {
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            allDone = false;
        }
    }

    private void editTextsDone() {
        if (textQ3.getText().toString().equals("") | textQ9.getText().toString().equals("")) {
            allDone = false;

        }
    }

    private void checkBoxesDone() {
        if (!chkQ6Op1.isChecked() && !chkQ6Op2.isChecked() && !chkQ6Op3.isChecked() && !chkQ6Op4.isChecked() && !chkQ6Op5.isChecked() && !chkQ10Op1.isChecked() && !chkQ10Op2.isChecked() && !chkQ10Op3.isChecked() && !chkQ10Op4.isChecked() && !chkQ10Op5.isChecked()) {
            allDone = false;
        }
    }

 /*   // reset all the fields (not neede anymore since moving to ResultActivity
    public void reset(View view) {


        score = 0;

        radioGroupQ1.clearCheck();
        radioGroupQ2.clearCheck();
        radioGroupQ4.clearCheck();
        radioGroupQ5.clearCheck();
        radioGroupQ7.clearCheck();
        radioGroupQ8.clearCheck();

        if (chkQ6Op1.isChecked()) {
            chkQ6Op1.toggle();
        }
        if (chkQ6Op2.isChecked()) {
            chkQ6Op2.toggle();
        }
        if (chkQ6Op3.isChecked()) {
            chkQ6Op3.toggle();
        }
        if (chkQ6Op4.isChecked()) {
            chkQ6Op4.toggle();
        }
        if (chkQ6Op5.isChecked()) {
            chkQ6Op5.toggle();
        }
        if (chkQ10Op1.isChecked()) {
            chkQ10Op1.toggle();
        }
        if (chkQ10Op2.isChecked()) {
            chkQ10Op2.toggle();
        }
        if (chkQ10Op3.isChecked()) {
            chkQ10Op3.toggle();
        }
        if (chkQ10Op4.isChecked()) {
            chkQ10Op4.toggle();
        }
        if (chkQ10Op5.isChecked()) {
            chkQ10Op5.toggle();
        }

        textQ3.setText(null);
        textQ9.setText(null);

    }*/

}