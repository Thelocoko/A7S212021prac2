package mx.edu.tesoem.isc.ecr.a7s212021prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RestaActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView lvlresul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
        num1 = findViewById(R.id.valres1);
        num2 = findViewById(R.id.valres2);
        lvlresul = findViewById(R.id.resresul);
    }
    public void pcalcular(View v) {
        int vnum1 = Integer.parseInt(num1.getText().toString());
        int vnum2 = Integer.parseInt(num2.getText().toString());
        lvlresul.setText("El resultado es: " + (vnum2 - vnum1));
    }
}