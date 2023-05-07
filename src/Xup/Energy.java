package Xup;
import java.lang.Math;

public class Energy extends Physics {
    public float Period(float length)
    {
        return 6.28f * (float)Math.sqrt(length/gravity);
    }

    public float potentialEnergy(float mass,float height)
    {
        return mass * gravity * height;
    }
  
}
