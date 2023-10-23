package SOLID.LSP;

import java.util.List;

public class EmailSender implements Informable{
    @Override
    public int sendCountMessage() {
        return 0;
    }

    @Override
    public void sendMessage(List<String> message) {
        System.out.println(message);
    }
}
