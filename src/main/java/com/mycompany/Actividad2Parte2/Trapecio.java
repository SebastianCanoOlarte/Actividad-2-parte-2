/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Actividad2Parte2;


public class Trapecio {
    int altura,B,b,lado;
    Trapecio(int altura, int B, int b, int lado){
        this.altura = altura;
        this.B = B;
        this.b = b;
        this.lado = lado;
    }
    double CalcularArea(){
        return (altura/2)*(B+b);
    }
    double CalcularPerimetro(){
        return B+b+(2*lado);
    }
}
