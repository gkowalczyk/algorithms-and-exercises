//trzecie zadanie to były związane z lotnictwem bo były dane w stopniach pod jakim kierunkiem leci samolot i
// na podstawie tego trzeba było napisać algorytm czy samolot leciał prosto, skręcał w prawo czy może w lewo
public class CheckDirectionOfFlight {

    public static final String LEFT = "LEFT";
    public static final String RIGHT = "RIGHT";
    public static final String STRAIGHT = "STRAIGHT";

    public static void main(String[] args) {
        System.out.println(calculateDirection(90, 300));
    }

    public static String calculateDirection(int startDirection, int endDirection) {

        int internalAngle = (startDirection - endDirection + 360) % 360;
        int externalAngle = (endDirection - startDirection + 360) % 360;
        System.out.println(internalAngle);
        System.out.println(externalAngle);

        if (internalAngle > externalAngle) {
            return RIGHT;
        } else if (externalAngle > internalAngle) {
            return LEFT;
        }
        return STRAIGHT;
    }
}


