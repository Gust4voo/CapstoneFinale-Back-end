package com.gustavo.pacchetto_sicurezza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.pacchetto_sicurezza.entity.ERole;
import com.gustavo.pacchetto_sicurezza.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
