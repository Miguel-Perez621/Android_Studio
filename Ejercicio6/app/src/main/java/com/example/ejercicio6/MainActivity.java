package com.example.ejercicio6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button_Llamar;
    private Button button_mail;
    private Button button_URL;
    private EditText texto_Telf;
    private EditText texto_Mail;
    private EditText texto_URL;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_Llamar = findViewById(R.id.button_Llamar);
        button_mail = findViewById(R.id.button_Mail);
        button_URL = findViewById(R.id.button_URL);
        texto_Telf = findViewById(R.id.texto_Phone);
        texto_Mail = findViewById(R.id.texto_Mail);
        texto_URL = findViewById(R.id.texto_URL);

        button_Llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tlfIntent = new Intent(Intent.ACTION_DIAL);
                tlfIntent.setData(Uri.parse("tel: " + texto_Telf.getText()));
                startActivity(tlfIntent);


            }


        });

        button_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tlfIntent = new Intent(Intent.ACTION_SENDTO);
                tlfIntent.setData(Uri.parse("mailto: " + texto_Mail.getText()));
                startActivity(tlfIntent);


            }


        });

        button_URL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tlfIntent = new Intent(Intent.ACTION_VIEW);
                tlfIntent.setData(Uri.parse(texto_URL.getText().toString()));
                startActivity(tlfIntent);


            }


        });
    }
}