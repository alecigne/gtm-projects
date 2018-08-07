package net.lecigne.training1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.lecigne.training1.model.Client;

public interface AutoClientDao extends JpaRepository<Client, Long> {

}
