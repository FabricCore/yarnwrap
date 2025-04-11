package yarnwrap.client.gui.screen;
public class SplashTextRenderer { public net.minecraft.client.gui.screen.SplashTextRenderer wrapperContained; public SplashTextRenderer(net.minecraft.client.gui.screen.SplashTextRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int TEXT_X() { return wrapperContained.TEXT_X; }
// public void TEXT_X(int value) { wrapperContained.TEXT_X = value; }
// public int TEXT_Y() { return wrapperContained.TEXT_Y; }
// public void TEXT_Y(int value) { wrapperContained.TEXT_Y = value; }
// public java.lang.String text() { return wrapperContained.text; }
// public void text(java.lang.String value) { wrapperContained.text = value; }
public void render(yarnwrap.client.gui.DrawContext context,int screenWidth,yarnwrap.client.font.TextRenderer textRenderer,int alpha) { wrapperContained.render(context.wrapperContained,screenWidth,textRenderer.wrapperContained,alpha); }

}