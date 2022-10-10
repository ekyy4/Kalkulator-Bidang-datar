package com.example.kalkulatorbd;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    private Button btnHasil;
    private EditText txt_diameter;
    private TextView hasil,hasil2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_2, container, false);

        btnHasil = v.findViewById(R.id.btnHasil);
        txt_diameter = v.findViewById(R.id.txt_diameter);
        hasil = v.findViewById(R.id.hasil);
        hasil2 = v.findViewById(R.id.hasil2);


        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_diameter.getText().toString();

                if (nilai1.isEmpty()){
                    txt_diameter.setError("Isi Data");
                    txt_diameter.requestFocus();
                } else {
                    Double diameter = Double.parseDouble(nilai1);

                    Double luas = 3.14 * (diameter*diameter) * 0.25;
                    hasil.setText(String.valueOf(luas));
                    Double keliling = 3.14 * diameter;
                    hasil2.setText(String.valueOf(keliling));

                }
            }
        });

        return v;
    }
}