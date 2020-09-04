package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText e = findViewById(R.id.editTextNumber);
                String x = e.getText().toString();
                String msg = "";
                Boolean check = false;
                if(x.equalsIgnoreCase("1111111111111") || x.equalsIgnoreCase("2222222222222")){
                    msg = "คุณเป็นผู้มีสิทธิเลือกตั้ง";
                    check = true;
                }else if(x.length() == 13){
                    msg = "คุณไม่มีสิทธิเลือกตั้ง";
                    check = true;
                }else{
                    Toast.makeText(MainActivity2.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG).show();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
                builder.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                builder.setMessage(msg);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                if(check){
                    builder.show();
                }
            }
        });
    }
}