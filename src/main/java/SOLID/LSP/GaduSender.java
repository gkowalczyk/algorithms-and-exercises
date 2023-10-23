package SOLID.LSP;

import java.util.List;

public class GaduSender implements Informable {
    @Override
    public int sendCountMessage() {
        //throw new IllegalArgumentException();  musimy zachować kontrakt interfejsu i zwracać właściwy typ
        return 1;
    }

    @Override
    public void sendMessage(List<String> message) {

    }
}
