import facade.PatternDemonstrator;


public class Main {
    public static void main(String[] args) {
        /*FACADE PATTERN*/
        PatternDemonstrator pd = new PatternDemonstrator();
        /*ADAPTER PATTERN*/
        pd.showAdapterPat();
        /*BRIDGE PATTERN*/
        pd.showBridgePat();
        /*COMPOSITE PATTERN*/
        pd.showCompositePat();
        /*FLYWEIGHT PATTERN*/
        pd.showFlyweightPat();
        /*DECORATOR PATTERN*/
        pd.showDecoratorPat();
    }
}
