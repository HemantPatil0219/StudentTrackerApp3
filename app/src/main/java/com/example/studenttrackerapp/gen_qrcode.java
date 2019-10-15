package com.example.studenttrackerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class gen_qrcode extends AppCompatActivity {
private Button generate;
private EditText input_enrollment;
private ImageView qr_code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen_qrcode);
        generate = findViewById(R.id.gen_qr);
        input_enrollment = findViewById(R.id.input_enroll);
        qr_code = findViewById(R.id.qrimage);
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GenerateQRFunction();
            }
        });
    }
        private void GenerateQRFunction(){
            String text=input_enrollment.getText().toString().trim();
            try {
                BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                Bitmap bitmap = barcodeEncoder.encodeBitmap(text, BarcodeFormat.QR_CODE, 400, 400);
                qr_code.setImageBitmap(bitmap);
        }
            catch (Exception e){

        }
    }

    public void btn_gen_qr(View view) {
        startActivity(new Intent(getApplicationContext(),gen_qrcode.class));
    }
}
