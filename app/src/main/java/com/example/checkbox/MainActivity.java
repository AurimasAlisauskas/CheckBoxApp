package com.example.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox arTikraiNoriu;
    private CheckBox arManReikia;

    private Button verdiktas;
    private TextView rezultatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arTikraiNoriu = findViewById(R.id.arTikraiNoriuID);
        arManReikia = findViewById(R.id.arManReikiaID);

        verdiktas = findViewById(R.id.showButtonID);
        rezultatas = findViewById(R.id.resultID);

        verdiktas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                StringBuilder stringBuilder = new StringBuilder();
////                stringBuilder.append(arTikraiNoriu.getText().toString() + " verdiktas yra: " + arTikraiNoriu.isChecked() + "\n");
////                stringBuilder.append(arManReikia.getText().toString() + " verdiktas yra: " + arManReikia.isChecked() + "\n");
////
////                rezultatas.setText(stringBuilder);

                if (arTikraiNoriu.isChecked() && arManReikia.isChecked()){
                    rezultatas.setText("PIRK!");
                }else {
                    rezultatas.setText("Tau to nereikia");
                }

            }
        });

    }
}
