package Practical.demo.Repository;

import Practical.demo.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client,Long> {
    Client findByFirstName(String Firstname);
}
