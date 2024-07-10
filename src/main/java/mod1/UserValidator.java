package mod1;

public class UserValidator {

    public boolean isHigherThan15(int age) {
        if (age >= 15) {
            System.out.println("OK");
            return true;
        } else {
            System.out.println("STOP");
            return false;
        }
    }

    public void validateSex(char sex) {
        if (sex == 'm') {
            System.out.println("male");
        } else if (sex == 'f') {
            System.out.println("female");
        } else {
            System.out.println("mistake");
        }
    }


    public static void main(String[] args) {
 int age= 14;
 char sex = 'm';

 UserValidator userValidator = new UserValidator();
  boolean moreThan15 = userValidator.isHigherThan15(age);

  if( moreThan15) {
      userValidator.validateSex(sex);
  }
        System.out.println("end ");
    }
}