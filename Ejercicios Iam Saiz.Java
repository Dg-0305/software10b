
public class IamJoelSaizDiaz {
    public static void main(String[] args) {
       
        // Imprimir tu nombre y edad
        System.out.println("Iam Joel");
        System.out.println("16 años");

        // Calcular la suma de dos números
        int a = 5;
        int b = 8;
        int suma = a + b;
        System.out.println("Suma de 5 + 8 = " + suma);

        // Restar dos números ingresados por el usuario
        System.out.print("Ingresa el primer número para restar: ");
        int r1 = sc.nextInt();
        System.out.print("Ingresa el segundo número para restar: ");
        int r2 = sc.nextInt();
        int resta = r1 - r2;
        System.out.println("Resultado de la resta = " + resta);

        // Multiplicar dos números y mostrar el resultado
        int m1 = 6;
        int m2 = 4;
        int multiplicacion = m1 * m2;
        System.out.println("Multiplicación de 6 * 4 = " + multiplicacion);

        // Dividir dos números y mostrar el cociente
        double d1 = 10;
        double d2 = 2;
        double division = d1 / d2;
        System.out.println("División de 10 / 2 = " + division);

        // Calcular el cuadrado de un número
        int numero = 5;
        int cuadrado = numero * numero;
        System.out.println("El cuadrado de 5 es = " + cuadrado);

        // Convertir grados Celsius a Fahrenheit
        double celsius = 25;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("25°C en Fahrenheit = " + fahrenheit);

        // Calcular el perímetro de un rectángulo
        int base = 10;
        int altura = 5;
        int perimetroRect = 2 * (base + altura);
        System.out.println("Perímetro del rectángulo = " + perimetroRect);

        // Calcular el área de un círculo
        double radio = 7;
        double areaCirculo = Math.PI * radio * radio;
        System.out.println("Área del círculo = " + areaCirculo);

        // Convertir años a días
        int años = 3;
        int dias = años * 365;
        System.out.println("3 años equivalen a " + dias + " días");

        // Calcular el doble y el triple de un número ingresado
        System.out.print("Ingresa un número para calcular doble y triple: ");
        System.out.println("Doble = " + (n * 2));
        System.out.println("Triple = " + (n * 3));

        // Convertir kilómetros a metros y centímetros
        double km = 1.5;
        double metros = km * 1000;
        double centimetros = metros * 100;
        System.out.println("1.5 km = " + metros + " metros");
        System.out.println("1.5 km = " + centimetros + " centímetros");

        // Calcular área y perímetro de un cuadrado
        int lado = 4;
        int areaCuadrado = lado * lado;
        int perimetroCuadrado = lado * 4;
        System.out.println("Área del cuadrado = " + areaCuadrado);
        System.out.println("Perímetro del cuadrado = " + perimetroCuadrado);

        // Calcular el volumen de un cubo
        int ladoCubo = 3;
        int volumenCubo = ladoCubo * ladoCubo * ladoCubo;
        System.out.println("Volumen del cubo = " + volumenCubo);

        // Calcular el volumen de una esfera
        double r = 2.0;
        double volumenEsfera = (4.0/3.0) * Math.PI * Math.pow(r, 3);
        System.out.println("Volumen de la esfera = " + volumenEsfera);

        // Sumar los tres primeros números naturales
        int sumaNaturales = 1 + 2 + 3;
        System.out.println("Suma de 1 + 2 + 3 = " + sumaNaturales);

        // Calcular descuento aplicado a una compra
        double precio = 1000;
        double descuento = 15; // %
        double precioFinal = precio - (precio * descuento / 100);
        System.out.println("Precio final con 15% de descuento = " + precioFinal);

        // Calcular propina en un restaurante
        double totalCuenta = 500;
        double propinaPorcentaje = 10;
        double propina = totalCuenta * propinaPorcentaje / 100;
        System.out.println("Propina del 10% sobre $500 = " + propina);
        
    }
}





