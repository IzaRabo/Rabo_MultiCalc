package mcm.edu.ph.rabo_multicalc.OctahedronFormulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mcm.edu.ph.rabo_multicalc.Formulas;
import mcm.edu.ph.rabo_multicalc.R;

public class OctahedronVolume extends AppCompatActivity implements View.OnClickListener {

    EditText txtEdge;
    Button calculate;
    TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octahedron_volume);

        txtEdge = findViewById(R.id.txtOctaVol);
        calculate = findViewById(R.id.btnCalcOctaVol);
        answer = findViewById(R.id.octaVolAnswer);

        calculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        double edge = Double.parseDouble(String.valueOf(txtEdge.getText()));

        switch (view.getId()){
            case R.id.btnCalcOctaVol:
                answer.setText(String.valueOf(Formulas.octahedronVolumeFormula(edge)));
                break;
        }


    }
}