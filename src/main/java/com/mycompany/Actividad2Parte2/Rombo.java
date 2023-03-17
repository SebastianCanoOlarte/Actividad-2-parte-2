/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Actividad2Parte2;


public class Rombo {
    int lado,D,d;
    Rombo(int lado,int D,int d){
        this.lado = lado;
        this.D = D;
        this.d = d;
    }
    double CalcularArea(){
        return ((D*d)/2);
    }
    double CalcularPerimetro(){
        return 4*lado;
    }
    
    
}
