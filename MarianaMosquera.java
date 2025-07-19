public class Marianamosqueraa {

    public static void main(String[] args) {
        
       String Name = "Mariana Mosquera" ;
        System.out.println("Mariana Mosquera");
         
        int edad=16; //el radio del circulo
        System.out.println(edad);
        
        int a=20;
        int b=5;
        int suma=a+b;
        int resta=a-b;
        int multiplicacion= a*b;
        int division= a/b;
      double gradoCel=1.9;
        double gradofarent=((gradoCel)*(1.8)+32);
        double valor1=2.5; //este es el ancho del rectanguo
        double valor2=3.8; //es la altura 
        double perimetrorec=(2*valor1)+(2*valor2);
        long cuadrado=edad*edad;
        double areaCirculo=((3.14159)*cuadrado);
        int año=4; 
        int dias = año*365;
               
        int doble= 2*año;
        int triple=3*año;
       double kilometros = 2.5;
       double metros = kilometros * 1000;
       double centimetros = kilometros *1000 * 100;
       
       int lado = 3;
       int area = lado * lado;
       int perimetro = 4 * lado;
       
       double Lado = 5.0 ;
       double volumen = Lado * Lado * Lado;
      
      double radio = 6.0 ;
       double VOLUMEN= (4/3)* 3.14159 *(radio*radio*radio);
       
       int Suma = 1 + 2 + 3; //sumar los tres primeros numeros naturales 
       
       double totaldecompra = (100.000); //precio del producto
      double descuentoaplicado = (0.5); //descuento en %
      double Totalapagar= totaldecompra - (totaldecompra* descuentoaplicado)/100;
      
       
       double montocuenta=60000;
       double porcentajepropina=10;
               double Porcentaje2=(porcentajepropina)/100;
               double propina= montocuenta*Porcentaje2;
               double  totalpagar = montocuenta + propina;
       
        System.out.println("este es el valor de la suma de a y b"+"  "+ suma);
        System.out.println("este es el valor de la resta de a y b"+"  "+ resta);
     System.out.println("este es el valor de la multiplicacion de a y b"+"  "+ multiplicacion);
     System.out.println("este es el valor de la division de a y b"+"  "+ division);
   
     System.out.println("calcular el cuadrado de un numero.");
     System.out.println(edad*edad);
     
     System.out.println("convertir grafos celsius a Fahrenheit");
     System.out.println(((gradoCel)* (1.8) +32));
     
     System.out.println("calcular el perimetro de un rectangulo."); 
     System.out.println(perimetrorec);
     
     System.out.println("calcular el area de un circulo.");
     System.out.println(areaCirculo);
  
     
     System.out.println("convertir años a dias");
     System.out.println(año + "años equivale a" + dias + "dias( sin contar años bisiestos).");
      
     System.out.println("calcular el doble y triple de un numero ingresado.");
     System.out.println(doble);
      System.out.println(triple);

       System.out.println("convertir kilometros a metros y centimetros.");
       System.out.println(kilometros + " kilometros son:");
       System.out.println(metros + " metros");
       System.out.println(centimetros + " centimetros");
               
       System.out.println("calcular el area y el perimetro de un cuadrado");
       System.out.println("lado del cuadrado: " + lado);
       System.out.println("area del cuadrado: " + area);
       System.out.println("perimetro del cuadrado: " + perimetro);
       
       System.out.println("calcular el volumen de un cubo");
        System.out.println("el volumen del cubo es: " + volumen);
       
        System.out.println("calcular el volumen de una esfera");
        System.out.println("el volumen de la esfera es: " + VOLUMEN);
        
        System.out.println("sumar los tres primeros numeros naturales");
       System.out.println(" la suma de los tres primeros numeros naturales es: " + Suma);
       
       System.out.println("calcular el descuento aplicado a una compra (precio y % de descuento).");
       System.out.println("precio con descuentoaplicado: " + Totalapagar );
      
       
       System.out.println("calcular la propina a dejar en un restaurante");
       System.out.println("el monto de la cuenta es:" + montocuenta);
       System.out.println(" el totalpagar es:" + porcentajepropina + "%");
      }
    }
