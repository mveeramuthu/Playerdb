package com.intuit.playerdb.repository;

import com.intuit.playerdb.domain.Player;
import com.intuit.playerdb.domain.User;
import com.intuit.playerdb.service.mapper.PlayerMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data MongoDB repository for the {@link User} entity.
 */
@Repository
public interface PlayerRepository extends MongoRepository<PlayerRepository, PlayerMapper> {
    Player findById(Long playerId);
}
