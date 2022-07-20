package src.main.models;

import java.util.HashMap;

public class Game {
    HashMap<Team, Integer> scoreboard;
    private static final int QUAFFLE_POINTS = 10;
    private static final int SNITCH_POINTS = 150;

    public Game(Team home, Team away) {
        this.scoreboard = new HashMap<Team, Integer>();

        this.scoreboard.put(new Team(home), 0);
        this.scoreboard.put(new Team(away), 0);
    }

    public void setScore(Team team, Integer score) {
        if (team == null) {
            throw new IllegalArgumentException("Cannot set score for null team.");
        }
        this.scoreboard.put(team, score);
    }

    public Integer getScore(Team team) {
        return this.scoreboard.get(team);
    }

    public Team getTeam(String name) {
        return this.scoreboard.keySet()
            .stream()
            .filter(key -> key.getHouse().equals(name))
            .findFirst()
            .orElse(null);
    }

    public String getPlaceholder(String play) {
        return play.substring(play.indexOf("<") + 1, play.indexOf(">"));
    }

    public int getQuafflePoints() {
        return QUAFFLE_POINTS;
    }

    public int getSnitchPoints() {
        return SNITCH_POINTS;
    }

    public String replacePlaceholder(String play, String placeholder, String value) {
        return play.replace("<"+placeholder+">", value);
    }

    public void quaffleScore(Team team) {
        this.setScore(team, this.getScore(team) + QUAFFLE_POINTS);
    }

    public void snitchScore(Team team) {
        this.setScore(team, this.getScore(team) + SNITCH_POINTS);
    }

    private int randomNumber(int max) {
        return (int)(Math.random() * max);
    }

    private Team getRandomTeam() {
        Object[] teams = scoreboard.keySet().toArray();
        return (Team)teams[this.randomNumber(teams.length)];
    }

    public String simulate(String play) {
        String placeholder = getPlaceholder(play);
        Team team = getRandomTeam();
        String value = "";

        if (placeholder.equals(Team.getPositionChaser())) {
            this.quaffleScore(team);
            value = team.getChasers()[this.randomNumber(team.getChasers().length)]
        } else if (placeholder.equals(Team.getPositionSeeker())) {
            this.snitchScore(team);
            value = team.getSeeker();
        } else if (placeholder.equals(Team.getPositionKeeper())) {
            value = team.getKeeper();
        }

        return replacePlaceholder(play, placeholder, value);
    }
}
