import bridge.CrossingImpl;
import bridge.crosingtypes.PantoonCrossing;
import bridge.terraintocrosstypes.RiverCross;
import flyweight.BloggerStyleFlyweight;
import flyweight.FlyweightStylesFactory;

import static flyweight.Constants.FUNNY_STYLE;
import static flyweight.Constants.HORROR_STYLE;

/**
 * Created by Ihar_Rubanovich on 3/7/2017.
 */
public class Main {
    public static void main(String[] args) {
        /*BRIDGE Pattern Demo*/
        CrossingImpl cr = new RiverCross(new PantoonCrossing());
        cr.deploy();
        cr.undeploy();
        /*COMPOSITE PATTERN DEMO*/
      /*  FSManager fs= new FSManager();
        fs.compositDemo(PATH_TO_SCAN);*/
        /*FLYWEIGHT PATTERN DEMO*/
        FlyweightStylesFactory flStyleFactory = FlyweightStylesFactory.getInstance();
        BloggerStyleFlyweight bFunnyStyleFlyweight = flStyleFactory.getBlogerFlyweight(FUNNY_STYLE);
        bFunnyStyleFlyweight.getStyleForBlog("comedy BLOG");
        BloggerStyleFlyweight bHorrorStyleFlyweight = flStyleFactory.getBlogerFlyweight(HORROR_STYLE);
        bHorrorStyleFlyweight.getStyleForBlog("adult BLOG");

    }
}
