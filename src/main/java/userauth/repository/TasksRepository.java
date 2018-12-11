package userauth.repository;

import org.springframework.data.repository.CrudRepository;
import userauth.models.Tasks;

public interface TasksRepository extends CrudRepository<Tasks,String> {

}
