package co.edu.unab.fituni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BajoPeso_IMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bajo_peso_imc);

        TextView resultado = (TextView) findViewById(R.id.textView4);
        Double imc = MainActivity.getImc();

        resultado.setText(String.format("IMC: %.1f tienes Bajo peso", imc ));

        Button botonVolverBajo = (Button) findViewById(R.id.botonVolverBajo);

        botonVolverBajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}