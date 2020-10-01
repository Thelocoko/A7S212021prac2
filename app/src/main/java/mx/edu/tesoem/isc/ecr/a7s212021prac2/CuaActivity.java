package mx.edu.tesoem.isc.ecr.a7s212021prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CuaActivity extends AppCompatActivity {

    EditText num1;
    TextView lvlresul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cua);
        num1 = findViewById(R.id.cval);
        lvlresul = findViewById(R.id.cuaresult);
    }
    public void pcalcular(View v) {
        int vnum1 = Integer.parseInt(num1.getText().toString());
        lvlresul.setText("El resultado es: " + (vnum1 * vnum1));
    }
}