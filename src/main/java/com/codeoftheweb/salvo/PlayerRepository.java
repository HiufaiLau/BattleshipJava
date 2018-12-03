package com.codeoftheweb.salvo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findByUserName(String userName);
    List<Player> findByEmail(String email);
    List<Player> findById(String id);

}
