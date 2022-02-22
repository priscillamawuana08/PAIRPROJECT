package bookingsystem.bookingsystem.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class AppUser {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String name;
private String username;
private String password;
@ManyToMany(fetch = FetchType.EAGER)
//This is used to load the AppUser with the Role to prevent loading them separately.
private Collection<Role> roles = new ArrayList<>();

    public AppUser(String name, String username, String password, Collection<Role> roles) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }
}
