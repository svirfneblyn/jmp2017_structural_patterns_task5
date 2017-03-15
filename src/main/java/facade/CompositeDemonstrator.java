package facade;

import composite.FSManager;

import static flyweight.Constants.PATH_TO_SCAN;

/**
 * Created by Ihar_Rubanovich on 3/15/2017.
 */
public class CompositeDemonstrator implements IPrinter {

    public void showPattern(){
        print("COMPOSITE");
        FSManager fs = new FSManager();
        fs.compositDemo(PATH_TO_SCAN);
    }
}
