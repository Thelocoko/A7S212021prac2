package mx.edu.tesoem.isc.ecr.a7s212021prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    public void Psumar(View view) {
        Intent intent = new Intent(this, SumActivity.class);
        startActivity(intent);
    }
    public void Prestar(View view) {
        Intent intent = new Intent(this, RestaActivity.class);
        startActivity(intent);
    }
    public void Pmultiplicar(View view) {
        Intent intent = new Intent(this, MultActivity.class);
        startActivity(intent);
    }
    public void Pdividir(View view) {
        Intent intent = new Intent(this, DivActivity.class);
        startActivity(intent);
    }
    public void Pcuadrado(View view) {
        Intent intent = new Intent(this, CuaActivity.class);
        startActivity(intent);
    }
    public void PPo(View view) {
        Intent intent = new Intent(this, PoActivity.class);
        startActivity(intent);
    }
}