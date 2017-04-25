package com.example.android.quizapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {



    double score = 0;
    boolean allDone;


    private RadioButton radioQ1Op1, radioQ1Op2, radioQ1Op3, radioQ2Op1, radioQ2Op2, radioQ2Op3, radioQ4Op1, radioQ4Op2, radioQ4Op3;
    private RadioButton radioQ5Op1, radioQ5Op2, radioQ5Op3, radioQ7Op1, radioQ7Op2, radioQ7Op3, radioQ8Op1, radioQ8Op2, radioQ8Op3;
    private RadioGroup radioGroupQ1, radioGroupQ2, radioGroupQ4, radioGroupQ5, radioGroupQ7, radioGroupQ8;
    private EditText textQ3, textQ9;
    private CheckBox chkQ6Op1, chkQ6Op3, chkQ6Op4, chkQ10Op2, chkQ10Op3, chkQ10Op5;
    private CheckBox chkQ6Op2, chkQ6Op5, chkQ10Op1, chkQ10Op4;

    String answerQ3 = "1995";
    String answerQ9 = "Public";
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

    static final String SCORE_SAVED = "score";
    static final String Q1OP1_SAVED = "Q1Op1";
    static final String Q1OP2_SAVED = "Q1Op2";
    static final String Q1OP3_SAVED = "Q1Op3";
    static final String Q2OP1_SAVED = "Q2Op1";
    static final String Q2OP2_SAVED = "Q2Op2";
    static final String Q2OP3_SAVED= "Q2Op3";
    static final String Q4OP1_SAVED = "Q4Op1";
    static final String Q4OP2_SAVED = "Q4Op2";
    static final String Q4OP3_SAVED = "Q4Op3";
    static final String Q5OP1_SAVED = "Q5Op1";
    static final String Q5OP2_SAVED = "Q5Op2";
    static final String Q5OP3_SAVED = "Q5Op3";
    static final String Q7OP1_SAVED = "Q7Op1";
    static final String Q7OP2_SAVED = "Q7Op2";
    static final String Q7OP3_SAVED = "Q7Op3";
    static final String Q8OP1_SAVED = "Q8Op1";
    static final String Q8OP2_SAVED = "Q8Op2";
    static final String Q8OP3_SAVED = "Q8Op3";
    static final String Q3TEXT_SAVED = "Q3Text";
    static final String Q9TEXT_SAVED = "Q9Text";
    static final String Q6CHK1_SAVED = "Q6Chk1";
    static final String Q6CHK2_SAVED = "Q6Chk2";
    static final String Q6CHK3_SAVED = "Q6Chk3";
    static final String Q6CHK4_SAVED = "Q6Chk4";
    static final String Q6CHK5_SAVED = "Q6Chk5";
    static final String Q10CHK1_SAVED = "Q10chk1";
    static final String Q10CHK2_SAVED = "Q10chk2";
    static final String Q10CHK3_SAVED = "Q10chk3";
    static final String Q10CHK4_SAVED = "Q10chk4";
    static final String Q10CHK5_SAVED = "Q10chk5";




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
        outState.putDouble(SCORE_SAVED, score);

        outState.putBoolean(Q1OP1_SAVED, radioQ1Op1.isChecked());
        outState.putBoolean(Q1OP2_SAVED, radioQ1Op2.isChecked());
        outState.putBoolean(Q1OP3_SAVED, radioQ1Op3.isChecked());
        outState.putBoolean(Q2OP1_SAVED, radioQ2Op1.isChecked());
        outState.putBoolean(Q2OP2_SAVED, radioQ2Op2.isChecked());
        outState.putBoolean(Q2OP3_SAVED, radioQ2Op3.isChecked());
        outState.putBoolean(Q4OP1_SAVED, radioQ4Op1.isChecked());
        outState.putBoolean(Q4OP2_SAVED, radioQ4Op2.isChecked());
        outState.putBoolean(Q4OP3_SAVED, radioQ4Op3.isChecked());
        outState.putBoolean(Q5OP1_SAVED, radioQ5Op1.isChecked());
        outState.putBoolean(Q5OP2_SAVED, radioQ5Op2.isChecked());
        outState.putBoolean(Q5OP3_SAVED, radioQ5Op3.isChecked());
        outState.putBoolean(Q7OP1_SAVED, radioQ7Op1.isChecked());
        outState.putBoolean(Q7OP2_SAVED, radioQ7Op2.isChecked());
        outState.putBoolean(Q7OP3_SAVED, radioQ7Op3.isChecked());
        outState.putBoolean(Q8OP1_SAVED, radioQ8Op1.isChecked());
        outState.putBoolean(Q8OP2_SAVED, radioQ8Op2.isChecked());
        outState.putBoolean(Q8OP3_SAVED, radioQ8Op3.isChecked());

        outState.putString(Q3TEXT_SAVED, textQ3.getText().toString());
        outState.putString(Q9TEXT_SAVED, textQ9.getText().toString());

        outState.putBoolean(Q6CHK1_SAVED, chkQ6Op1.isChecked());
        outState.putBoolean(Q6CHK2_SAVED, chkQ6Op2.isChecked());
        outState.putBoolean(Q6CHK3_SAVED, chkQ6Op3.isChecked());
        outState.putBoolean(Q6CHK4_SAVED, chkQ6Op4.isChecked());
        outState.putBoolean(Q6CHK5_SAVED, chkQ6Op5.isChecked());
        outState.putBoolean(Q10CHK1_SAVED, chkQ6Op1.isChecked());
        outState.putBoolean(Q10CHK2_SAVED, chkQ10Op2.isChecked());
        outState.putBoolean(Q10CHK3_SAVED, chkQ10Op3.isChecked());
        outState.putBoolean(Q10CHK4_SAVED, chkQ10Op4.isChecked());
        outState.putBoolean(Q10CHK5_SAVED, chkQ10Op5.isChecked());


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        score = savedInstanceState.getDouble(SCORE_SAVED);

        booleanQ1Op1 = savedInstanceState.getBoolean(Q1OP1_SAVED);
        booleanQ1Op2 = savedInstanceState.getBoolean(Q1OP2_SAVED);
        booleanQ1Op3 = savedInstanceState.getBoolean(Q1OP3_SAVED);
        booleanQ2Op1 = savedInstanceState.getBoolean(Q2OP1_SAVED);
        booleanQ2Op2 = savedInstanceState.getBoolean(Q2OP2_SAVED);
        booleanQ2Op3 = savedInstanceState.getBoolean(Q2OP3_SAVED);
        booleanQ4Op1 = savedInstanceState.getBoolean(Q4OP1_SAVED);
        booleanQ4Op2 = savedInstanceState.getBoolean(Q4OP2_SAVED);
        booleanQ4Op3 = savedInstanceState.getBoolean(Q4OP3_SAVED);
        booleanQ5Op1 = savedInstanceState.getBoolean(Q5OP1_SAVED);
        booleanQ5Op2 = savedInstanceState.getBoolean(Q5OP2_SAVED);
        booleanQ5Op3 = savedInstanceState.getBoolean(Q5OP3_SAVED);
        booleanQ7Op1 = savedInstanceState.getBoolean(Q7OP1_SAVED);
        booleanQ7Op2 = savedInstanceState.getBoolean(Q7OP2_SAVED);
        booleanQ7Op3 = savedInstanceState.getBoolean(Q7OP3_SAVED);
        booleanQ8Op1 = savedInstanceState.getBoolean(Q8OP1_SAVED);
        booleanQ8Op2 = savedInstanceState.getBoolean(Q8OP2_SAVED);
        booleanQ8Op3 = savedInstanceState.getBoolean(Q8OP3_SAVED);

        Q3Text = savedInstanceState.getString(Q3TEXT_SAVED);
        Q9text = savedInstanceState.getString(Q9TEXT_SAVED);

        booleanQ6Op1 = savedInstanceState.getBoolean(Q6CHK1_SAVED);
        booleanQ6Op2 = savedInstanceState.getBoolean(Q6CHK2_SAVED);
        booleanQ6Op3 = savedInstanceState.getBoolean(Q6CHK3_SAVED);
        booleanQ6Op4 = savedInstanceState.getBoolean(Q6CHK4_SAVED);
        booleanQ6Op5 = savedInstanceState.getBoolean(Q6CHK5_SAVED);
        booleanQ10Op1 = savedInstanceState.getBoolean(Q10CHK1_SAVED);
        booleanQ10Op2 = savedInstanceState.getBoolean(Q10CHK2_SAVED);
        booleanQ10Op3 = savedInstanceState.getBoolean(Q10CHK3_SAVED);
        booleanQ10Op4 = savedInstanceState.getBoolean(Q10CHK4_SAVED);
        booleanQ10Op5 = savedInstanceState.getBoolean(Q10CHK5_SAVED);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);



        TextView txtPlayer = (TextView) findViewById(R.id.lbl_player);
        String pl = getIntent().getExtras().getString("name");
        txtPlayer.setText(pl);
        System.out.println(pl);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                final TextView btn2 = (TextView) findViewById(R.id.lbl_player);
                btn2.setVisibility(View.GONE);
        }


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

        Button goToMainMenu = (Button)findViewById(R.id.go_to_main_menu);
        goToMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuIntent = new Intent(MainActivity.this, MainMenuActivity.class);
                startActivity(menuIntent);
            }
        });


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
                        score+= 10;
                        questionArray[0] =true;
                    }
                    else {
                        questionArray[0]=false;
                    }

                    if (radioQ2Op2.isChecked()) {
                        score+= 10;
                        questionArray[1] =true;
                    }
                    else {
                        questionArray[1]=false;
                    }
                    if (textQ3.getText().toString().equals(answerQ3)) {
                        score+= 10;
                        questionArray[2] =true;
                    }
                    else {
                        questionArray[2]=false;
                    }

                    if (radioQ4Op3.isChecked()) {
                        score+= 10;
                        questionArray[3] =true;
                    }
                    else {
                        questionArray[3]=false;
                    }
                    if (radioQ5Op3.isChecked()) {
                        score+= 10;
                        questionArray[4] =true;
                    }
                    else {
                        questionArray[4]=false;
                    }
                    if (chkQ6Op1.isChecked() && chkQ6Op3.isChecked() && chkQ6Op4.isChecked() && !chkQ6Op2.isChecked() && !chkQ6Op5.isChecked()) {
                        score+= 10;
                        questionArray[5] =true;
                    }
                    else {
                        questionArray[5]=false;
                    }
                    if (radioQ7Op1.isChecked()) {
                        score+= 10;
                        questionArray[6] =true;
                    }
                    else {
                        questionArray[6]=false;
                    }
                    if (radioQ8Op3.isChecked()) {
                        score+= 10;
                        questionArray[7] =true;
                    }
                    else {
                        questionArray[7]=false;
                    }
                    if (textQ9.getText().toString().equalsIgnoreCase(answerQ9)) {
                        score+= 10;
                        questionArray[8] =true;
                    }
                    else {
                        questionArray[8]=false;
                    }
                    if (chkQ10Op2.isChecked() && chkQ10Op3.isChecked() && chkQ10Op5.isChecked() && !chkQ10Op1.isChecked() && !chkQ10Op4.isChecked()) {
                        score+= 10;
                        questionArray[9] =true;
                    }
                    else {
                        questionArray[9]=false;
                    }
                    resultIntent.putExtra("questionArray", questionArray);
                    TextView txtPlayer_pass = (TextView) findViewById(R.id.lbl_player);
                    String txPlayer = txtPlayer_pass.getText().toString();
                    resultIntent.putExtra("name_player", txPlayer);
                    startActivity(resultIntent);
                  Toast.makeText(this, "Your score is: " + score + "%", Toast.LENGTH_LONG).show();
                    setupWindowAnimations();
                } else {
                    Toast.makeText(this, "You have not answered all the questions!", Toast.LENGTH_SHORT).show();
                }
                score = 0;
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
        if (!chkQ6Op1.isChecked() && !chkQ6Op2.isChecked() && !chkQ6Op3.isChecked() && !chkQ6Op4.isChecked() && !chkQ6Op5.isChecked() || !chkQ10Op1.isChecked() && !chkQ10Op2.isChecked() && !chkQ10Op3.isChecked() && !chkQ10Op4.isChecked() && !chkQ10Op5.isChecked()) {
            allDone = false;
        }
    }

}