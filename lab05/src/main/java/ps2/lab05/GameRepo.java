package ps2.lab05;

import org.springframework.data.repository.CrudRepository;

public interface GameRepo extends CrudRepository<Game, Long> {
    
}
