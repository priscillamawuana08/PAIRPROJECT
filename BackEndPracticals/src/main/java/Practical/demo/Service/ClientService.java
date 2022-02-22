package Practical.demo.Service;

import Practical.demo.Model.Client;

import java.util.List;

public interface ClientService {
    Client saveClient(Client client);
    Client getClientFirstname(String firstName);
    List<Client> getClients();
}
