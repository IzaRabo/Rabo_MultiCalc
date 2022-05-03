package mcm.edu.ph.rabo_multicalc.CubeFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.rabo_multicalc.Formulas;
import mcm.edu.ph.rabo_multicalc.R;

public class CubeArea extends AppCompatActivity implements View.OnClickListener {

    EditText txtEdge;
    Button calculate;
    TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube_area);

        txtEdge = findViewById(R.id.txtEdge);
        calculate = findViewById(R.id.btnCalcCubeArea);
        answer = findViewById(R.id.cubeAreaAnswer);

        calculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        double edge = Double.parseDouble(String.valueOf(txtEdge.getText()));

        switch (view.getId()) {
            case R.id.btnCalcCubeArea:
                answer.setText(String.valueOf(Formulas.cubeAreaFormula(edge)));
                break;
        }



    }
}