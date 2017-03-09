package flyweight;

import java.util.HashMap;
import java.util.Map;

import static flyweight.Constants.FUNNY_STYLE;
import static flyweight.Constants.HORROR_STYLE;

/**
 * Created by Ihar_Rubanovich on 3/9/2017.
 */
public class FlyweightStylesFactory {
    private static volatile FlyweightStylesFactory flyweightStylesFactory;
    private Map<String, BloggerStyleFlyweight> bStyleFlyweightMap;
     /*init pool BloggerStyleFlyweight */
    private FlyweightStylesFactory() {
        this.bStyleFlyweightMap = new HashMap<String, BloggerStyleFlyweight>();
    }
       /*Fleiweight fabrique Method*/
    public BloggerStyleFlyweight getBlogerFlyweight(String key) {
        if (bStyleFlyweightMap.containsKey(key)) {
            return bStyleFlyweightMap.get(key);
        } else {
            BloggerStyleFlyweight bStyleFlyweight = null;
            if (key.equals(HORROR_STYLE)) {
                bStyleFlyweight = getAction(StyleTypesEnum.HORROR_STYLE);
            }
            if (key.equals(FUNNY_STYLE)) {
                bStyleFlyweight = getAction(StyleTypesEnum.FUNNY_STYLE);
            }
            bStyleFlyweightMap.put(key, bStyleFlyweight);
            return bStyleFlyweight;
        }
    }

    private  BloggerStyleFlyweight getAction(StyleTypesEnum action)
    {
        return action.getInstance();
    }

    public static FlyweightStylesFactory getInstance() {
        if (flyweightStylesFactory == null) {
            synchronized (FlyweightStylesFactory.class) {
                if (flyweightStylesFactory == null) {
                    return new FlyweightStylesFactory();
                }
            }
        }
        return flyweightStylesFactory;
    }
}
