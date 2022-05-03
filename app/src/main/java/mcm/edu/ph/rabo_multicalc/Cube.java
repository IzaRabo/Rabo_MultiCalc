package mcm.edu.ph.rabo_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mcm.edu.ph.rabo_multicalc.CubeFormulas.CubeArea;
import mcm.edu.ph.rabo_multicalc.CubeFormulas.CubeVolume;

public class Cube extends AppCompatActivity implements View.OnClickListener {

    Button btnCubeArea, btnCubeVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        btnCubeArea = findViewById(R.id.btnCubeArea);
        btnCubeVolume = findViewById(R.id.btnCubeVolume);

        btnCubeArea.setOnClickListener(this);
        btnCubeVolume.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btnCubeArea:
                Intent intent1 = new Intent(this, CubeArea.class);
                startActivity(intent1);
                break;

            case R.id.btnCubeVolume:
                Intent intent2 = new Intent(this, CubeVolume.class);
                startActivity(intent2);
                break;


        }
    }
}