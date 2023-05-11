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
    //Define os atributos valor 1 e valor 2
    private double v1;
    private double v2;
    
    //Métodos de acesso getters ans setters
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
    
    //Métodos para cada ação do usuário, resultando em uma operação matemática que retorna um valor do tipo double.
    public double somar() {        //Soma os valores e retorna o resultado
        return v1 + v2;
    }
    
    public double subtrair() {     //Subtrai
        return v1 - v2;
    }
    
    public double multiplicar() {   //Multiplica
        return v1 * v2;
    }
    
    public double dividir() {   //Divide
        return v1 / v2;
    }
}
