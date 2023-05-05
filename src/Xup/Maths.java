package Xup;

import java.sql.SQLOutput;

public class Maths {
    private float pi = 22/7;

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }


    public float multiply(float number1, float number2){
        return number1 * number2;
    }

    float divide(int number1,int number2){
        return number1 / number2;
    }
}
