public class Pelicula {

    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeLasEvaluaciones;
    int totalDeEvaluaciones;

    void muestraFichaTecnica() {
        System.out.println("\nEl nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionEnMinutos);
    }
    void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones++;
    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeEvaluaciones;
    }
}
