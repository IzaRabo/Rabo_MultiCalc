package mcm.edu.ph.rabo_multicalc.CylinderFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.rabo_multicalc.Formulas;
import mcm.edu.ph.rabo_multicalc.R;

public class CylinderVolume extends AppCompatActivity implements View.OnClickListener {

    EditText txtHeight, txtRadius;
    Button calculate;
    TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder_volume);

        txtHeight = findViewById(R.id.txtCylinderHeight);
        txtRadius = findViewById(R.id.txtCylinderRadius);
        calculate = findViewById(R.id.btnCalcCylinderVol);
        answer = findViewById(R.id.cylinderVolAnswer);

        calculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        double radius = Double.parseDouble(String.valueOf(txtRadius.getText()));
        double height = Double.parseDouble(String.valueOf(txtHeight.getText()));

        switch (view.getId()){
            case R.id.btnCalcCylinderVol:
                answer.setText(String.valueOf(Formulas.cylinderVolumeFormula(radius,height)));
                break;
        }

    }
}