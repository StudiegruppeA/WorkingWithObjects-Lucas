package github.lucasas.level3;

public class Driver {
    private final String name;
    private final int skill;

    public Driver(String name, int skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public int getSkill() {
        return skill;
    }
}
