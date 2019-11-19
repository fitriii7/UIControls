package com.example.tutor2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ActivityEditText extends Activity {

    EditText eText;
    Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_edittext);

        eText = (EditText) findViewById(R.id.etxId);
        btn = (Button) findViewById(R.id.btnId);
// MENENTUKAN AKSI SAAT ELEMEN TOMBOL DIBERI AKSI
        btn.setOnClickListener(new View.OnClickListener() {
            // RESPON UNTUK AKSI KLIK PADA TOMBOL
            public void onClick(View v) {
// MENYIMPAN NILAI TEXT DARI UI KOMPONEN KE VARIABEL
                String str = eText.getText().toString();
// MENAMPILKAN PESAN TOAST
                Toast msg = Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG);
                msg.show();
            }
        });
    }

}

