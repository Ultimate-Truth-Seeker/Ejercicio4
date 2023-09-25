package Ejercicio4;

public class Goalkeeper extends Player {
    private int blocked;
    private int received;
    public Goalkeeper(String name, String country, int faults, int goals, int kicks, int blocked, int received) {
        super(name, country, faults, goals, kicks);
        this.blocked = blocked;
        this.received = received;
    }
    public int getBlocked() {
        return blocked;
    }
    public int getReceived() {
        return received;
    }
    public float Efectivity() {
        float a = (blocked - received) * 100 / (blocked + received) + goals *100 / kicks;
        return a;
    }
    
        
}
