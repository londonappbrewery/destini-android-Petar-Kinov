package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryText;
    Button mTopChoice;
    Button mBottomChoice;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = findViewById(R.id.storyTextView);
        mTopChoice =  findViewById(R.id.buttonTop);
        mBottomChoice = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                topChoices(mTopChoice.getText());
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomChoices(mBottomChoice.getText());

            }
        });

    }

    private void topChoices(CharSequence choiceText){
        if (choiceText == getString(R.string.T1_Ans1) || choiceText == getString(R.string.T2_Ans1) ){
            mStoryText.setText(R.string.T3_Story);
            mTopChoice.setText(R.string.T3_Ans1);
            mBottomChoice.setText(R.string.T3_Ans2);
        } else if (choiceText == getString(R.string.T3_Ans1)){
            mStoryText.setText(R.string.T6_End);
            mTopChoice.setVisibility(View.GONE);
            mBottomChoice.setVisibility(View.GONE);
        }
    }
    private void bottomChoices(CharSequence choiceText){
        if (choiceText == getString(R.string.T1_Ans2)){
            mStoryText.setText(R.string.T2_Story);
            mTopChoice.setText(R.string.T2_Ans1);
            mBottomChoice.setText(R.string.T2_Ans2);
        } else if (choiceText == getString(R.string.T2_Ans2)){
            mStoryText.setText(R.string.T4_End);
            mTopChoice.setVisibility(View.GONE);
            mBottomChoice.setVisibility(View.GONE);
        } else if (choiceText == getString(R.string.T3_Ans2)){
            mStoryText.setText(R.string.T5_End);
            mTopChoice.setVisibility(View.GONE);
            mBottomChoice.setVisibility(View.GONE);
        }
    }
}
