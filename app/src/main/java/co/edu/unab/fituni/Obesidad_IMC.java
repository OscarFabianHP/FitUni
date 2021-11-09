package co.edu.unab.fituni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Obesidad_IMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obesidad_imc);

        TextView resultado = (TextView) findViewById(R.id.textView3);
        Double imc = MainActivity.getImc();

        resultado.setText(String.format("IMC: %.1f tienes Obesidad", imc ));

        Button botonVolverObesidad = (Button) findViewById(R.id.botonVolverObesidad);

        botonVolverObesidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}