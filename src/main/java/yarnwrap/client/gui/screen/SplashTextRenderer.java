package yarnwrap.client.gui.screen;
public class SplashTextRenderer { public net.minecraft.client.gui.screen.SplashTextRenderer wrapperContained; public SplashTextRenderer(net.minecraft.client.gui.screen.SplashTextRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int TEXT_X() { return wrapperContained.TEXT_X; }
// public void TEXT_X(int value) { wrapperContained.TEXT_X = value; }
// public static int TEXT_X() { return net.minecraft.client.gui.screen.SplashTextRenderer.TEXT_X; }
// public static void TEXT_X(int value, ) { net.minecraft.client.gui.screen.SplashTextRenderer.TEXT_X = value; }

// public int TEXT_Y() { return wrapperContained.TEXT_Y; }
// public void TEXT_Y(int value) { wrapperContained.TEXT_Y = value; }
// public static int TEXT_Y() { return net.minecraft.client.gui.screen.SplashTextRenderer.TEXT_Y; }
// public static void TEXT_Y(int value, ) { net.minecraft.client.gui.screen.SplashTextRenderer.TEXT_Y = value; }

// public java.lang.String text() { return wrapperContained.text; }
// public void text(java.lang.String value) { wrapperContained.text = value; }
// public static java.lang.String text() { return net.minecraft.client.gui.screen.SplashTextRenderer.text; }
// public static void text(java.lang.String value, ) { net.minecraft.client.gui.screen.SplashTextRenderer.text = value; }

public SplashTextRenderer(java.lang.String text) { this.wrapperContained = new net.minecraft.client.gui.screen.SplashTextRenderer(text); }
public void render(yarnwrap.client.gui.DrawContext context,int screenWidth,yarnwrap.client.font.TextRenderer textRenderer,int alpha) { wrapperContained.render(context.wrapperContained,screenWidth,textRenderer.wrapperContained,alpha); }
// public static void render(yarnwrap.client.gui.DrawContext context,int screenWidth,yarnwrap.client.font.TextRenderer textRenderer,int alpha, ) { net.minecraft.client.gui.screen.SplashTextRenderer.render(context.wrapperContained,screenWidth,textRenderer.wrapperContained,alpha); }

}