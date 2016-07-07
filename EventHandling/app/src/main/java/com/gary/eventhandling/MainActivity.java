package com.gary.eventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buckysButton = (Button)findViewById(R.id.buckysButton);

        buckysButton.setOnClickListener(   //Wait for a click
               new Button.OnClickListener() {
                   public void onClick(View v) {
                       TextView buckysText = (TextView)findViewById(R.id.buckysText);
                       buckysText.setText("Good Job");
                   }
               }
        );

        buckysButton.setOnLongClickListener( //Holding down the button
            new Button.OnLongClickListener() {
                public boolean onLongClick(View v) {
                    TextView buckysText = (TextView)findViewById(R.id.buckysText);
                    buckysText.setText("Holy that was a long one");
                    return false;
                }
            }
        );
    }
}
