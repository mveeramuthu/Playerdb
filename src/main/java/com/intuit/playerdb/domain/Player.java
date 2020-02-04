package com.intuit.playerdb.domain;

import io.swagger.annotations.ApiModel;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;


/**
 * Player entity
 * <p>
 * playerID,birthYear,birthMonth,birthDay,birthCountry,birthState,birthCity,deathYear,deathMonth,deathDay,deathCountry,deathState,deathCity,nameFirst,nameLast,nameGiven,weight,height,bats,throws,debut,finalGame,retroID,bbrefID
 * <p>
 * <p>
 * aardsda01,1981,12,27,USA,CO,Denver,,,,,,,David,Aardsma,David Allan,215,75,R,R,2004-04-06,2015-08-23,aardd001,aardsda01
 * aaronha01,1934,2,5,USA,AL,Mobile,,,,,,,Hank,Aaron,Henry Louis,180,72,R,R,1954-04-13,1976-10-03,aaroh101,aaronha01
 * aaronto01,1939,8,5,USA,AL,Mobile,1984,8,16,USA,GA,Atlanta,Tommie,Aaron,Tommie Lee,190,75,R,R,1962-04-10,1971-09-26,aarot101,aaronto01
 * aasedo01,1954,9,8,USA,CA,Orange,,,,,,,Don,Aase,Donald William,190,75,R,R,1977-07-26,1990-10-03,aased001,aasedo01
 */
@ApiModel(description = "Player entity")
@Entity
@Table(name = "player")
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String playerID;

    @NotNull
    @Column(name = "name_first", nullable = false)
    private String nameFirst;

    @NotNull
    @Column(name = "name_last", nullable = false)
    private String nameLast;

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Player Player = (Player) o;
        if (Player.getPlayerID() == null || getPlayerID() == null) {
            return false;
        }
        return Objects.equals(getPlayerID(), Player.getPlayerID());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPlayerID());
    }

    @Override
    public String toString() {
        return "Player{" +
            "playerId=" + getPlayerID() +
            ", name_first='" + getNameFirst() + "'" +
            ", name_last='" + getNameLast() + "'" +
            "}";
    }
}
