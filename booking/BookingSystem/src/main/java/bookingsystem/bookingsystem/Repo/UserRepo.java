package bookingsystem.bookingsystem.Repo;

import bookingsystem.bookingsystem.Model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<AppUser,Long> {
    AppUser findByUsername(String username);
    Optional<AppUser> findById(Long id);
}

