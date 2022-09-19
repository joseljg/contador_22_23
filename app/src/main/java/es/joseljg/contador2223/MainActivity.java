package es.joseljg.contador2223;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarMensaje(View view) {
        Toast.makeText(this,"hola a todos", Toast.LENGTH_LONG).show();
    }

    public void contarNumeros(View view) {

    }


    public void resetearContador(View view) {

    }

}