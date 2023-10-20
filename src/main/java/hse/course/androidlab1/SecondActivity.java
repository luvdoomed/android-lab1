package hse.course.androidlab1;

import androidx.constraintlayout.widget.ConstraintLayout;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

public class SecondActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.second_activity);

        Intent intent = getIntent();
        String colour = intent.getStringExtra("colour");

        ConstraintLayout constraintLayout = findViewById(R.id.layout);

        switch (colour) {
            case "RED": {
                constraintLayout.setBackgroundColor(Color.RED);
                break;
            }
            case "BLUE": {
                constraintLayout.setBackgroundColor(Color.BLUE);
                break;
            }
            case "GREEN": {
                constraintLayout.setBackgroundColor(Color.GREEN);
                break;
            }
        }
    }
}