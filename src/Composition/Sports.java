package Composition;

public class Sports {
    private String name;
    private sportsSkillLevel level;
    private boolean isActive;
    private int numOfAwards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public sportsSkillLevel getLevel() {
        return level;
    }

    public void setLevel(sportsSkillLevel level) {
        this.level = level;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getNumOfAwards() {
        return numOfAwards;
    }

    public void setNumOfAwards(int numOfAwards) {
        this.numOfAwards = numOfAwards;
    }
}
