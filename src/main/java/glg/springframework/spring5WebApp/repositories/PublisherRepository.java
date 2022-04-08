package glg.springframework.spring5WebApp.repositories;

import glg.springframework.spring5WebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author godhanigopal
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
