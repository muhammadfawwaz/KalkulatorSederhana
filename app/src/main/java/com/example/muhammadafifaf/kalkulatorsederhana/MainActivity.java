package com.example.muhammadafifaf.kalkulatorsederhana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText bil1;
    private EditText bil2;
    private Button tambah;
    private Button kurang;
    private Button kali;
    private Button bagi;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bil1 = findViewById(R.id.bil1);
        bil2 = findViewById(R.id.bil2);
        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
        hasil = findViewById(R.id.output);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambah();
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kurang();
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kali();
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bagi();
            }
        });
    }

    public void tambah() {
        hasil.setText(String.valueOf(Integer.parseInt(bil1.getText().toString()) + Integer.parseInt(bil2.getText().toString())));
    }

    public void kurang() {
        hasil.setText(String.valueOf(Integer.parseInt(bil1.getText().toString()) - Integer.parseInt(bil2.getText().toString())));
    }

    public void kali() {
        hasil.setText(String.valueOf(Integer.parseInt(bil1.getText().toString()) * Integer.parseInt(bil2.getText().toString())));
    }

    public void bagi() {
        hasil.setText(String.valueOf(Integer.parseInt(bil1.getText().toString()) / Integer.parseInt(bil2.getText().toString())));
    }
}
