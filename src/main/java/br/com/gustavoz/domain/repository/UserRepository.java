package br.com.gustavoz.domain.repository;

import br.com.gustavoz.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}