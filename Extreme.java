package Ejercicio4;
/**
 * Clase que define un jugador extremo
 *
 * @author Ultimate-Truth-Seeker
 * @since 22/09/2023
 * @version 25/09/2023
 */
public class Extreme extends Player {
    private int passings;// pases hechos por el extremo
    private int assistances;// asistencias realizadas

    /**constructor de la clase
     * @param name
     * @param country
     * @param faults
     * @param goals
     * @param kicks
     * @param passings
     * @param assistances
     */
    public Extreme(String name, String country, int faults, int goals, int kicks, int passings, int assistances) {
        super(name, country, faults, goals, kicks);
        this.assistances = assistances;
        this.passings = passings;
    }
    /**
     * @return pases
     */
    public int getPassings() {
        return passings;
    }
    /**
     * @return asistencias
     */
    public int getAssistances() {
        return assistances;
    }
    /** Método para calcular automáticamente la efectividad de un extremo en base a la fórmula
     * @return el porcentaje de efectividad
     */
    public float Efectivity() {
        float a = (passings + assistances - faults) * 100 / (passings + assistances + faults) + goals *100 / kicks;
        return a;
    }
    
}
