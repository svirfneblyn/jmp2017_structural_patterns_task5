package facade;

/**
 * Created by Ihar_Rubanovich on 3/15/2017.
 */
public interface IPrinter {

    void showPattern();

    default void print(String patternName) {
        System.out.println("-------------------" + patternName + " PATTERN DEMO ----------------------");
    }

}
