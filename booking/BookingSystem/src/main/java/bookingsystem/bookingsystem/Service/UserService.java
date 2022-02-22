package bookingsystem.bookingsystem.Service;

import bookingsystem.bookingsystem.Model.AppUser;
import bookingsystem.bookingsystem.Model.Role;

import java.util.List;
import java.util.Optional;

public interface UserService {
    //Defining what to do
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToAppUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
    Optional<AppUser>  getUserById(Long id);
}
