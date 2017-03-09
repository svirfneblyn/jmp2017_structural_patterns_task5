package flyweight;

/**
 * Created by Ihar_Rubanovich on 3/9/2017.
 */
public enum StyleTypesEnum {
    HORROR_STYLE {
    public BloggerStyleFlyweight getInstance(){
        return new FlyweightHorrorStyleBlog();
    }
    },
    FUNNY_STYLE {
        public BloggerStyleFlyweight getInstance() {
            return new FliweightFunnyStyleBlog();
        }
    };
    public abstract BloggerStyleFlyweight getInstance();
}
