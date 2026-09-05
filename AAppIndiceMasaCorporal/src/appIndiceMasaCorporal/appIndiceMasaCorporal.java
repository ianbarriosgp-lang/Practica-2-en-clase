package appIndiceMasaCorporal;

import modelo.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class appIndiceMasaCorporal {

    private static ArrayList<Persona> arraypersona1 = new ArrayList<>();
    private static Scanner entrada = new Scanner(System.in);

    // METODO MAIN
    public static void main(String[] args) {

        int opcion;

        // MENU PRINCIPAL
        do {
            System.out.println("SISTEMA DE EVALUACION IMC");
            System.out.println("-------------------------------");
            System.out.println("1. REGISTRAR PERSONAS");
            System.out.println("2. Mostrar personas registradas");
            System.out.println("3. Buscar persona por nombre");
            System.out.println("4. Salir");
            System.out.println("Por favor ingrese un numero de opcion");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    registrarPersona();
                    break;

                case 2:
                    mostrarPersona();
                    break;

                case 3:
                    buscarPersona();
                    break;

                case 4:
                    System.out.println("Presione una tecla para salir...");
                    break;

                default:
                    System.out.println("Ingrese un numero de opcion valida!");
            }

        } while (opcion != 4);
    }

    // METODO PARA REGISTRAR PERSONA
    public static void registrarPersona() {

        Persona persona1 = new Persona();

        System.out.println("Ingrese los datos siguientes:");

        System.out.println("Nombre completo:");
        persona1.setNombreCompleto(entrada.nextLine());

        System.out.println("Fecha de Nacimiento:");
        persona1.setFechaNacimiento(LocalDate.parse(entrada.nextLine()));

        System.out.println("Peso:");
        persona1.setPeso(entrada.nextDouble());

        System.out.println("Altura:");
        persona1.setAltura(entrada.nextDouble());

        entrada.nextLine();

        System.out.println("Direccion:");
        persona1.setDireccion(entrada.nextLine());

        System.out.println("Telefono:");
        persona1.setTelefono(entrada.nextLine());

        System.out.println("Correo electronico:");
        persona1.setCorreoElectronico(entrada.nextLine());

        // Verificamos si es mayor de edad
        if (persona1.esMayorEdad()) {

            // Guardamos la persona
            arraypersona1.add(persona1);

            System.out.println("Persona registrada correctamente.");

        } else {

            System.out.println("La persona debe ser mayor de edad.");
        }
    }

    // METODO PARA MOSTRAR PERSONAS
    public static void mostrarPersona() {

        System.out.println("PERSONAS REGISTRADAS EN EL SISTEMA");
        System.out.println("--------------------------------------");

        for (int i = 0; i < arraypersona1.size(); i++) {

            arraypersona1.get(i).mostrarDatos();

            // Creamos la evaluacion del IMC
            EvaluacionIMC evaluacion = new EvaluacionIMC(arraypersona1.get(i));

            System.out.println(evaluacion.mostrarResultado());

            System.out.println("-----------------------");
            System.out.println();
        }
    }

    // METODO PARA BUSCAR PERSONA
    public static void buscarPersona() {

        System.out.println("Ingrese el nombre de la persona que desea buscar:");

        String nombreBuscado = entrada.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < arraypersona1.size(); i++) {

            if (arraypersona1.get(i).getNombreCompleto().equalsIgnoreCase(nombreBuscado)) {

                System.out.println("PERSONA ENCONTRADA");
                System.out.println("-------------------------");

                arraypersona1.get(i).mostrarDatos();

                // Evaluacion del IMC
                EvaluacionIMC evaluacion = new EvaluacionIMC(arraypersona1.get(i));

                System.out.println(evaluacion.mostrarResultado());

                encontrado = true;
            }
        }

        if (encontrado == false) {

            System.out.println("La persona no se encuentra registrada.");
        }
    }
}