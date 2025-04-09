package yarnwrap.client.resource;
public class SplashTextResourceSupplier { public net.minecraft.client.resource.SplashTextResourceSupplier wrapperContained; public SplashTextResourceSupplier(net.minecraft.client.resource.SplashTextResourceSupplier wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier RESOURCE_ID() { return new yarnwrap.util.Identifier(wrapperContained.RESOURCE_ID); }
// public yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(wrapperContained.RANDOM); }
// public java.util.List splashTexts() { return wrapperContained.splashTexts; }
// public yarnwrap.client.session.Session session() { return new yarnwrap.client.session.Session(wrapperContained.session); }
public yarnwrap.client.gui.screen.SplashTextRenderer get() { return new yarnwrap.client.gui.screen.SplashTextRenderer(wrapperContained.get()); }

}