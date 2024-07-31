package recruitmentTask;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientRepository clientRepository;
    private final SomeRemoteMicroserviceFeignClient someRemoteMicroserviceFeignClient;

    public ClientController(ClientRepository clientRepository, SomeRemoteMicroserviceFeignClient someRemoteMicroserviceFeignClient) {
        this.clientRepository = clientRepository;
        this.someRemoteMicroserviceFeignClient = someRemoteMicroserviceFeignClient;
    }

    @GetMapping("/{id}/active")
    public ResponseEntity<Void> activeClient(@PathVariable Long id) {
        try {
            if (!clientRepository.existsById(id)) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            someRemoteMicroserviceFeignClient.activateClient(id);
            clientRepository.activateClient(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
}
