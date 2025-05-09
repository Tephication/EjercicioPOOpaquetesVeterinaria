package com.veterinaria.recepcion;

import com.veterinaria.animales.Perro;

public class Registro {
    public static void main(String[] args) {
        //Creo una instancia de Perro (clase profe Nath)
        Perro primerPerro = new Perro("Keyla","criolla",12,32,"anemia hace 5 años");

        System.out.println(primerPerro.nombre);
        System.out.println(primerPerro.getRaza());

        primerPerro.mostrarFichaRegistro();

        //Ejercicio registro perros

        Perro segundoPerro = new Perro();
        segundoPerro.registrarPerros();




    }
}
