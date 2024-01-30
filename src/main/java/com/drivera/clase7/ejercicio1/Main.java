package com.drivera.clase7.ejercicio1;

    /* Ejercicio 1
    Realizar un programa que simule una calculadora.
    La estructura del programa debe contener dos clases:
    - una clase que tenga el método especial main para poder ejecutar lo que se pide en los requerimientos,
    - y otra clase llamada Calculadora.
    Requerimientos:
    Se necesita realizar un programa que pida por consola dos valores enteros, la operación matemática a realizar y muestre por pantalla el resultado*/

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el primer numero entero: ");
            Integer numero1 = scanner.nextInt();

            System.out.println("Ingrese el segundo numero entero: ");
            Integer numero2 = scanner.nextInt();

            System.out.println("Ingrese la operacion a realizar: + , - , / ó * ");
            String operacion = scanner.next();

            boolean validez = true;


            switch (operacion) {
                case "+":
                    calculadora.sumar(numero1, numero2);
                    break;
                case "-":
                    calculadora.restar(numero1, numero2);
                    break;
                case "/":
                    calculadora.dividir(numero1, numero2);
                    break;
                case "*":
                    calculadora.multiplicar(numero1, numero2);
                    break;
                default:
                    validez = false;
                    System.out.println("Operación No Valida");

            }
            Integer result = calculadora.getResultado();

            if (validez) {
                System.out.println("Primer Valor: " + numero1);
                System.out.println("Segundo Valor: " + numero2);
                System.out.println("Operacion: " + operacion);
                System.out.println("Resultado: " + result);

                if (result < 0) {
                    System.out.println("Tené cuidado, el resultado es negativo!");
                } else if (result > 0 && result < 1000) {
                    System.out.println("Resultado dentro de los límites");
                } else System.out.println("Error, resultado muy grande");

            }
        }
        scanner.close();
    }
}




