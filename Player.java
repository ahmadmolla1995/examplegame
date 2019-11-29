package MafiaGame;

public abstract class Player {
    private int personID;
    private Role roll;
    public Player(int personID, Role roll) {
        this.personID = personID;
        this.roll = roll;
    }

    public Role getRoll() {
        return this.roll;
    }
}

class Mafia extends Player {
    public Mafia(int personID, Role role){
        super(personID, role);
    }
}

class GodFather extends Mafia {
    public GodFather(int personID, Role role){
        super(personID, role);
    }
}

class Natasha extends Mafia {
    public Natasha(int personID, Role role){
        super(personID, role);
    }
}

class Citizen extends Player {
    public Citizen(int personID, Role role){
        super(personID, role);
    }
}

class Doctor extends Citizen {
    public Doctor(int personID, Role role){
        super(personID, role);
    }
}

class Detective extends Citizen {
    public Detective(int personID, Role role){
        super(personID, role);
    }
}

class Sniper extends Citizen {
    public Sniper(int personID, Role role){
        super(personID, role);
    }
}



