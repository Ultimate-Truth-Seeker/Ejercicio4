package Ejercicio4;
/**
 * Clase que define un jugador portero
 *
 * @author Ultimate-Truth-Seeker
 * @since 22/09/2023
 * @version 25/09/2023
 */
public class Goalkeeper extends Player {
    private int blocked;// paradas del portero
    private int received;// goles recibidos

    /**constructor de la clase
     * @param name
     * @param country
     * @param faults
     * @param goals
     * @param kicks
     * @param blocked
     * @param received
     */
    public Goalkeeper(String name, String country, int faults, int goals, int kicks, int blocked, int received) {
        super(name, country, faults, goals, kicks);
        this.blocked = blocked;
        this.received = received;
    }
    /**
     * @return bloqueadas
     */
    public int getBlocked() {
        return blocked;
    }
    /**
     * @return recibidas
     */
    public int getReceived() {
        return received;
    }
    /** Método para calcular automáticamente la efectividad de un portero en base a la fórmula
     * @return el porcentaje de efectividad
     */
    public float Efectivity() {
        float a = (blocked - received) * 100 / (blocked + received) + goals *100 / kicks;
        return a;
    }
    
        
}
