package yarnwrap.client.gui.widget;
public class ScrollableTextWidget { public net.minecraft.client.gui.widget.ScrollableTextWidget wrapperContained; public ScrollableTextWidget(net.minecraft.client.gui.widget.ScrollableTextWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.gui.widget.ScrollableTextWidget.textRenderer); }
// public static void textRenderer(yarnwrap.client.font.TextRenderer value, ) { net.minecraft.client.gui.widget.ScrollableTextWidget.textRenderer = value.wrapperContained; }

// public yarnwrap.client.gui.widget.MultilineTextWidget wrapped() { return new yarnwrap.client.gui.widget.MultilineTextWidget(wrapperContained.wrapped); }
// public void wrapped(yarnwrap.client.gui.widget.MultilineTextWidget value) { wrapperContained.wrapped = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.MultilineTextWidget wrapped() { return new yarnwrap.client.gui.widget.MultilineTextWidget(net.minecraft.client.gui.widget.ScrollableTextWidget.wrapped); }
// public static void wrapped(yarnwrap.client.gui.widget.MultilineTextWidget value, ) { net.minecraft.client.gui.widget.ScrollableTextWidget.wrapped = value.wrapperContained; }

public ScrollableTextWidget(int x,int y,int width,int height,yarnwrap.text.Text message,yarnwrap.client.font.TextRenderer textRenderer) { this.wrapperContained = new net.minecraft.client.gui.widget.ScrollableTextWidget(x,y,width,height,message.wrapperContained,textRenderer.wrapperContained); }
public yarnwrap.client.gui.widget.ScrollableTextWidget textColor(int textColor) { return new yarnwrap.client.gui.widget.ScrollableTextWidget(wrapperContained.textColor(textColor)); }
// public static yarnwrap.client.gui.widget.ScrollableTextWidget textColor(int textColor, ) { return new yarnwrap.client.gui.widget.ScrollableTextWidget(net.minecraft.client.gui.widget.ScrollableTextWidget.textColor(textColor)); }
public boolean textOverflows() { return wrapperContained.textOverflows(); }
// public static boolean textOverflows() { return net.minecraft.client.gui.widget.ScrollableTextWidget.textOverflows(); }

}