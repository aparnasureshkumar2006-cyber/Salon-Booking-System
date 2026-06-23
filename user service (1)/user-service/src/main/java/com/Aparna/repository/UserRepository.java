package com.Aparna.repository;

import com.Aparna.model.User;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findById(SingularAttribute<AbstractPersistable, Serializable> id);
}
