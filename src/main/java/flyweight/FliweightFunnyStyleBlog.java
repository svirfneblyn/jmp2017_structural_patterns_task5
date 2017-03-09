package flyweight;

/**
 * Created by Ihar_Rubanovich on 3/9/2017.
 */
public class FliweightFunnyStyleBlog implements BloggerStyleFlyweight {

    @Override
    public void getStyleForBlog(String blogName) {
    System.out.println("Selected funny style for " + blogName);
    }
}
