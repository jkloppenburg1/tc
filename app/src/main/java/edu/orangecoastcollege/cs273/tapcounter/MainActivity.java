package edu.orangecoastcollege.cs273.tapcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button speakButton;
    private Counter myCounter = new Counter();

    private TextView countTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countTextView = (TextView) findViewById(R.id.countTextView);

        speakButton = (Button) findViewById(R.id.tapButton);

        speakButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {myCounter.addNumberOfTaps();
                       countTextView.setText(String.valueOf(myCounter.getNumberOfTaps()));
                    }
                }
        );
    }
}
