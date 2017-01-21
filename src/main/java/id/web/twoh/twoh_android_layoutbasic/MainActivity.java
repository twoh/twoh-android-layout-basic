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

        Button btRelativeLayout = (Button) findViewById(R.id.bt_relativelayout);
        btRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TWOHRelativeLayout.class));
            }
        });

        Button btLinearLayout = (Button) findViewById(R.id.bt_linearlayout);
        btLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TWOHLinearLayout.class));
            }
        });

        Button btEditText = (Button) findViewById(R.id.bt_edittext);
        btEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TWOHEditText.class));
            }
        });

        Button btIntent = (Button) findViewById(R.id.bt_intent);
        btIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TWOHActivityConcept3.class));
            }
        });

        Button btCustomDialog = (Button) findViewById(R.id.bt_customdialog);
        btCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TWOHCustomAlertDialog.class));
            }
        });

        Button btDatePicker = (Button) findViewById(R.id.bt_datepicker);
        btDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TWOHDatePicker.class));
            }
        });

        Button btTimePicker = (Button) findViewById(R.id.bt_timepicker);
        btTimePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TWOHTimePicker.class));
            }
        });
    }
}
