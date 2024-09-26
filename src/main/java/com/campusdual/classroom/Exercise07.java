package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(11);
        sumFirstNaturalNumbers(5);
        showFirstNaturalNumbers(12);
    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        if(numeros.contains(num))
        {
            int posicion = numeros.indexOf(num) + 1;
            System.out.println("El elemento " + num + " se encuentra en la posición: "+ posicion);
        }
        else{
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int i;
        int suma;

        i = 1;
        suma = 0;
        while(i <= num)
        {
            suma+=i;
            System.out.println( " + " + i + ": " + suma);
            i++;
        }
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        int i;
        String show;

        i = 1;
        show = "";
        while(i <= num)
        {
            show += i + ", ";
            i++;
        }
        System.out.println(show);
    }

}
