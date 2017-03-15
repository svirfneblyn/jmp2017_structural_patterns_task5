package flyweight;

/*flyweight*/
public class FliweightFunnyStyleBlog implements BloggerStyleFlyweight {

    public void getStyleForBlog(String blogName) {
        System.out.println("Selected funny style for " + blogName);
    }
}
