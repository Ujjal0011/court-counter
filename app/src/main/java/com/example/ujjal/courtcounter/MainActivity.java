package com.example.ujjal.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int teamAscore = 0;
    int teamBscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusThreePointForTeamA(View view) {
        teamAscore += 3;
        displayTeamAscore(teamAscore);
    }

    public void plusTwoPointForTeamA(View view) {
        teamAscore += 2;
        displayTeamAscore(teamAscore);
    }

    public void freeThrowForTeamA(View view) {
        teamAscore += 1;
        displayTeamAscore(teamAscore);
    }

    public void plusThreePointForTeamB(View view) {
        teamBscore += 3;
        displayTeamBscore(teamBscore);
    }

    public void plusTwoPointForTeamB(View view) {
        teamBscore += 2;
        displayTeamBscore(teamBscore);
    }

    public void freeThrowForTeamB(View view) {
        teamBscore += 1;
        displayTeamBscore(teamBscore);
    }

    public void resetScore(View view) {
        teamAscore = 0;
        teamBscore = 0;
        displayTeamAscore(teamAscore);
        displayTeamBscore(teamBscore);
    }

    private void displayTeamAscore(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.id_team_a_score);
        scoreTextView.setText(number + "");
    }

    private void displayTeamBscore(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.id_team_b_score);
        scoreTextView.setText(number + "");
    }
}
