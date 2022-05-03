package mcm.edu.ph.rabo_multicalc;

import com.google.android.material.internal.ThemeEnforcement;

import java.lang.Math;
public class Formulas {

    double x;
    double y;

    public static double coneAreaFormula (double radius, double height){

        return (Math.PI*radius)* (radius + Math.sqrt((height*height) + (radius*radius)));
    }
    public static double coneVolumeFormula (double radius, double height){

        return Math.PI * (radius*radius) * height/3;
    }

    public static double cubeAreaFormula (double edge) {

        return 6 * edge*edge;
    }

    public static double cubeVolumeFormula (double edge) {

        return edge*edge*edge;
    }

    public static double cylinderAreaFormula (double radius, double height) {

        return 2 * Math.PI * radius * height + 2 * Math.PI * radius*radius;
    }

    public static double cylinderVolumeFormula (double radius, double height) {

        return Math.PI * radius*radius*height;
    }

    public static double sphereAreaFormula (double radius) {

        return 4 * Math.PI * radius*radius;
    }

    public static double sphereVolumeFormula (double radius) {

        return Math.PI * 4/3 * radius*radius*radius;
    }

    public static double octahedronAreaFormula (double edge) {

        return (2 * Math.sqrt(3) * edge*edge);
    }

    public static double octahedronVolumeFormula (double edge) {

        return Math.sqrt(2)/3 * edge*edge*edge;
    }

}
