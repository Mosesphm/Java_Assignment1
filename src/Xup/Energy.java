package Xup;
import java.lang.Math;

public class Energy extends Physics {

    public float potentialEnergy(float mass,float height)
    {
        return mass * gravity * height;
    }
}
