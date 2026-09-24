package github.lucasas.ugeopgave.opgave4;

public class TeamMain {
    void main() {
        Team team1 = new Team("Lucas holdet");
        team1.addPlayer(new Player("Lucas", 12));
        team1.addPlayer(new Player("Lucas2", 100));
        team1.addPlayer(new Player("Lucas3", 90));

        Team team2 = new Team("Carl holdet");
        team2.addPlayer(new Player("Carl", 45));
        team2.addPlayer(new Player("Carl2", 13));
        team2.addPlayer(new Player("Carl3", 66));

        team1.printTeam();
        team2.printTeam();

        team1.compete(team2);

    }
}
