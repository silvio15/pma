package com.example.pmalv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class StudentInfoActivity extends AppCompatActivity {

    private String sNazivPredmeta;
    private TextInputEditText oNazivPredmeta;

    private String sProfesor;
    private TextInputEditText oProfesor;

    private String sAkGod;
    private TextInputEditText oAkGod;

    private String sSatiPredavanja;
    private TextInputEditText oSatiPredavanja;

    private String sSatiLV;
    private TextInputEditText oSatiLV;

    private String sImeStudenta;
    private String sPrezimeStudenta;
    private String sDatumRodenjaStudenta;

    private Button oBtnUpisiPredmet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);
        final Bundle oExtras = getIntent().getExtras();

        sImeStudenta = oExtras.getString("imeStudenta");
        sPrezimeStudenta = oExtras.getString("prezimeStudenta");
        sDatumRodenjaStudenta = oExtras.getString("datumRodenjaStudenta");

        oNazivPredmeta = (TextInputEditText)findViewById(R.id.inptPredmet);
        oProfesor = (TextInputEditText)findViewById(R.id.inptProfesor);
        oAkGod = (TextInputEditText)findViewById(R.id.inptAkGod);
        oSatiPredavanja = (TextInputEditText)findViewById(R.id.inptSatiPredavanja);
        oSatiLV = (TextInputEditText)findViewById(R.id.inptSatiLV);


        oBtnUpisiPredmet = (Button)findViewById(R.id.btnUpisPredmeta);
        oBtnUpisiPredmet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sNazivPredmeta = oNazivPredmeta.getText().toString();
                sProfesor = oProfesor.getText().toString();
                sAkGod = oAkGod.getText().toString();
                sSatiPredavanja = oSatiPredavanja.getText().toString();
                sSatiLV = oSatiLV.getText().toString();


                Intent oUpisiNazivPredmetaIntent = new Intent(getApplicationContext(), SummaryActivity.class);
                oUpisiNazivPredmetaIntent.putExtra("imeStudenta", sImeStudenta);
                oUpisiNazivPredmetaIntent.putExtra("prezimeStudenta", sPrezimeStudenta);
                oUpisiNazivPredmetaIntent.putExtra("datumRodenjaStudenta", sDatumRodenjaStudenta);

                oUpisiNazivPredmetaIntent.putExtra("nazivPredmeta",sNazivPredmeta);
                oUpisiNazivPredmetaIntent.putExtra("profesor",sProfesor);
                oUpisiNazivPredmetaIntent.putExtra("akGod",sAkGod);
                oUpisiNazivPredmetaIntent.putExtra("satiPredavanja",sSatiPredavanja);
                oUpisiNazivPredmetaIntent.putExtra("satiLV",sSatiLV);
                startActivity(oUpisiNazivPredmetaIntent);
            }
        });
    }
}