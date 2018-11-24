package tabletka.plus.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tabletka.plus.Entities.Person;

@Repository
public interface IPersonRepository extends CrudRepository<Person, Long> {
}
