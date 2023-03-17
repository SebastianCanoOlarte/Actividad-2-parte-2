/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Actividad2Parte2;


public class TrianguloRectangulo {
    int base,altura;
    public TrianguloRectangulo(int base,int altura){
        this.base = base;
        this.altura = altura;
    }
    double CalcularArea(){
        return (base*altura/2);
    }
    double CalcularHipotenusa(){
        return Math.pow(base*base+altura*altura,0.5);
    }
    double CalcularPerimetro(){
        return (base+altura+CalcularHipotenusa());
    }
    void DeterminarTipoTriangulo(){
        if((base==altura)&&(base==CalcularHipotenusa())&&(altura==CalcularHipotenusa())){
            System.out.println("Es un triangulo equilatero");
        }
        else if((base!=altura)&&(base!=CalcularHipotenusa())&&(altura!=CalcularHipotenusa())){
            System.out.println("Es un triangulo escaleno");
        }
        else{
            System.out.println("Es un triangulo isosceles");
        }
    }
}
