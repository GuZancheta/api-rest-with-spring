package br.com.gustavoz.domain.repository;

import br.com.gustavoz.domain.model.UserBank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserBank, Long> {

    boolean existsByAccountNumber(String accountNumber);
}