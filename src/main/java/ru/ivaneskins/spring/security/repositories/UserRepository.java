package ru.ivaneskins.spring.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ivaneskins.spring.security.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
