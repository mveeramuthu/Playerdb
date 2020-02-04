package com.intuit.playerdb.service.dto;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A DTO for the Player entity.
 */
public class PlayerDTO implements Serializable {

    private Long playerID;

    @NotNull
    private String nameFirst;

    @NotNull
    private String nameLast;

    public Long getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Long playerID) {
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
            "playerId=" + getPlayerID() +
            ", name_first='" + getNameFirst() + "'" +
            ", name_last='" + getNameLast() + "'" +
            "}";
    }
}
