package bookingsystem.bookingsystem.Service;

import bookingsystem.bookingsystem.Model.AppUser;
import bookingsystem.bookingsystem.Model.Role;
import bookingsystem.bookingsystem.Repo.RoleRepo;
import bookingsystem.bookingsystem.Repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
public class UserServiceImpl implements UserService{
private final UserRepo userRepo;
private final RoleRepo roleRepo;

    @Override
    public AppUser saveUser(AppUser user) {

        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {

        return roleRepo.save(role);
    }

    @Override
    public void addRoleToAppUser(String username, String roleName) {
        AppUser user = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public AppUser getUser(String username) {

        return userRepo.findByUsername(username);
    }

    @Override
    public List<AppUser> getUsers() {

        return userRepo.findAll();
    }
    @Override
    public Optional<AppUser> getUserById(Long id){
        return userRepo.findById(id);
    }
}
