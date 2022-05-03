package mcm.edu.ph.rabo_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mcm.edu.ph.rabo_multicalc.CylinderFormulas.CylinderArea;
import mcm.edu.ph.rabo_multicalc.CylinderFormulas.CylinderVolume;

public class Cylinder extends AppCompatActivity implements View.OnClickListener{

    Button btnCylinderArea, btnCylinderVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        btnCylinderArea = findViewById(R.id.btnCylinderArea);
        btnCylinderVolume = findViewById(R.id.btnCylinderVolume);

        btnCylinderVolume.setOnClickListener(this);
        btnCylinderArea.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btnCylinderArea:
                Intent intent1 = new Intent(this, CylinderArea.class);
                startActivity(intent1);
                break;

            case R.id.btnCylinderVolume:
                Intent intent2 = new Intent(this, CylinderVolume.class);
                startActivity(intent2);
                break;
        }
    }
}