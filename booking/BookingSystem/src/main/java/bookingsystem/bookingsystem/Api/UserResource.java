package bookingsystem.bookingsystem.Api;

import bookingsystem.bookingsystem.Model.AppUser;
import bookingsystem.bookingsystem.Model.Role;
import bookingsystem.bookingsystem.Service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController @RequiredArgsConstructor
@RequestMapping("/api")
public class UserResource {
private final UserService userService;

@GetMapping("/users")
    public ResponseEntity<List<AppUser>>getUsers(){
        return  ResponseEntity.ok().body(userService.getUsers());

    }
    @PostMapping("/user/save")
    public ResponseEntity<AppUser>saveUser(@RequestBody AppUser user){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
        return  ResponseEntity.created(uri).body(userService.saveUser(user));
    }

    @PostMapping("/role/save")
    public ResponseEntity<Role>saveRole(@RequestBody Role role){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/role/save").toUriString());
        return  ResponseEntity.created(uri).body(userService.saveRole(role));
    }

    @PostMapping("/role/addToUser")
    public ResponseEntity<?>addRoleToUser(@RequestBody RoleToUserForm form){
        userService.addRoleToAppUser(form.getUsername(), form.getRoleName());
        return  ResponseEntity.ok().build();
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<Optional<AppUser>>getUserById(@PathVariable Long id){
        return new ResponseEntity<>(userService.getUserById(id),HttpStatus.OK);
    }
}
@Data
class RoleToUserForm{
    private String username;
    private String roleName;
}
