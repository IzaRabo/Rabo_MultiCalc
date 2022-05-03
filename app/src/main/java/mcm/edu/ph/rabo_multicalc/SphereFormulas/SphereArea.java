package mcm.edu.ph.rabo_multicalc.SphereFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.Normalizer;

import mcm.edu.ph.rabo_multicalc.Formulas;
import mcm.edu.ph.rabo_multicalc.R;

public class SphereArea extends AppCompatActivity implements View.OnClickListener {

    EditText txtRadius;
    Button calculate;
    TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_area);

        txtRadius = findViewById(R.id.txtSphereRadius);
        calculate = findViewById(R.id.btnCalcSphereArea);
        answer = findViewById(R.id.sphereAreaAnswer);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        double radius = Double.parseDouble(String.valueOf(txtRadius.getText()));

        switch (view.getId()) {
            case R.id.btnCalcSphereArea:
            answer.setText(String.valueOf(Formulas.sphereAreaFormula(radius)));
            break;

        }


    }
}