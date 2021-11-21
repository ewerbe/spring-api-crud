package br.com.ewerbe.aplicacao_curso.repository;

import br.com.ewerbe.aplicacao_curso.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    User findByLogin(String username);
}
