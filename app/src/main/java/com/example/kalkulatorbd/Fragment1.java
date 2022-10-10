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

public class Fragment1 extends Fragment {
    private Button btnHasil;
    private EditText txt_alas, txt_tinggi;
    private TextView hasil, hasil2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_1, container, false);

        btnHasil = v.findViewById(R.id.btnHasil);
        txt_alas = v.findViewById(R.id.txt_alas);
        txt_tinggi = v.findViewById(R.id.txt_tinggi);
        hasil = v.findViewById(R.id.hasil);
        hasil2 = v.findViewById(R.id.hasil2);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_alas.getText().toString();
                String nilai2 = txt_tinggi.getText().toString();

                if (nilai1.isEmpty()) {
                    txt_alas.setError("Isi Data");
                    txt_alas.requestFocus();
                } else if (nilai2.isEmpty()) {
                    txt_tinggi.setError("Isi Data");
                    txt_tinggi.requestFocus();
                } else {
                    Double alas = Double.parseDouble(nilai1);
                    Double tinggi = Double.parseDouble(nilai2);

                    Double luas = 0.5 * alas * tinggi;
                    hasil.setText(String.valueOf(luas));
                    Double keliling = alas + tinggi * tinggi;
                    hasil2.setText(String.valueOf(keliling));
                }
            }
        });

        return v;
     }
}