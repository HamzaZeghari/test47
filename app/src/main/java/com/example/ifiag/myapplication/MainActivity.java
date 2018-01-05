package com.example.ifiag.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvr;
    TextView tva;
    EditText etprix;
    EditText etqte;
    Button btntva;
    Button btnttc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvr = (TextView) findViewById(R.id.tvr);
        tva = (TextView) findViewById(R.id.tva);
        etprix =(EditText) findViewById(R.id.etprix);
        etqte= (EditText) findViewById(R.id.etqte);

    }
    public void gettva(View V){



        double prix= Double.parseDouble(etprix.getText().toString());
        double qte= Double.parseDouble(etqte.getText().toString());

        tvr.setText(Double.toString((prix*qte)*1.2));
        tva.setText("");
    }

    public void getttc(View V){
        double prix= Double.parseDouble(etprix.getText().toString());
        double qte= Double.parseDouble(etqte.getText().toString());


        tva.setText(Double.toString((prix*qte)*0.2));
        tvr.setText(Double.toString((prix*qte) + (prix*qte)*0.2));

    }
}
