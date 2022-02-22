package Practical.demo.Service;

import Practical.demo.Model.Client;
import Practical.demo.Repository.ClientRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service @RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{
    @Autowired
    private final ClientRepo clientRepo;

    @Override
    public Client saveClient(Client client) {
        return  clientRepo.save(client);
    }

    @Override
    public Client getClientFirstname(String firstName) {
        return clientRepo.findByFirstName(firstName);
    }

    @Override
    public List<Client> getClients() {
        return clientRepo.findAll();
    }
}
