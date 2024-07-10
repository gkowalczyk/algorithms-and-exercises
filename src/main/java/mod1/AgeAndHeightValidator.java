package mod1;

import java.util.Optional;

import static java.util.Optional.ofNullable;


public class AgeAndHeightValidator {


    public Optional<User> validate(User user) {
        return ofNullable(user).filter(u -> {
            if (user.getAge() > 30 && user.getHeight() > 160) {

                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
            return true;
        });
    }

    public static void main(String[] args) {
        String name = "User";
        int age = 18;
        int height = 178;
        User user = new User("name", 18, 160);
        AgeAndHeightValidator ageAndHeightValidator = new AgeAndHeightValidator();
        ageAndHeightValidator.validate(user);
    }
}


