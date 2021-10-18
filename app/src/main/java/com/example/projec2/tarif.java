package com.example.projec2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tarif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarif);

        Button btn = (Button) findViewById(R.id.btnback);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(tarif.this, MainActivity.class);
                tarif.this.startActivity(back);
            }
        });
        Button btn2 = (Button) findViewById(R.id.btnkalendary);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back2 = new Intent(tarif.this, kalendary.class);
                tarif.this.startActivity(back2);
            }
        });
    }
}