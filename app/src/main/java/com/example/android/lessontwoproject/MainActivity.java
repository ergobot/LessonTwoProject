package com.example.android.lessontwoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeScoreTeamA(View view){

        Button button = (Button)view;

        if(button.getText().charAt(0) == '-'){
            teamAScore = teamAScore - Character.getNumericValue(button.getText().charAt(1));
        }else{
            teamAScore = teamAScore + Character.getNumericValue(button.getText().charAt(1));
        }

        ((TextView)findViewById(R.id.teamonescore)).setText(String.valueOf(teamAScore));

    }

    public void changeScoreTeamB(View view){

        Button button = (Button)view;

        if(button.getText().charAt(0) == '-'){
            teamBScore = teamBScore - Character.getNumericValue(button.getText().charAt(1));
        }else{
            teamBScore = teamBScore + Character.getNumericValue(button.getText().charAt(1));
        }

        ((TextView)findViewById(R.id.teamtwoscore)).setText(String.valueOf(teamBScore));

    }

    public void resetScores(View view){

        teamAScore = 0;
        teamBScore = 0;
        ((TextView)findViewById(R.id.teamonescore)).setText(String.valueOf(teamAScore));
        ((TextView)findViewById(R.id.teamtwoscore)).setText(String.valueOf(teamBScore));

    }


}
