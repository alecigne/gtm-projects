package ref.spring.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import ref.spring.model.Client;



/**
 * The implementation of  interface is not required It is generated
 * by Spring Data JPA Framework This interface is responsible for CRUD + custom
 * queries based on query methods and parameter name and types
 */
public interface DAO extends JpaRepository<Client, Integer>{

}
