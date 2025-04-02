package ps2.lab06; 

import org.springframework.data.repository.CrudRepository;

public interface ProfessorRepo extends CrudRepository<Professor, Long> {

}