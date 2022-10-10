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

public class Fragment3 extends Fragment {
    private Button btnHasil;
    private EditText txt_panjang, txt_lebar;
    private TextView hasil, hasil2;

    @Override
    public View  onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_3, container, false);

        btnHasil = v.findViewById(R.id.btnHasil);
        txt_panjang = v.findViewById(R.id.txt_panjang);
        txt_lebar = v.findViewById(R.id.txt_lebar);
        hasil = v.findViewById(R.id.hasil);
        hasil2 = v.findViewById(R.id.hasil2);

        btnHasil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nilai1 = txt_panjang.getText().toString();
                String nilai2 = txt_lebar.getText().toString();

                if (nilai1.isEmpty()){
                    txt_panjang.setError("Isi Data");
                    txt_panjang.requestFocus();
                }else if (nilai2.isEmpty()) {
                    txt_lebar.setError("Isi Data");
                    txt_lebar.requestFocus();
                }else {
                    Double panjang = Double.parseDouble(nilai1);
                    Double lebar = Double.parseDouble(nilai2);

                    Double luas = panjang * lebar;
                    hasil.setText(String.valueOf(luas));
                    Double keliling = 2 * panjang + 2 * lebar;
                    hasil2.setText(String.valueOf(keliling));
                }
            }
        });
        return  v;
    }
}