package flyweight;

/**
 * Created by Ihar_Rubanovich on 3/9/2017.
 */
public class FlyweightHorrorStyleBlog implements BloggerStyleFlyweight {

    public void getStyleForBlog(String blogName) {
     System.out.println("Selected horror style for " + blogName);
    }
}
