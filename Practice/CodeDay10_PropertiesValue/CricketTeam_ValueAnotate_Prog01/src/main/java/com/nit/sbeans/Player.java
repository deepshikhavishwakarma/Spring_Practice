package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value= "com/nit/commons/info.properties")
public class Player {
    @Value("${player.id}")
    private int playerId;
    @Value("${player.name}")
    private String playerName;
    @Value("${player.yearsNumber}")
    private int yearsNumber;
    @Value(("${team.name}"))
    private String teamName;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getYearsNumber() {
        return yearsNumber;
    }

    public void setYearsNumber(int yearsNumber) {
        this.yearsNumber = yearsNumber;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", yearsNumber=" + yearsNumber +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
