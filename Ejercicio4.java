package Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Goalkeeper> porteros = new ArrayList<>();
        ArrayList<Extreme> extremos = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        boolean menu = true;
        while (menu) {
            System.out.println("Bienvenido, elija una opción:\n1) Añadir un jugador\n2) Mostrar jugadores\n3) Mejores jugadores\n4) Salir");
            switch (s.nextInt()){
                case 1:
                s.nextLine();
                System.out.println("Ingrese el nombre del jugador:");
                String name = s.nextLine();
                System.out.println("Ingrese el país del jugador:");
                String country = s.nextLine();
                System.out.println("Ingrese las faltas del jugador:");
                int faults = s.nextInt();
                System.out.println("Ingrese los goles directos del jugador:");
                int goals = s.nextInt();
                System.out.println("Ingrese los lanzamientos totales del jugador:");
                int kicks = s.nextInt();
                int type;
                System.out.println("Ingrese 1 si es un portero o 2 si es un extremo:");
                while (true) {
                    type = s.nextInt();
                    if (type == 1 || type == 2) {
                        break;
                    }
                }
                if (type == 1) {
                    System.out.println("Ingrese las paradas del portero:");
                    int blocked = s.nextInt();
                    System.out.println("Ingrese los goles recibidos del portero:");
                    int received = s.nextInt();
                    porteros.add(new Goalkeeper(name, country, faults, goals, kicks, blocked, received));
                } else if (type == 2) {
                    System.out.println("Ingrese los pases del extremo:");
                    int passings = s.nextInt();
                    System.out.println("Ingrese las asistencias del extremo:");
                    int assistances = s.nextInt();
                    extremos.add(new Extreme(name, country, faults, goals, kicks, passings, assistances));
                }
                break;
                case 2:
                System.out.println("Porteros:");
                for (Goalkeeper gk : porteros) {
                    System.out.println("Nombre: " + gk.getName() + ", País: " + gk.getCountry() + ", Faltas: " + gk.getFaults() + ", Goles: " + gk.getGoals() + ", Lanzamientos: " + gk.getKicks() + ", Paradas: "+ gk.getBlocked() + ", Goles recibidos: " + gk.getReceived());
                }
                System.out.println("Extremos:");
                for (Extreme gk : extremos) {
                    System.out.println("Nombre: " + gk.getName() + ", País: " + gk.getCountry() + ", Faltas: " + gk.getFaults() + ", Goles: " + gk.getGoals() + ", Lanzamientos: " + gk.getKicks() + ", Pases: "+ gk.getPassings() + ", Asistencias: " + gk.getAssistances());
                }
                break;
                case 3:
                ArrayList<Goalkeeper> mejores = new ArrayList<>();
                for (int x = 0; x < 3; x++) {
                    Goalkeeper g = null; float max = 0;
                    for (Goalkeeper gk : porteros) {
                        if (gk.Efectivity() > max && mejores.indexOf(gk) == -1) {
                            g = gk; max = g.Efectivity();
                        }
                    }
                    if (g != null) {
                        mejores.add(g);
                    }
                }
                System.out.println("Top 3 porteros más efectivos: ");
                for (Goalkeeper gk : mejores) {
                    System.out.println(gk.getName() + ": " + gk.Efectivity());
                }
                System.out.println("Extremos con más de 85% de efectividad: ");
                int total = 0;
                for (Extreme ex : extremos) {
                    if (ex.Efectivity() > 85) {
                        System.out.println(ex.getName() + ": " + ex.Efectivity());
                        total ++;
                    }
                }
                System.out.println("Total: " + total + " extremos");
                System.out.println("(La efectividad es sobre 200%)");
                break;
                case 4:
                menu = false;
                break;
                default:
                break;
            }
        }
        s.close();
    }
    
}
