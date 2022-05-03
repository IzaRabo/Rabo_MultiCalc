package mcm.edu.ph.rabo_multicalc.CylinderFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import mcm.edu.ph.rabo_multicalc.Formulas;
import mcm.edu.ph.rabo_multicalc.R;

public class CylinderArea extends AppCompatActivity implements View.OnClickListener{

    EditText txtHeight, txtRadius;
    Button calculate;
    TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder_area);

        txtHeight = findViewById(R.id.txtHeightCy);
        txtRadius = findViewById(R.id.txtRadiusCy);
        calculate = findViewById(R.id.btnCalcCylinderArea);
        answer = findViewById(R.id.cylinderAreaAnswer);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        double radius = Double.parseDouble(String.valueOf(txtRadius.getText()));
        double height = Double.parseDouble(String.valueOf(txtHeight.getText()));

        switch (view.getId()) {
            case R.id.btnCalcCylinderArea:
                answer.setText(String.valueOf(Formulas.cylinderAreaFormula(radius,height)));
                break;
        }


    }
}