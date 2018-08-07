package net.lecigne.training1.dao;

import org.springframework.data.repository.CrudRepository;

public interface CRUD<T> extends CrudRepository<T, Long> {
}
