package com.intuit.playerdb.service.mapper;

import com.intuit.playerdb.domain.Player;
import com.intuit.playerdb.service.dto.PlayerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper for the entity Player and its DTO PlayerDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PlayerMapper extends EntityMapper <PlayerDTO, Player> {
    PlayerDTO toDto(Player player);
    Player toEntity(PlayerDTO PlayerDTO);

    default Player fromPlayerId(Long playerId) {
        if (playerId == null) {
            return null;
        }
        Player player = new Player();
        player.setPlayerID(playerId);
        return player;
    }
}
