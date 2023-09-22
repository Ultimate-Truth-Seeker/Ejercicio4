package Ejercicio4;

public class Player {
    protected String name;
    protected String country;
    protected int faults;
    protected int goals;
    protected int kicks;
    public Player(String name, String country, int faults, int goals, int kicks) {
        this.name = name;
        this.country = country;
        this.faults = faults;
        this.goals = goals;
        this.kicks = kicks;
    }
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public int getFaults() {
        return faults;
    }
    public int getGoals() {
        return goals;
    }
    public int getKicks() {
        return kicks;
    }
    
}
