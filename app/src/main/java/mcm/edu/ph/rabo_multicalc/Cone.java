package mcm.edu.ph.rabo_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mcm.edu.ph.rabo_multicalc.ConeFormulas.ConeArea;
import mcm.edu.ph.rabo_multicalc.ConeFormulas.ConeVolume;

public class Cone extends AppCompatActivity implements View.OnClickListener {

    Button btnConeArea,btnConeVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);

        btnConeArea = findViewById(R.id.btnConeArea);
        btnConeVolume = findViewById(R.id.btnConeVolume);

        btnConeArea.setOnClickListener(this);
        btnConeVolume.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch  (v.getId()) {

            case R.id.btnConeArea:
                Intent intent1 = new Intent(this, ConeArea.class);
                startActivity(intent1);
                break;

            case R.id.btnConeVolume:
                Intent intent2 = new Intent(this, ConeVolume.class);
                startActivity(intent2);
                break;


        }
    }
}