/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Usuario DAM 2
 */
public class Temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguir = true;
        ArrayList<Double> listatemperaturas = new ArrayList<Double>();
        do {
            System.out.println("-----------Menu-------------");
            System.out.println("|1.Introducir temperaturas   |");
            System.out.println("----------------------------");
            System.out.println("|2.Mostrar temperaturas      |");
            System.out.println("----------------------------");
            System.out.println("|3.Ordenar temperaturas      |");
            System.out.println("----------------------------");
            System.out.println("|4.Mostrar extremos          |");
            System.out.println("----------------------------");
            System.out.println("|5.Mostrar media             |");
            System.out.println("----------------------------");
            System.out.println("|6.Salir                     |");
            System.out.println("----------------------------");
            System.out.println("Eliga una opcion:");

            int opcion;
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Intruduzca la temperatura:");
                    double temp;
                    temp = teclado.nextDouble();
                    listatemperaturas.add(temp);
                    break;
                case 2:
                    System.out.println("Temperaturas:");
                    for (double i : listatemperaturas) {
                        System.out.println(i+"ºC");
                    }
                    ;
                    break;

                case 3:
                    System.out.println("Temperaturas ordenadas de menor a mayor:");
                    Collections.sort(listatemperaturas);
                    for (double i : listatemperaturas) {
                        System.out.println(i+"ºC");
                    }
                    break;
                case 4:
                    double max;
                    System.out.println("La temperatura mas alta es:");
                    max = Collections.max(listatemperaturas);
                    System.out.println(max+"ºC");
                    double min;
                    System.out.println("La temperatura mas baja es:");
                    min = Collections.min(listatemperaturas);
                    System.out.println(min+"ºC");
                    break;
                case 5:
                    System.out.println("La media de las temperaturas es:");
                    double media;
                    double n = 0;
                    for (int i = 0; i < listatemperaturas.size(); i++) {
                        n += Double.parseDouble(listatemperaturas.get(i).toString());
                    }
                    media =n/listatemperaturas.size() ;
                    System.out.println(media+"ºC");
                    break;
                case 6:
                    System.out.println("Adios.");
                     System.exit(0);
                    break;
                default:
                    System.out.println("El numero introducido es incorrecto, introduzca uno de nuevo:");
                    break;
            }

        } while (seguir = true);
    }
}
