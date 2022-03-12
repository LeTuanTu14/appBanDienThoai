package com.example.appdienthoai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView imgv_sp= findViewById(R.id.imageView_sp);
        ImageView xanhngoc= findViewById(R.id.imageView_xanhngoc);
        ImageView den= findViewById(R.id.imageView_den);
        ImageView doo= findViewById(R.id.imageView_do);
        ImageView xanh= findViewById(R.id.imageView_xanh);
        Button xong= findViewById(R.id.button_xong);

        xanhngoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgv_sp.setImageResource(R.drawable.vsbac);
                index= R.drawable.vsbac;
            }
        });

        den.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgv_sp.setImageResource(R.drawable.vsden);
                index= R.drawable.vsden;
            }
        });

        doo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgv_sp.setImageResource(R.drawable.vsdo);
                index= R.drawable.vsdo;
            }
        });

        xanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgv_sp.setImageResource(R.drawable.vsxanh);
                index= R.drawable.vsxanh;
            }
        });

        xong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("mau",index);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}