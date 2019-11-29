package MafiaGame;

public class God {
    private Role role;

    public God(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void sendSleepCommand() {
        System.out.println("Every body should sleep!");
    }

    public void sendAwakeCommandToMafias() {
        System.out.println("Every mafia! wake up!");
    }

    public void sendPersonSelectionCommandToMafias() {
        System.out.println("Select a citizen to kill!");
    }

    public void sendSleepCommandToMafia() {
        System.out.println("Every body who is mafia should sleep right now!");
    }

    public void sendWakeUpCommandTODoctor() {
        System.out.println("Doctor! wake up");
    }

    public void sendConsiderationCommandToDoctor() {
        System.out.println("Doctor! Select one person and do your job!");
    }
}
