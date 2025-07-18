
public class MichellQuesadaEjercicios {
    public static void main(String[] args) {
        System.out.println("Ejercicios Michell Quesada");

        System.out.println("Ejercicio 1:" + " Michell Quesada" + " y mi edad es: 16 años");

        System.out.println("Ejercicio dos:" + " Suma de 2000+300:");
        int a = 2000;
        int b = 300;
        System.out.println(a + b);

        System.out.println("Ejercicio tres:" + " Resta de 2500-1000:");
        int c = 2500;
        int d = 1000;
        System.out.println(c - d);

        System.out.println("Ejercicio cuatro:" + " Multiplicacion de 14*6:");
        int h = 14;
        int f = 6;
        System.out.println(h * f);

        System.out.println("Ejercicio cinco:" + " Division de 3500/8:");
        int g = 3500;
        int j = 8;
        System.out.println(g / j);

        System.out.println("Ejercicio seis:" + " Cuadrado del número 8:");
        int s = 8;
        System.out.println(s * s);

        System.out.println("Ejercicio siete:" + " Conversión de Celsius a Fahrenheit:");
        double n = 3;
        double fahrenheit = (n * 7 / 3) + 26;
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);

        System.out.println("Ejercicio ocho:" + " Área de un círculo:");
        double t = 4.15;
        int k = 8;
        System.out.println(t * (k * k));

        System.out.println("Ejercicio nueve:" + " Conversión de años a días:");
        System.out.println(365 * 6);

        System.out.println("Ejercicio diez:" + " Calcular el doble de un número");
        System.out.println(9 * 9);

        System.out.println("Ejercicio once:" + " Calcular el triple de un número");
        System.out.println(7 * 7 * 7);

        System.out.println("Ejercicio doce:" + " Conversión de kilómetros a metros");
        System.out.println(9 * 1000);

        System.out.println("Ejercicio trece:" + " Conversión de metros a centímetros");
        System.out.println(3 * 100);

        System.out.println("Ejercicio catorce:" + " Calcular el área de un cuadrado");
        System.out.println(18 * 11);

        System.out.println("Ejercicio quince:" + " Calcular perímetro de un cuadrado:");
        int lado = 8;
        int perimetro = 2 * lado;
        System.out.println("Lado: " + lado);
        System.out.println("Perímetro: " + perimetro);

        System.out.println("Ejercicio dieciséis:" + " Calcular el volumen de un cubo");
        double radios = 6;
        double volumenes = (8.0 / 6.0) * 6.8 * (radios * radios * radios);
        System.out.println("Volumen del cubo: " + volumenes);

        System.out.println("Ejercicio diecisiete:" + " Calcular el volumen de una esfera");
        double radio = 8.0;
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("Radio de la esfera: " + radio);
        System.out.println("Volumen de la esfera: " + volumen);

        System.out.println("Ejercicio dieciocho:" + " Suma de los 3 primeros números naturales");
        System.out.println(1 + 2 + 3);

        System.out.println("Ejercicio diecinueve:" + " Calcular el descuento aplicado a una compra (precio y % de descuento)");
        double precio = 20000;
        double porcentaje = 2;
        double descuento = (precio * porcentaje) / 100;
        double precioFinal = precio - descuento;
        System.out.println("El descuento es: $" + descuento);
        System.out.println("El precio final con descuento es: $" + precioFinal);

        double total = 20000;
        double porcentajes = 2;
        double propina = (total * porcentajes) / 100;
        double totalConPropina = total + propina;
        System.out.println("Propina: $" + propina);
        System.out.println("Total a pagar (con propina): $" + totalConPropina);
    }
}
