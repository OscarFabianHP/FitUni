package co.edu.unab.fituni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Normal_IMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_imc);

        TextView resultado = (TextView) findViewById(R.id.textView);
        Double imc = MainActivity.getImc();

        resultado.setText(String.format("IMC: %.1f tienes Peso Normal", imc ));

        Button botonVolverNormal = (Button) findViewById(R.id.botonVolverNormal);

        botonVolverNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}