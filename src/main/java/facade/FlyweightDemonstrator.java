package facade;

import flyweight.FlyweightStylesFactory;

/**
 * Created by Ihar_Rubanovich on 3/15/2017.
 */
public class FlyweightDemonstrator implements IPrinter {

    public void showPattern() {
        print("FLYWEIGHT");
        FlyweightStylesFactory flyweight =  FlyweightStylesFactory.getInstance();
        flyweight.getBlogerFlyweight("horror").getStyleForBlog("coolBlg");
        flyweight.getBlogerFlyweight("funny").getStyleForBlog("funnylBlg");
    }
}
