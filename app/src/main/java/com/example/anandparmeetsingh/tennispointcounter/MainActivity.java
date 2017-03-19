package com.example.anandparmeetsingh.tennispointcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    int counterA = 0;
    int counter1 = 0;
    int pointA = 0;

    public void plusFifteenPointA(View view) {
        counter1++;
        if (counter1 == 1) {
            displayForTeamA(15);
        }
        if (counter1 == 2) {
            displayForTeamA(30);
        }
        if (counter1 == 3) {
            displayForTeamA(40);
        }
        if (counter1 == 4) {

            counterA++;
            setPointA(counterA);
            pointA = 0;
            pointB = 0;
            displayForTeamA(pointA);
            displayForTeamB(pointB);

            if (counterA > 5) {
                displayWinner("Player A Wins");
            }
            if (counterB > 5) {
                displayWinner("Player B Wins");
            }
            if (counterA > 5) {
                counterA = 0;
                pointA = 0;
                pointB = 0;
                counterB = 0;
                setPointB(0);
                setPointA(0);
                counter1 = 0;
                counter2 = 0;
                displayForTeamA(pointA);
                displayForTeamB(pointB);
            }
            pointA = 0;
            pointB = 0;
            counter1 = 0;
            counter2 = 0;
            displayForTeamA(pointA);
            displayForTeamB(pointB);
        }
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    int pointB = 0;
    int counterB = 0;
    int counter2 = 0;

    public void plusFifteenPointB(View view) {
        counter2++;
        if (counter2 == 1) {
            displayForTeamB(15);
        }
        if (counter2 == 2) {
            displayForTeamB(30);
        }
        if (counter2 == 3) {
            displayForTeamB(40);
        }
        if (counter2 == 4) {

            counterB++;
            setPointB(counterB);
            pointA = 0;
            pointB = 0;
            displayForTeamA(pointA);
            displayForTeamB(pointB);

            if (counterA > 5) {

                displayWinner("Player A Wins");
            }
            if (counterB > 5) {
                displayWinner("Player B Wins");
            }
            if (counterB > 5) {
                counterA = 0;
                counterB = 0;
                pointA = 0;
                pointB = 0;
                setPointB(0);
                setPointA(0);
                counter2 = 0;
                counter1 = 0;
                displayForTeamA(pointA);
                displayForTeamB(pointB);
            }
            pointA = 0;
            pointB = 0;
            counter2 = 0;
            counter1 = 0;
            displayForTeamA(pointA);
            displayForTeamB(pointB);
        }
    }

    public void reset(View view) {
        counter1 = 0;
        counter2 = 0;
        pointA = 0;
        pointB = 0;
        counterA = 0;
        counterB = 0;
        setPointA(0);
        setPointB(0);
        displayForTeamA(pointA);
        displayForTeamB(pointB);
        displayWinner(" ");

    }

    public void setPointA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_set);
        scoreView.setText(String.valueOf(score));
    }

    public void setPointB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_set);
        scoreView.setText(String.valueOf(score));
    }

    public void displayWinner(String score) {
        TextView scoreView = (TextView) findViewById(R.id.winner);
        scoreView.setText(String.valueOf(score));

    }


}
