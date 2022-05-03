package mcm.edu.ph.rabo_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnCube,btnCylinder,btnCone,btnSphere,btnSquare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCone = findViewById(R.id.btnCone);
        btnCube = findViewById(R.id.btnCube);
        btnCylinder = findViewById(R.id.btnCylinder);
        btnSphere = findViewById(R.id.btnSphere);
        btnSquare = findViewById(R.id.btnSquare);


        btnCone.setOnClickListener(this);
        btnCube.setOnClickListener(this);
        btnCylinder.setOnClickListener(this);
        btnSphere.setOnClickListener(this);
        btnSquare.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch  (v.getId()) {

            case R.id.btnCone:
                Intent intent1 = new Intent(this,Cone.class);
                startActivity(intent1);
                break;
            case R.id.btnCube:
                Intent intent2 = new Intent(this,Cube.class);
                startActivity(intent2);
                break;
            case R.id.btnCylinder:
                Intent intent3 = new Intent(this,Cylinder.class);
                startActivity(intent3);
                break;
            case R.id.btnSphere:
                Intent intent4 = new Intent(this,Sphere.class);
                startActivity(intent4);
                break;
            case R.id.btnSquare:
                Intent intent5 = new Intent(this, Octahedron.class);
                startActivity(intent5);
                break;
        }


    }
}