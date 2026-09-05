package modelo;

import java.time.LocalDate;

public class Persona {

    // Atributos
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private double peso;
    private double altura;
    private String direccion;
    private String telefono;
    private String correoElectronico;

    // Constructor con parametros
    public Persona(String nombreCompleto, LocalDate fechaNacimiento, double peso, double altura, String direccion, String telefono, String correoElectronico) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.altura = altura;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    // Constructor vacio
    public Persona() {

    }

    // PARA CALCULAR EDAD
    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();

        int edad = fechaActual.getYear() - fechaNacimiento.getYear();

        return edad;
    }

    // PARA SABER SI ES MAYOR DE EDAD
    public boolean esMayorEdad() {
        if (calcularEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // MOSTRAR DATOS
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Correo: " + correoElectronico);
    }

    // GETTERS Y SETTERS

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}