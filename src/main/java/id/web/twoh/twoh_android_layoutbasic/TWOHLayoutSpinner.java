package id.web.twoh.twoh_android_layoutbasic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Hafizh Herdi on 8/15/2016.
 */
public class TWOHLayoutSpinner extends AppCompatActivity {

    private Spinner spNamen2;
    private Spinner spNamen;
    private String[] germanFeminine = {
            "Karin",
            "Ingrid", "Helga",
            "Renate",
            "Elke",
            "Ursula",
            "Erika",
            "Christa",
            "Gisela",
            "Monika"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spNamen = (Spinner) findViewById(R.id.sp_name);

        Button btSpinner = (Button) findViewById(R.id.bt_check);
        btSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TWOHLayoutSpinner.this, "Selected "+ spNamen.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        spNamen2 = (Spinner) findViewById(R.id.sp_name_2);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, germanFeminine);
        spNamen2.setAdapter(adapter);
        spNamen2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(TWOHLayoutSpinner.this, "Selected "+ adapter.getItem(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public static Intent newIntent(Context ctx){
        return new Intent(ctx, TWOHLayoutSpinner.class);
    }

}
