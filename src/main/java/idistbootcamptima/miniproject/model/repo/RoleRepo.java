package idistbootcamptima.miniproject.model.repo;

import idistbootcamptima.miniproject.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
