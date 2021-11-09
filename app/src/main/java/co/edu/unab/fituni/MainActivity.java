package co.edu.unab.fituni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Intent irA;
    private static Double imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonCalcular = (Button) findViewById(R.id.button2);

        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent ir = irA();
               startActivity(ir);
            }
        });
    }

    private Intent irA(){
        Double peso=0.0;
        Double estatura=0.0;
        EditText estaturaText;
        EditText pesoText;

        estaturaText = (EditText) findViewById(R.id.editTextNumber);
        pesoText = (EditText) findViewById(R.id.editTextNumber2);

        estatura = Double.parseDouble(estaturaText.getText().toString().trim())/100;
        peso = Double.parseDouble(pesoText.getText().toString().trim());
        imc = peso/(Math.pow(estatura, 2));

        if(imc<18.5)
            irA = new Intent(MainActivity.this, BajoPeso_IMC.class);
        else if(imc>=18.5 && imc<=24.9)
            irA = new Intent(MainActivity.this, Normal_IMC.class);
        else if(imc>=25.0 && imc<=29.9)
            irA = new Intent(MainActivity.this, Sobrepeso_IMC.class);
        else if(imc>30.0)
            irA = new Intent(MainActivity.this, Obesidad_IMC.class);

        return irA;
    }

    public static Double getImc() {
        return imc;
    }
}