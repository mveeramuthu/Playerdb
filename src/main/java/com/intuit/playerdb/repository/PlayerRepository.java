package com.intuit.playerdb.repository;

import com.intuit.playerdb.domain.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data MongoDB repository for the {@link Player} entity.
 */
@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {
    Player findByPlayerID(String playerID);
}
