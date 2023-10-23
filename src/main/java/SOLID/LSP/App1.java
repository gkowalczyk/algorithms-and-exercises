package SOLID.LSP;

import java.util.List;

public class App1 {
    public static void main(String[] args) {


        Informable informable;
        GaduSender gaduSender = new GaduSender();
        EmailSender emailSender = new EmailSender();

      informable = emailSender;
      informable.sendMessage(List.of("message1"));
      informable.sendCountMessage();

      informable = gaduSender;
      informable.sendCountMessage();
    }
}
