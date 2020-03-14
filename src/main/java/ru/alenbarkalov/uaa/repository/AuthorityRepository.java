package ru.alenbarkalov.uaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alenbarkalov.uaa.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
