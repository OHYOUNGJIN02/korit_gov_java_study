package Project1;

public class Football {
    private String teamName;
    private int wins;
    private int draws;
    private int losses;
    private int points;

    public Football(String teamName, int wins, int draws, int losses) {
        this.teamName = teamName;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
        this.points = wins * 3 + draws;
    }

    public Football(String teamName) {
        this(teamName, 0, 0, 0);
    }

    public void recordWin() {
        wins++;
        points += 3;
    }

    public void recordDraw() {
        draws++;
        points += 1;
    }

    public void recordLoss() {
        losses++;
    }

    public int getPoints() {
        return points;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getLosses() {
        return losses;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String toString() {
        return teamName + " - Pts: " + points +
                " (W:" + wins + " D:" + draws + " L:" + losses + ")";
    }
}