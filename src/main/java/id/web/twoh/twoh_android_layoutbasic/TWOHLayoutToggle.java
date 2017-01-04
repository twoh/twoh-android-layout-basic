package id.web.twoh.twoh_android_layoutbasic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by Hafizh Herdi on 1/3/2017.
 */

public class TWOHLayoutToggle extends AppCompatActivity {

    ToggleButton toggleButton1, toggleButton2;
    Button btState;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);

        toggleButton1 = (ToggleButton) findViewById(R.id.tgl_1);
        toggleButton2 = (ToggleButton) findViewById(R.id.tgl_2);
        btState = (Button) findViewById(R.id.bt_toggle);

        btState.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("Status toggleButton1 : ").append(toggleButton1.isChecked());
                result.append("\nStatus toggleButton2 : ").append(toggleButton2.isChecked());

                Toast.makeText(TWOHLayoutToggle.this, result.toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    public static Intent newIntent(Context ctx){
        return new Intent(ctx, TWOHLayoutToggle.class);
    }

}
