

1.imprimir nombre y edad

String nombre = "paula";
        int edad = 15;
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
       
2.Suma de dos números
        int a = 5, b = 7;
        System.out.println("Suma: " + (a + b));
       
3.Resta de dos números ingresados
        int s = 10 , f = 5;
        System.out.println("Resta: " + (s - f));

4.Multiplicacion       
         int m1 = 6, m2 = 4;
        System.out.println("Multiplicación: " + (m1 * m2));

5.Divicion     
         double d1 = 10, d2 = 3;
        System.out.println("División: " + (d1 / d2));

6.Cuadrado de un número     
         int num = 8;
        System.out.println("Cuadrado: " + (num * num));

7.Celsius a Fahrenheit     
         double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("25°C en Fahrenheit: " + fahrenheit);

8.Perímetro de un rectángulo    
         int base = 10, altura = 5;
        int perimetroRect = 2 * (base + altura);
        System.out.println("Perímetro del rectángulo: " + perimetroRect);

9.Área de un círculo
        double radio = 4;
        double areaCirculo = Math.PI * radio * radio;
        System.out.println("Área del círculo: " + areaCirculo);

10.Años a días
         int años = 2;
        int dias = años * 365;
        System.out.println("Años a días: " + dias);

11.Doble y triple de un número       
         int n =8 ;
       int doble= n*n;
       int triple = n*n*n ;
       System.out.println("el doble es " + doble);
       System.out.println("el triple es " + triple);

12.Kilómetros a metros y centímetros
        double km = 3.5;
        System.out.println(km + " km = " + (km * 1000) + " metros");
        System.out.println(km + " km = " + (km * 100000) + " centímetros");

13. Área y perímetro de un cuadrado
        int lado = 6;
        System.out.println("Área del cuadrado: " + (lado * lado));
        System.out.println("Perímetro del cuadrado: " + (lado * 4));

14. Área y perímetro de un cuadrado 
         int arista = 5;
        System.out.println("Volumen del cubo: " + (arista * arista * arista));

15.Volumen de una esfera  
           double volumenEsfera = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("Volumen de la esfera: " + volumenEsfera);
       
16.Sumar los tres primeros números naturales
        int sumaNaturales = 1 + 2 + 3;
        System.out.println("Suma de los tres primeros naturales: " + sumaNaturales);

17.Calcular descuento   
         double precio = (55000);
        double descuento = (10);
        double precioFinal = precio - (precio * descuento / 100);
        System.out.println("Precio con descuento: " + precioFinal);

18.Calcular propina
         double total = (150000);
        double propinap = (5);
        double propina = total * propinap / 100;
        System.out.println("Propina: " + propina);