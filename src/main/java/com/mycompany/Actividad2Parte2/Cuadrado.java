/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Actividad2Parte2;


public class Cuadrado {
    int lado;
    public Cuadrado(int lado){
        this.lado = lado;
    }
    double CalcularArea(){
        return lado*lado;
    }
    double CalcularPerimetro(){
        return(4*lado);
    }
}
