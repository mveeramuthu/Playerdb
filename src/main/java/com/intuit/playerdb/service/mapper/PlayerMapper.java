package com.intuit.playerdb.service.mapper;

import com.intuit.playerdb.domain.Player;
import com.intuit.playerdb.service.dto.PlayerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper for the entity Tweet and its DTO PlayerDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PlayerMapper extends EntityMapper <PlayerDTO, Player> {

    @Mapping(source = "createdBy.id", target = "createdById")
    @Mapping(source = "createdBy.screenname", target = "createdByScreenname")
    PlayerDTO toDto(Player tweet);

    @Mapping(source = "createdById", target = "createdBy")
    Player toEntity(PlayerDTO PlayerDTO);
    default Player fromId(Long id) {
        if (id == null) {
            return null;
        }
        Player player = new Player();
        player.setId(id);
        return player;
    }
}
