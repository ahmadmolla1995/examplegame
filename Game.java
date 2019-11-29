package MafiaGame;

import java.util.*;

public class Game {
    private Time time;
    private ArrayList<Citizen> citizens;
    private ArrayList<Mafia> mafias;
    private Citizen selectedPersonToKill;

    public Game() {
        this.citizens = new ArrayList<Citizen>();
        this.mafias = new ArrayList<Mafia>();
        this.time = Time.Night;
    }

    public Time getTime() {
        return this.time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void addCitizen(Citizen citizen) {
        System.out.println("add method");
        this.citizens.add(citizen);
    }

    public void addMafia(Mafia mafia){
        this.mafias.add(mafia);
    }

    public void display() {
        for(Citizen c: citizens)
            c.printInfo();
        for(Mafia m: mafias)
            m.printInfo();
    }

    public void sleepAllPlayers() {
        for(Citizen citizen: citizens)
            citizen.setAwakeStatus(false);
        for(Mafia mafia: mafias)
            mafia.setAwakeStatus(false);
    }

    public void wakeUpMafias() {
        for(Mafia m: mafias)
            m.setAwakeStatus(true);
    }

    public void selectCitizenToKill() {
        System.out.print("Citizens ID: ");
        for(Citizen c: citizens)
            System.out.print(c.getPersonID() + "-");
        for(Mafia m: mafias)
            System.out.print(m.getPersonID() + "-");

        System.out.println("\n\nEnter citizen ID to kill!");
        this.selectedPersonToKill = citizens.get((new Random()).nextInt(citizens.size()));
    }

    public void wakeUpPlayer(Role role) {
        for(Citizen c: citizens) {
            if (c.getRoll() == role) {
                c.setAwakeStatus(true);
                return;
            }
        }
    }
}
