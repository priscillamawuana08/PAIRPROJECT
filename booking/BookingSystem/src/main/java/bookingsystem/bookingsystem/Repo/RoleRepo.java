package bookingsystem.bookingsystem.Repo;

import bookingsystem.bookingsystem.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
