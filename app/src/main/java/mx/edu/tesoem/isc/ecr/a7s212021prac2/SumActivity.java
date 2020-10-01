package mx.edu.tesoem.isc.ecr.a7s212021prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SumActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView lvlresul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
        lvlresul = findViewById(R.id.resultado);
        num1 = findViewById(R.id.val1);
        num2 = findViewById(R.id.val2);
    }
    public void pcalcular(View v) {
        int vnum1 = Integer.parseInt(num1.getText().toString());
        int vnum2 = Integer.parseInt(num2.getText().toString());
        lvlresul.setText("El resultado es: " + (vnum1 + vnum2));
    }
}