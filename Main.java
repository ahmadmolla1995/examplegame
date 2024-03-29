package MafiaGame;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        God god = new God(Role.God);

        game.addCitizen(new Citizen(1, Role.Citizen));
        game.addCitizen(new Detective(2, Role.Detective));
        game.addMafia(new Mafia(3, Role.Mafia));
        game.addMafia(new GodFather(4, Role.Godfather));
        game.addCitizen(new Doctor(5, Role.Doctor));
        game.addMafia(new Natasha(6, Role.Natasha));

        god.sendSleepCommand();
        game.sleepAllPlayers();

        god.sendAwakeCommandToMafias();
        game.wakeUpMafias();

        god.sendPersonSelectionCommandToMafias();
        game.selectCitizenToKill();

        god.sendSleepCommandToMafia();
        game.sleepMafias();

        god.sendWakeUpCommandTODoctor();
        game.wakeUpPlayer(Role.Doctor);

        god.sendConsiderationCommandToDoctor();
        game.selectPersonIDByDoctor();
    }
}
