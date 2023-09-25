package Ejercicio4;

public class Extreme extends Player {
    private int passings;
    private int assistances;
    public Extreme(String name, String country, int faults, int goals, int kicks, int passings, int assistances) {
        super(name, country, faults, goals, kicks);
        this.assistances = assistances;
        this.passings = passings;
    }
    public int getPassings() {
        return passings;
    }
    public int getAssistances() {
        return assistances;
    }
    public float Efectivity() {
        float a = (passings + assistances - faults) * 100 / (passings + assistances + faults) + goals *100 / kicks;
        return a;
    }
    
}
