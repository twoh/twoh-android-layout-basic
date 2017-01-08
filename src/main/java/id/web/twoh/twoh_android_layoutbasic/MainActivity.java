package id.web.twoh.twoh_android_layoutbasic;

import android.content.Intent;
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

        Button btRadioButton = (Button) findViewById(R.id.bt_radiobutton);
        btRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(TWOHLayoutRadioButton.newIntent(MainActivity.this));
            }
        });

        Button btCheckBox = (Button) findViewById(R.id.bt_checkbox);
        btCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(TWOHLayoutCheckBox.newIntent(MainActivity.this));
            }
        });

        Button btToggle = (Button) findViewById(R.id.bt_toggle);
        btToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(TWOHLayoutToggle.newIntent(MainActivity.this));
            }
        });

        Button btBasic = (Button) findViewById(R.id.bt_basic);
        btBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TWOHActivityConcept.class));
            }
        });

        Button btAlertDialog = (Button) findViewById(R.id.bt_alertdialog);
        btAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TWOHAlertDialog.class));
            }
        });
    }
}
