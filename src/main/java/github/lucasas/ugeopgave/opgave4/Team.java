package github.lucasas.ugeopgave.opgave4;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final String teamName;
    private final List<Player> players = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void printTeam() {
        System.out.println("=== " + teamName + " ===");
        players.forEach(System.out::println);
    }

    public void compete(Team opponent) {
        String winnerTeam = opponent.teamName;
        double average = opponent.getAverageSkill();
        if (getAverageSkill() >= opponent.getAverageSkill()) {
            winnerTeam = teamName;
            average = getAverageSkill();
        }
        System.out.println(winnerTeam + " vinder! med et skill level på " + average);
    }

    private double getAverageSkill() {
        return players.stream().mapToDouble(Player::getSkillLevel).sum() / players.size();
    }
}
