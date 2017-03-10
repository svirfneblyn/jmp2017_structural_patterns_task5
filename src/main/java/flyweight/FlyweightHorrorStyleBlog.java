package flyweight;

/*flyweight*/
public class FlyweightHorrorStyleBlog implements BloggerStyleFlyweight {
    public void getStyleForBlog(String blogName) {
     System.out.println("Selected horror style for " + blogName);
    }
}
