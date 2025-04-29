package yarnwrap.client.gui.widget;
public class PressableWidget { public net.minecraft.client.gui.widget.PressableWidget wrapperContained; public PressableWidget(net.minecraft.client.gui.widget.PressableWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.ButtonTextures TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.TEXTURES); }
// public void TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value) { wrapperContained.TEXTURES = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.ButtonTextures TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(net.minecraft.client.gui.widget.PressableWidget.TEXTURES); }
// public static void TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value, ) { net.minecraft.client.gui.widget.PressableWidget.TEXTURES = value.wrapperContained; }

public void onPress() { wrapperContained.onPress(); }
// public static void onPress() { net.minecraft.client.gui.widget.PressableWidget.onPress(); }
public void drawMessage(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,int color) { wrapperContained.drawMessage(context.wrapperContained,textRenderer.wrapperContained,color); }
// public static void drawMessage(yarnwrap.client.gui.DrawContext context,yarnwrap.client.font.TextRenderer textRenderer,int color, ) { net.minecraft.client.gui.widget.PressableWidget.drawMessage(context.wrapperContained,textRenderer.wrapperContained,color); }

}