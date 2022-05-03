package mcm.edu.ph.rabo_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mcm.edu.ph.rabo_multicalc.OctahedronFormulas.OctahedronArea;
import mcm.edu.ph.rabo_multicalc.OctahedronFormulas.OctahedronVolume;

public class Octahedron extends AppCompatActivity implements View.OnClickListener {

    Button btnArea,btnVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octahedron);

        btnArea = findViewById(R.id.btnOctaArea);
        btnVolume = findViewById(R.id.btnOctaVol);

        btnArea.setOnClickListener(this);
        btnVolume.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btnOctaArea:
                Intent i1 = new Intent(this, OctahedronArea.class);
                startActivity(i1);
                break;

            case R.id.btnOctaVol:
                Intent i2 = new Intent(this, OctahedronVolume.class);
                startActivity(i2);
                break;
        }


    }
}