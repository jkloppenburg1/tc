package edu.orangecoastcollege.cs273.tapcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button speakButton;
    private final Counter myCounter = new Counter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.countTextView);

        speakButton = (Button) findViewById(R.id.tapButton);

        speakButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        myCounter.addNumberOfTaps();
                    }
                }
        );
    }
}
