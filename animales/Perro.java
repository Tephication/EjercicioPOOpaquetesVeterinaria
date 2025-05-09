package com.veterinaria.animales;

import java.util.ArrayList;
import java.util.Scanner;

public class Perro {
    //Defino atributos privados

    public String nombre;
    private String raza;
    private int edad;
    private double peso;
    private String historialMedico;


    //Creo constructor vacío

    public Perro() {
        this.nombre= "";
        this.raza = "";
        this.edad = 0;
        this.peso= 0.0;
        this.historialMedico = "";
    }

    //Constructor parametrizado

    public Perro(String nombre, String raza, int edad, double peso, String historialMedico) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.historialMedico = historialMedico;
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    //Métodos
    public void mostrarFichaRegistro (){
        System.out.println("---FICHA REGISTRO---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Historial médico: " + historialMedico);
    }

    public void registrarPerros (){
        ArrayList<Perro> listaPerros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nBienvenido al gestor de perros, ¿Qué deseas hacer?: ");
            System.out.println("1. Registrar mascota ");
            System.out.println("2. Ver mascotas registradas ");
            System.out.println("3. Salir ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            if(opcion <= 2 || opcion == 3) {
                switch (opcion) {
                    case 1:
                        Perro nuevoPerro = new Perro();
                        System.out.println("Ingresa el nombre de tu perro: ");
                        nuevoPerro.setNombre(scanner.nextLine());

                        System.out.println("Ingresa la raza de tu perro: ");
                        nuevoPerro.setRaza(scanner.nextLine());

                        System.out.println("Ingresa la edad de tu perro: ");
                        nuevoPerro.setEdad(scanner.nextInt());
                        scanner.nextLine();

                        System.out.println("Ingresa el peso de tu perro en kg: ");
                        nuevoPerro.setPeso(scanner.nextDouble());
                        scanner.nextLine();

                        System.out.print("Ingrese el historial médico: ");
                        nuevoPerro.setHistorialMedico(scanner.nextLine());

                        listaPerros.add(nuevoPerro);

                        System.out.println("\n Registro exitoso: ");
                        nuevoPerro.mostrarFichaRegistro();

                        break;

                    case 2:
                        for (Perro p : listaPerros) {
                            p.mostrarFichaRegistro();
                            System.out.println("------------------------");
                        }
                        break;
                    case 3:
                        System.out.println("Adiós. Gracias por usar el gestor de perros");
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            }
        } while (opcion != 3);
        scanner.close();
    }
}
