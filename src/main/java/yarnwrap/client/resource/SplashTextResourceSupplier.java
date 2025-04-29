package yarnwrap.client.resource;
public class SplashTextResourceSupplier { public net.minecraft.client.resource.SplashTextResourceSupplier wrapperContained; public SplashTextResourceSupplier(net.minecraft.client.resource.SplashTextResourceSupplier wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier RESOURCE_ID() { return new yarnwrap.util.Identifier(wrapperContained.RESOURCE_ID); }
// public void RESOURCE_ID(yarnwrap.util.Identifier value) { wrapperContained.RESOURCE_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier RESOURCE_ID() { return new yarnwrap.util.Identifier(net.minecraft.client.resource.SplashTextResourceSupplier.RESOURCE_ID); }
// public static void RESOURCE_ID(yarnwrap.util.Identifier value, ) { net.minecraft.client.resource.SplashTextResourceSupplier.RESOURCE_ID = value.wrapperContained; }

// public yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(wrapperContained.RANDOM); }
// public void RANDOM(yarnwrap.util.math.random.Random value) { wrapperContained.RANDOM = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(net.minecraft.client.resource.SplashTextResourceSupplier.RANDOM); }
// public static void RANDOM(yarnwrap.util.math.random.Random value, ) { net.minecraft.client.resource.SplashTextResourceSupplier.RANDOM = value.wrapperContained; }

// public java.util.List splashTexts() { return wrapperContained.splashTexts; }
// public void splashTexts(java.util.List value) { wrapperContained.splashTexts = value; }
// public static java.util.List splashTexts() { return net.minecraft.client.resource.SplashTextResourceSupplier.splashTexts; }
// public static void splashTexts(java.util.List value, ) { net.minecraft.client.resource.SplashTextResourceSupplier.splashTexts = value; }

// public yarnwrap.client.session.Session session() { return new yarnwrap.client.session.Session(wrapperContained.session); }
// public void session(yarnwrap.client.session.Session value) { wrapperContained.session = value.wrapperContained; }
// public static yarnwrap.client.session.Session session() { return new yarnwrap.client.session.Session(net.minecraft.client.resource.SplashTextResourceSupplier.session); }
// public static void session(yarnwrap.client.session.Session value, ) { net.minecraft.client.resource.SplashTextResourceSupplier.session = value.wrapperContained; }

public SplashTextResourceSupplier(yarnwrap.client.session.Session session) { this.wrapperContained = new net.minecraft.client.resource.SplashTextResourceSupplier(session.wrapperContained); }
public yarnwrap.client.gui.screen.SplashTextRenderer get() { return new yarnwrap.client.gui.screen.SplashTextRenderer(wrapperContained.get()); }
// public static yarnwrap.client.gui.screen.SplashTextRenderer get() { return new yarnwrap.client.gui.screen.SplashTextRenderer(net.minecraft.client.resource.SplashTextResourceSupplier.get()); }
// public boolean method_18664(java.lang.String splashText) { return wrapperContained.method_18664(splashText); }
// public static boolean method_18664(java.lang.String splashText, ) { return net.minecraft.client.resource.SplashTextResourceSupplier.method_18664(splashText); }

}