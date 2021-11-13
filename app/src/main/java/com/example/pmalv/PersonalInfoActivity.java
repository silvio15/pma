package com.example.pmalv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class PersonalInfoActivity extends AppCompatActivity {

    private TextInputEditText oInputImePrezime;
    private Button btnSpremiStudenta;
    private String sImePrezime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        oInputImePrezime = (TextInputEditText) findViewById(R.id.tietStudent);

        btnSpremiStudenta = (Button)findViewById(R.id.btnSpremiStudenta);
        btnSpremiStudenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sImePrezime = oInputImePrezime.getText().toString();
                Intent oUpisiPredmetIntent = new Intent(getApplicationContext(), StudentInfoActivity.class);
                oUpisiPredmetIntent.putExtra("imePrezime", sImePrezime);
                startActivity(oUpisiPredmetIntent);
            }

        });
    }

}