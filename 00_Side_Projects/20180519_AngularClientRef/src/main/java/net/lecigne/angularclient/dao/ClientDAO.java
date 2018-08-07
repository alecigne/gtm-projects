package net.lecigne.angularclient.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.lecigne.angularclient.model.Client;

@Repository
public interface ClientDAO extends JpaRepository<Client, Long>{

}
