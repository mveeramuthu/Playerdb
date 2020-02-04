package com.intuit.playerdb.web.rest;

import com.intuit.playerdb.domain.Player;
import com.intuit.playerdb.repository.PlayerRepository;
import com.intuit.playerdb.service.dto.PlayerDTO;
import com.intuit.playerdb.service.mapper.PlayerMapper;
import io.github.jhipster.web.util.PaginationUtil;
import io.github.jhipster.web.util.ResponseUtil;
import io.micrometer.core.annotation.Timed;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PlayerResource {
    private final Logger log = LoggerFactory.getLogger(PlayerResource.class);
    private static final String ENTITY_NAME = "player";
    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    public PlayerResource(PlayerRepository playerRepository, PlayerMapper playerMapper) {
        this.playerRepository = playerRepository;
        this.playerMapper = playerMapper;
    }

    /**
     * GET  /players/:playerID : get the "playerID" player.
     *
     * @param playerID the id of the PlayerDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the PlayerDTO, or with status 404 (Not Found)
     */
    @GetMapping("/players/{playerID}")
    @Timed
    public ResponseEntity<PlayerDTO> getPlayerById(@PathVariable String playerID) {
        log.debug("REST request to get Player : {}", playerID);
        Player player = playerRepository.findById(playerID);
        PlayerDTO PlayerDTO = playerMapper.toDto(player);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(PlayerDTO));
    }
}
