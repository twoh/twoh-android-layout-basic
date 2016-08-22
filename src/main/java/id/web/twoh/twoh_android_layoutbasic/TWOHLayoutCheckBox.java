package id.web.twoh.twoh_android_layoutbasic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Created by Hafizh Herdi on 8/23/2016.
 */
public class TWOHLayoutCheckBox extends AppCompatActivity {

    private CheckBox cbWindows, cbMac, cbLinux;
    private Button btSubmit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        setCheckBoxListener();
        setButtonListener();

    }

    private void setCheckBoxListener() {
        cbWindows = (CheckBox) findViewById(R.id.cb_windows);
        cbWindows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {
                    Toast.makeText(TWOHLayoutCheckBox.this,
                            "Ngga pingin pake Mac bro ? :)", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void setButtonListener() {
        cbWindows = (CheckBox) findViewById(R.id.cb_windows);
        cbMac = (CheckBox) findViewById(R.id.cb_macos);
        cbLinux = (CheckBox) findViewById(R.id.cb_linux);

        btSubmit = (Button) findViewById(R.id.bt_submit);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String status = "Windows check " + cbWindows.isChecked()
                        + "\n MacOS check " + cbMac.isChecked()
                        + "\n Linux check " + cbLinux.isChecked();

                Toast.makeText(TWOHLayoutCheckBox.this,status, Toast.LENGTH_LONG).show();
            }
        });
    }

    public static Intent newIntent(Context ctx) {
        return new Intent(ctx, TWOHLayoutCheckBox.class);
    }

}
