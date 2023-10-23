package SOLID.LSP;

import java.util.List;

public interface Informable {
    int sendCountMessage();
    void sendMessage(List<String> message);
}
