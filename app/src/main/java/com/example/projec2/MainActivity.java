package com.example.projec2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn_tarif);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tarif = new Intent(MainActivity.this, com.example.projec2.tarif.class);
                MainActivity.this.startActivity(tarif);
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn_stata);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stata = new Intent(MainActivity.this, com.example.projec2.stata.class);
                MainActivity.this.startActivity(stata);

            }
        });
    }
}