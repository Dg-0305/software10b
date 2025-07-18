import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {



        String Name = "Nicol Salcedo" ;
    String edad = "15" ;
   
    System.out.println(Name);
    System.out.println(edad);
   
   
     int a = 36;
     int b = 14;
     
     int suma = a+b ;
   
   
     System.out.println( "Suma: "+" "+ suma );
     
     
      int x = 7, y = 5;
        System.out.println("Resta: " + (x - y));
     
       int m1 = 7, m2 = 4;
        System.out.println("Multiplicación: " + (m1 * m2));
       
         double d1 = 15, d2 = 3;
        System.out.println("División: " + (d1 / d2));
       
       
          int num = 8;
        System.out.println("Cuadrado: " + (num * num));
       
       
       
         double celsius = 27;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("27°C en Fahrenheit: " + fahrenheit);
       
       
         int base = 10, altura = 5;
        int perimetro = 2 * (base + altura);
        System.out.println("Perímetro del rectángulo: " + perimetro);
       
       
         double radio = 2;
        double pi = 3.14 ;
        double ACirculo = pi * radio * radio;
        System.out.println("Área del círculo: " + ACirculo);
       
       
       
         int años = 3 ;
        int dias = años * 365;
        System.out.println("Años a días: " + dias);
       
       
       int n =8 ;
       int doble= 2*n;
       int triple = 3*n ;
       System.out.println("el doble es " + doble);
       System.out.println("el triple es " + triple);
       
       
       double km = 3;
        System.out.println(km + " km = " + (km * 1000) + " metros");
        System.out.println(km + " km = " + (km * 100000) + " centímetros");
       
       
       
         int lado = 6;
        System.out.println("Área del cuadrado: " + (lado * lado));
        System.out.println("Perímetro del cuadrado: " + (lado * 4));
       
       
         int arista = 6;
        System.out.println("Volumen del cubo: " + (arista * arista * arista));
       
       
       
        double volumen = (4/3) * pi * (radio* 3);
        System.out.println("Volumen de la esfera: " + volumen);
       
       
       int sumaNaturales = 1 + 2 + 3;
        System.out.println("Suma de los tres primeros numeros naturales: " + sumaNaturales);
       
         
        double precio = (35000);
        double descuento = (15);
        double precioFinal = precio - (precio * descuento / 100);
        System.out.println("Precio con descuento: " + precioFinal);
       
       
       
        double total = (270000);
        double propinap = (8);
        double propina = total * propinap / 100;
        System.out.println("Propina: " + propina);
    }
}
