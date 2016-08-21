package id.web.twoh.twoh_android_layoutbasic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Hafizh Herdi on 8/21/2016.
 */
public class TWOHLayoutRadioButton extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);

        final RadioGroup rgGender = (RadioGroup) findViewById(R.id.rg_gender);
        Button btSubmit = (Button) findViewById(R.id.bt_submit);
        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (rgGender.getCheckedRadioButtonId()){
                    case R.id.rb_male :
                        Toast.makeText(TWOHLayoutRadioButton.this,"Clicked male", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb_female :
                        Toast.makeText(TWOHLayoutRadioButton.this,"Clicked female", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    public static Intent newIntent(Context ctx){
        return new Intent(ctx, TWOHLayoutRadioButton.class);
    }

}
