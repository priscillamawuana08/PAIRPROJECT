package Practical.demo.Controller;

import Practical.demo.Model.Client;
import Practical.demo.Service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ClientController {
private ClientService clientService;

    @GetMapping("/clients")
    public ResponseEntity<List<Client>> getClient(){
        return  ResponseEntity.ok().body(clientService.getClients());

    }
}
