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
 */
@ApiModel(description = "Player entity")
@Entity
@Table(name = "player")
public class Player implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotNull
        @Size(max = 140)
        @Column(name = "Player_text", length = 140, nullable = false)
        private String PlayerText;

        @NotNull
        @Column(name = "created_at", nullable = false)
        private ZonedDateTime createdAt;

        @NotNull
        @Size(max = 5)
        @Column(name = "lang", length = 5, nullable = false)
        private String lang;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getPlayerText() {
            return PlayerText;
        }

        public void setPlayerText(String PlayerText) {
            this.PlayerText = PlayerText;
        }

        public Player PlayerText(String PlayerText) {
            this.PlayerText = PlayerText;
            return this;
        }

        public ZonedDateTime getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
        }

        public Player createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public Player lang(String lang) {
            this.lang = lang;
            return this;
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
            if (Player.getId() == null || getId() == null) {
                return false;
            }
            return Objects.equals(getId(), Player.getId());
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(getId());
        }

        @Override
        public String toString() {
            return "Player{" +
                "id=" + getId() +
                ", PlayerText='" + getPlayerText() + "'" +
                ", createdAt='" + getCreatedAt() + "'" +
                ", lang='" + getLang() + "'" +
                "}";
        }
}
