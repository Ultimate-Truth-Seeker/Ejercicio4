package Ejercicio4;
/**
 * Clase que define un jugador
 *
 * @author Ultimate-Truth-Seeker
 * @since 22/09/2023
 * @version 25/09/2023
 */
public class Player {
    protected String name;// nombre del jugador
    protected String country;// país del jugador
    protected int faults;// faltas cometidas
    protected int goals;// goles directos
    protected int kicks;// lanzamientos

    /**Constructor de la clase
     * @param name
     * @param country
     * @param faults
     * @param goals
     * @param kicks
     */
    public Player(String name, String country, int faults, int goals, int kicks) {
        this.name = name;
        this.country = country;
        this.faults = faults;
        this.goals = goals;
        this.kicks = kicks;
    }
    /**
     * @return nombre
     */
    public String getName() {
        return name;
    }
    /**
     * @return país
     */
    public String getCountry() {
        return country;
    }
    /**
     * @return faltas
     */
    public int getFaults() {
        return faults;
    }
    /**
     * @return goles
     */
    public int getGoals() {
        return goals;
    }
    /**
     * @return lanzamientos
     */
    public int getKicks() {
        return kicks;
    }
    
}
