package recruitmentTask;

import org.springframework.stereotype.Repository;

@Repository
public class ClientRepository{
public boolean existsById(Long id) {
        return false;
    }

    public void activateClient(Long id) {
    }
}
