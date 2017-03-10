package flyweight;

/*flyweight*/
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
