/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Actividad2Parte2;


public class Circulo {
    int radio;
    
    Circulo(int radio){
        this.radio = radio;
    }
    double CalcularArea(){
        return Math.PI*Math.pow(radio,2);
    }
    double CalcularPerimetro(){
        return 2*Math.PI*radio;
    }
}
