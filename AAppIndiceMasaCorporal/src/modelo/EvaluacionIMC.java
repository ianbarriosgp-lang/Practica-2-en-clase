package modelo;

public class EvaluacionIMC {

    // Atributos
    private double imc;
    private ClasificacionIMC clasificacion;

    // Constructor
    public EvaluacionIMC(Persona persona) {
        imc = calcularIMC(persona);
        clasificacion = clasificarIMC(imc);
    }

    // CALCULAR IMC
    public double calcularIMC(Persona persona) {
        double resultado = persona.getPeso() / (persona.getAltura() * persona.getAltura());

        return resultado;
    }

    // CLASIFICAR IMC
    public ClasificacionIMC clasificarIMC(double imc) {

        if (imc < 18.5) {
            return ClasificacionIMC.BAJO_PESO;

        } else if (imc < 25) {
            return ClasificacionIMC.NORMAL;

        } else if (imc < 30) {
            return ClasificacionIMC.SOBREPESO;

        } else {
            return ClasificacionIMC.OBESIDAD;
        }
    }

    // MOSTRAR RESULTADO
    public String mostrarResultado() {

        return "IMC: " + imc + "\n"
                + "Clasificacion: " + clasificacion;
    }

    // GET IMC
    public double getIMC() {
        return imc;
    }

    // GET CLASIFICACION
    public ClasificacionIMC getClasificacion() {
        return clasificacion;
    }
}
