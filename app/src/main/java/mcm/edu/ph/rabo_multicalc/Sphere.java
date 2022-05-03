package mcm.edu.ph.rabo_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mcm.edu.ph.rabo_multicalc.SphereFormulas.SphereArea;
import mcm.edu.ph.rabo_multicalc.SphereFormulas.SphereVolume;

public class Sphere extends AppCompatActivity implements View.OnClickListener {

    Button btnSphereArea,btnSphereVol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        btnSphereArea = findViewById(R.id.btnSphereArea);
        btnSphereVol = findViewById(R.id.btnSphereVolume);

        btnSphereVol.setOnClickListener(this);
        btnSphereArea.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btnSphereArea:
                Intent i1 = new Intent(this, SphereArea.class);
                startActivity(i1);
                break;

            case  R.id.btnSphereVolume:
                Intent i2 = new Intent (this, SphereVolume.class);
                startActivity(i2);
                break;
        }
    }
}