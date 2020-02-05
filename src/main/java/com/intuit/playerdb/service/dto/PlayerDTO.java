package com.intuit.playerdb.service.dto;

import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Player entity.
 */
public class PlayerDTO implements Serializable {

    @NotNull
    private String playerID;
    private Long birthYear;
    private Long birthMonth;
    private Long birthDay;
    private String birthCountry;
    private String birthState;
    private String birthCity;
    private Long deathYear;
    private Long deathMonth;
    private Long deathDay;
    private String deathCountry;
    private String deathState;
    private String deathCity;
    private String nameFirst;
    private String nameLast;
    private String nameGiven;
    private Long weight;
    private Long height;
    @Size(max = 1)
    private String bats;
    @Size(max = 1)
    @Field("throws")
    private String playerThrows;
    private String debut;
    private String finalGame;
    private String retroID;
    private String bbrefID;

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

    public Long getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Long birthYear) {
        this.birthYear = birthYear;
    }

    public Long getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(Long birthMonth) {
        this.birthMonth = birthMonth;
    }

    public Long getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Long birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public Long getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Long deathYear) {
        this.deathYear = deathYear;
    }

    public Long getDeathMonth() {
        return deathMonth;
    }

    public void setDeathMonth(Long deathMonth) {
        this.deathMonth = deathMonth;
    }

    public Long getDeathDay() {
        return deathDay;
    }

    public void setDeathDay(Long deathDay) {
        this.deathDay = deathDay;
    }

    public String getDeathCountry() {
        return deathCountry;
    }

    public void setDeathCountry(String deathCountry) {
        this.deathCountry = deathCountry;
    }

    public String getDeathState() {
        return deathState;
    }

    public void setDeathState(String deathState) {
        this.deathState = deathState;
    }

    public String getDeathCity() {
        return deathCity;
    }

    public void setDeathCity(String deathCity) {
        this.deathCity = deathCity;
    }

    public String getNameGiven() {
        return nameGiven;
    }

    public void setNameGiven(String nameGiven) {
        this.nameGiven = nameGiven;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public String getBats() {
        return bats;
    }

    public void setBats(String bats) {
        this.bats = bats;
    }

    public String getPlayerThrows() {
        return playerThrows;
    }

    public void setPlayerThrows(String playerThrows) {
        this.playerThrows = playerThrows;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFinalGame() {
        return finalGame;
    }

    public void setFinalGame(String finalGame) {
        this.finalGame = finalGame;
    }

    public String getRetroID() {
        return retroID;
    }

    public void setRetroID(String retroID) {
        this.retroID = retroID;
    }

    public String getBbrefID() {
        return bbrefID;
    }

    public void setBbrefID(String bbrefID) {
        this.bbrefID = bbrefID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PlayerDTO PlayerDTO = (PlayerDTO) o;
        if(PlayerDTO.getPlayerID() == null || getPlayerID() == null) {
            return false;
        }
        return Objects.equals(getPlayerID(), PlayerDTO.getPlayerID());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPlayerID());
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
            "playerID=" + getPlayerID() +
            ", name_first='" + getNameFirst() + "'" +
            ", name_last='" + getNameLast() + "'" +
            "}";
    }
}
