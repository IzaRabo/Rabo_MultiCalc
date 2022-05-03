package mcm.edu.ph.rabo_multicalc.ConeFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.rabo_multicalc.Formulas;
import mcm.edu.ph.rabo_multicalc.R;

public class ConeVolume extends AppCompatActivity implements View.OnClickListener {


    EditText txtVolRadius, txtVolHeight;
    Button calculate;
    TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone_volume);

        txtVolRadius = findViewById(R.id.txtVolRadius);
        txtVolHeight = findViewById(R.id.txtVolHeight);
        calculate = findViewById(R.id.btnCalcConeVol);
        answer = findViewById(R.id.coneVolumeAnswer);

        calculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        double radius = Double.parseDouble(String.valueOf(txtVolRadius.getText()));
        double height = Double.parseDouble(String.valueOf(txtVolHeight.getText()));

        switch (view.getId()) {
            case R.id.btnCalcConeVol:
                answer.setText(String.valueOf(Formulas.coneVolumeFormula(radius,height)));
                break;
        }

    }
}
