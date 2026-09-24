package github.lucasas.ugeopgave.opgave4;

public class Player {
    private final String name;
    private final int skillLevel;

    public Player(String name, int skillLevel) {
        this.name = name;
        this.skillLevel = skillLevel;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", skillLevel=" + skillLevel +
                '}';
    }
}
