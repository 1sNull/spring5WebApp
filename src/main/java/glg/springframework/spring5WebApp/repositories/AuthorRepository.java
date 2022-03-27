package glg.springframework.spring5WebApp.repositories;

import glg.springframework.spring5WebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author godhanigopal
 */
public interface AuthorRepository extends CrudRepository<Author,Long> {

}
