package com.uip;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws Exception {
	 double tempC; // temperatura en grados celsius
        double tempF; //temperatura en grados farenheit
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Temperatura en celsius: "); //mensaje de ayuda
        tempC = Double.parseDouble(k.readLine()); //lectura de dato
        //tempC = 25.0; // Asignacion de valor punto-flotante
        tempF = tempC * 9 / 5 + 32; //expresion de la formula

        System.out.println("Temperatura: " + tempC + "C"); // Salida en farenhai
        System.out.println("Temperatura: " + tempF + "F"); // Salida en celsius
    }
}
