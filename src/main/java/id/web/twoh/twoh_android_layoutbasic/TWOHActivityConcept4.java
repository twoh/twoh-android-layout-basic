package id.web.twoh.twoh_android_layoutbasic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Hafizh Herdi on 1/20/2017.
 */

public class TWOHActivityConcept4 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout4);
        TextView tvData1 = (TextView) findViewById(R.id.tv_data1);
        TextView tvData2 = (TextView) findViewById(R.id.tv_data2);

        /**
         * Kita cek apakah ada Bundle atau tidak
         */
        if(getIntent().getExtras()!=null){
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();
            tvData1.setText(bundle.getString("data1"));
            tvData2.setText(bundle.getString("data2"));
        }else{
            /**
             * Apabila Bundle tidak ada, ambil dari Intent
             */
            tvData1.setText(getIntent().getStringExtra("data1"));
            tvData2.setText(getIntent().getStringExtra("data2"));
        }
    }
}
