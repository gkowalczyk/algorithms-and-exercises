import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//
/*
Zadanie: Walidacja numeru telefonu

Opis:
Twoim zadaniem jest stworzenie aplikacji do walidacji numerów telefonów w języku Java. Aplikacja powinna przyjmować numer telefonu jako argument wejściowy i sprawdzać, czy jest on poprawny zgodnie z określonymi kryteriami.

Wymagania:
Metoda Walidacji: Stwórz metodę, która przyjmuje numer telefonu jako parametr i zwraca wartość logiczną (true/false) w zależności od poprawności numeru.
Sprawdzanie Warunków: Numer telefonu powinien spełniać następujące warunki:
Składać się z dokładnie 9 cyfr.
Może zawierać tylko cyfry od 0 do 9.

Przykład:
Dla numeru telefonu "123456789":
Wywołanie metody validatePhoneNumber("123456789") powinno zwrócić wartość true.
Dla numeru telefonu "9876543210":

Wywołanie metody validatePhoneNumber("9876543210") powinno zwrócić wartość false, ponieważ ten numer zawiera więcej niż 9 cyfr.

Dodatkowe punkty:
Obsługa różnych formatów numerów telefonów (np. uwzględnienie myślników, nawiasów, czy innych separatorów).
Zaimplementowanie prostego interfejsu użytkownika pozwalającego na wprowadzenie numeru telefonu i wyświetlenie wyniku walidacji.
Oczekiwane punkty:
Jakość kodu: Czy kod jest czytelny, dobrze sformatowany i zrozumiały?
Poprawność działania: Czy aplikacja poprawnie waliduje numery telefonów zgodnie z wymaganiami?
Elastyczność: Czy aplikacja obsługuje różne formaty numerów?

*/


public class ValidatePhoneNumber {

    static boolean validatePhoneNr(String number) {

        String digitCounter = number.replaceAll("\\D", "");

        if (digitCounter.length() != 9) {
            return false;
        }
        // Pattern pattern = Pattern.compile("[0-9]+");
        // Matcher matcher = pattern.matcher(number);
        //return matcher.matches();
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number to validation :");
        String number = scanner.nextLine();
        boolean isValid = validatePhoneNr(number);
        String response = isValid ? "OK" : "NOK";
        System.out.println(response);
        scanner.close();
    }
}
