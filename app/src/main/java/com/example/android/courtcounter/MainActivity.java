package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_team_a = 0;
    int score_team_b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.display_points_A);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.display_points_B);
        scoreView.setText(String.valueOf(score));
    }
    public void addOneForTeamB(View v) {
        score_team_b += 1;
        displayForTeamB(score_team_b);
    }
    public void addTwoForTeamB(View v) {
        score_team_b += 2;
        displayForTeamB(score_team_b);
    }
    public void addThreeForTeamB(View v) {
        score_team_b += 3;
        displayForTeamB(score_team_b);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        score_team_a += 1;
        displayForTeamA(score_team_a);;
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        score_team_a += 2;
        displayForTeamA(score_team_a);;
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        score_team_a += 3;
        displayForTeamA(score_team_a);;
    }
    public void reset(View v) {
        score_team_a = 0;
        score_team_b = 0;
        displayForTeamA(score_team_a);
        displayForTeamB(score_team_b);
    }
}