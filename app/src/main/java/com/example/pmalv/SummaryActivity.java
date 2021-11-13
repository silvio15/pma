package com.example.pmalv;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    private String sImePrezime;
    private String sPredmet;
    private TextView oImePrezime;
    private TextView oPredmet;
    private Button oBtnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        final Bundle oExtras = getIntent().getExtras();
        sImePrezime = oExtras.getString("imePrezime");
        sPredmet =oExtras.getString("predmet");

        oImePrezime = (TextView)findViewById(R.id.tvImePrezime);
        oImePrezime.setText(sImePrezime);
        oPredmet = (TextView)findViewById(R.id.tvPredmet);
        oPredmet.setText(sPredmet);

        oBtnHome= (Button)findViewById(R.id.btnHome);

        oBtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oUpisiPredmetIntent = new Intent(getApplicationContext(), PersonalInfoActivity.class);
                oUpisiPredmetIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(oUpisiPredmetIntent);
            }
        });

    }
}