package co.edu.unab.fituni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sobrepeso_IMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobrepeso_imc);

        TextView resultado = (TextView) findViewById(R.id.textView2);
        Double imc = MainActivity.getImc();

        resultado.setText(String.format("IMC: %.1f tienes Sobrepeso", imc ));

        Button botonVolverSobrePeso = (Button) findViewById(R.id.botonVolveSobrePeso);

        botonVolverSobrePeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
     }
}