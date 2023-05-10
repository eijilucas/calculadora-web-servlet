/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author lucas
 */
public class Calculadora {
    private double v1;
    private double v2;
    
    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }
    
    public double somar() {
        return v1 + v2;
    }
    
    public double subtrair() {
        return v1 - v2;
    }
    
    public double multiplicar() {
        return v1 * v2;
    }
    
    public double dividir() {
        return v1 / v2;
    }
}
