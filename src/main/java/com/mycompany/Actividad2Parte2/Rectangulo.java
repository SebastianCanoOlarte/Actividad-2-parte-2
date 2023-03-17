/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Actividad2Parte2;


public class Rectangulo {
    int base,altura;
    Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    double CalcularArea(){
        return base*altura;
    }
    double CalcularPerimetro(){
        return (2*base)+(2*altura);
    }
}
