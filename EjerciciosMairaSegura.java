
public class EjerciciosMairaSegura {
    public static void main(String[] args) {
        String Name = "Maira Segura";
        int edad = 15;

        System.out.println(Name);
        System.out.println(edad);

        int a = 6;
        int b = 2;

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;

        System.out.println("este es el valor de la suma de a + b" + " " + suma);
        System.out.println("este es el valor de la resta de a + b" + " " + resta);
        System.out.println("este es el valor de la multiplicacion de a + b" + " " + multiplicacion);
        System.out.println("este es el valor de la division de a + b" + " " + division);

        int numero = 4;
        int cuadrado = numero * numero;

        System.out.println("el cuadrado de " + numero + " es " + cuadrado);

        double gradocel = 3.7;
        double gradofaren = gradocel * 2.5 + 32;

        System.out.println(gradofaren);

        double valor1 = 2.4;
        double valor2 = 3.1;
        double perimetro = 2 * (valor1 + valor2);

        System.out.println("El perímetro del rectángulo es: " + perimetro);

        int radio = 5;
        int cuadrador = radio * radio;
        double area = 3.14 * cuadrador;

        System.out.println("El área del círculo es: " + area);

        byte año = 4;
        int dias = año * 365;

        System.out.println(dias);

        byte numeros = 4;
        int doble = 2 * numeros;
        int triple = 3 * numeros;

        System.out.println("El doble de " + numeros + " es " + doble);
        System.out.println("El triple de " + numeros + " es " + triple);

        int kilometros = 2;

        int metros = kilometros * 1000;
        int centimetros = kilometros * 100000;

        System.out.println(metros + " metros");
        System.out.println(centimetros + " centímetros");

        int lado = 5;

        int areas = lado * lado;
        int perimetros = 4 * lado;

        System.out.println("Área del cuadrado: " + areas);
        System.out.println("Perímetro del cuadrado: " + perimetros);

        int lados = 4;
        int volumen = lados * lados * lados;

        System.out.println("Volumen del cubo: " + volumen);

        double radios = 3;

        double volumes = (4.0 / 3.0) * 3.14 * (radios * radios * radios);

        System.out.println("El volumen de la esfera es: " + volumes);

        int sumas = 1 + 2 + 3;

        System.out.println("La suma de los tres primeros números naturales es: " + sumas);

        double precio = 10000;
        double porcentaje = 5;

        double descuento = (precio * porcentaje) / 100;
        double precioFinal = precio - descuento;

        System.out.println("El descuento es: $" + descuento);
        System.out.println("El precio final con descuento es: $" + precioFinal);

        double total = 25000;
        double porcentajes = 5;

        double propina = (total * porcentajes) / 100;
        double totalConPropina = total + propina;

        System.out.println("Propina: $" + propina);
        System.out.println("Total a pagar (con propina): $" + totalConPropina);
    }
}
