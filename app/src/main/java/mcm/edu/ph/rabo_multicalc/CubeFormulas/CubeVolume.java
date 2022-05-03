package mcm.edu.ph.rabo_multicalc.CubeFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.rabo_multicalc.Formulas;
import mcm.edu.ph.rabo_multicalc.R;

public class CubeVolume extends AppCompatActivity implements View.OnClickListener{

    EditText txtVolumeEdge;
    Button calculate;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube_volume);

        txtVolumeEdge = findViewById(R.id.txtVolumeEdge);
        calculate = findViewById(R.id.btnCalcCubeVolume);
        answer = findViewById(R.id.cubeVolumeAnswer);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        double edge = Double.parseDouble(String.valueOf(txtVolumeEdge.getText()));

        switch (view.getId()) {
            case R.id.btnCalcCubeVolume:
                answer.setText(String.valueOf(Formulas.cubeVolumeFormula(edge)));
                break;
        }
    }
}