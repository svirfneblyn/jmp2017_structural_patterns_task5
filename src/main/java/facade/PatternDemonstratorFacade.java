package facade;

/*facade*/
public class PatternDemonstratorFacade {

    public void showBridgePat() {
        BridgeDemonstrator showBridge = new BridgeDemonstrator();
        showBridge.showPattern();
    }

    public void showAdapterPat() {
        AdapterDemonstrator showAdapter = new AdapterDemonstrator();
        showAdapter.showPattern();
    }

    public void showCompositePat() {
        CompositeDemonstrator showComposite = new CompositeDemonstrator();
        showComposite.showPattern();
    }

    public void showDecoratorPat() {
        DecoratorDemonstrator showDecorator = new DecoratorDemonstrator();
        showDecorator.showPattern();
    }

    public void showFlyweightPat() {
        FlyweightDemonstrator showFlyweight = new FlyweightDemonstrator();
        showFlyweight.showPattern();
    }
}
