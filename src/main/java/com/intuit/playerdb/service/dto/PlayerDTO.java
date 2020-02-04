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

    private Long id;

    @NotNull
    @Size(max = 140)
    private String tweetText;

    @NotNull
    private ZonedDateTime createdAt;

    @NotNull
    @Size(max = 5)
    private String lang;

    private Long createdById;

    private String createdByScreenname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTweetText() {
        return tweetText;
    }

    public void setTweetText(String tweetText) {
        this.tweetText = tweetText;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Long getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Long tweetAuthorId) {
        this.createdById = tweetAuthorId;
    }

    public String getCreatedByScreenname() {
        return createdByScreenname;
    }

    public void setCreatedByScreenname(String tweetAuthorScreenname) {
        this.createdByScreenname = tweetAuthorScreenname;
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
        if(PlayerDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), PlayerDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
            "id=" + getId() +
            ", tweetText='" + getTweetText() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", lang='" + getLang() + "'" +
            "}";
    }
}
