package id.web.twoh.twoh_android_layoutbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btSpinner = (Button) findViewById(R.id.bt_spinner);
        btSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(TWOHLayoutSpinner.newIntent(MainActivity.this));
            }
        });
    }
}
