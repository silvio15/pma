package com.example.pmalv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class StudentInfoActivity extends AppCompatActivity {

    private String sImePrezime;
    private String sPredmet;
    private TextView oImePrezime;
    private TextInputEditText oInputPredmet;
    private Button btnSpremiStudenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        final Bundle oExtras = getIntent().getExtras();
        sImePrezime = oExtras.getString("imePrezime");

        oInputPredmet = (TextInputEditText) findViewById(R.id.tietPredmet);

        btnSpremiStudenta = (Button)findViewById(R.id.btnSpremiStudenta);
        btnSpremiStudenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sPredmet = oInputPredmet.getText().toString();

                Intent oUpisiPredmetIntent = new Intent(getApplicationContext(), SummaryActivity.class);
                oUpisiPredmetIntent.putExtra("imePrezime", sImePrezime);
                oUpisiPredmetIntent.putExtra("predmet", sPredmet);
                startActivity(oUpisiPredmetIntent);
            }

        });
    }
}